package main

import (
	"fmt"
	"gateway"
	"github.com/SamuelTJackson/fiware-manager/proto"
	"github.com/SamuelTJackson/fiware-manager/utils"
	"github.com/gorilla/mux"
	log "github.com/sirupsen/logrus"
)

func main()  {
	confs, err := utils.GetConfigs()
	if err != nil {
		panic(err)
	}
	serviceGroupConn, err := utils.NewGrpcConn(fmt.Sprintf("%s:%d", confs.ServiceGroup.Host, confs.ServiceGroup.Port),
		"serviceGroups")
	if err != nil {
		panic(err)
	}
	server := gateway.Server{
		Config: confs,
		ServiceGroupsClient: proto.NewServiceGroupsServiceClient(serviceGroupConn),
	}
	router := mux.NewRouter()
	apiRouter := router.PathPrefix("/v1").Subrouter()
	gateway.GetV1Routes(apiRouter, server)
	gateway.GetReactRoutes(router)
	srv := gateway.NewServer(router, confs.Gateway.Port)
	log.Infof("[server.go Start] start listening on port %d", confs.Gateway.Port)
	if err := srv.ListenAndServe(); err != nil {
		log.Error(err)
	}
}