package main

import (
	"gateway"
	"github.com/SamuelTJackson/fiware-manager/proto"
	"github.com/SamuelTJackson/fiware-manager/utils"
	"github.com/gorilla/mux"
	log "github.com/sirupsen/logrus"
)

const port = "8080"
func main()  {
	conn, err := utils.NewGrpcConn("localhost:9090", "serviceGroups")
	if err != nil {
		panic(err)
	}
	server := gateway.Server{
		ServiceGroupsClient: proto.NewServiceGroupsServiceClient(conn),
	}
	router := mux.NewRouter()
	apiRouter := router.PathPrefix("/v1").Subrouter()
	gateway.GetV1Routes(apiRouter, server)
	gateway.GetReactRoutes(router)
	srv := gateway.NewServer(router)
	log.Info("[server.go Start] start listening on port " + port)
	if err := srv.ListenAndServe(); err != nil {
		log.Error(err)
	}
}