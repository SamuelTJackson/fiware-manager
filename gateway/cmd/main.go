package main

import (
	"gateway"
	"github.com/gorilla/mux"
	log "github.com/sirupsen/logrus"
)

const port = "8080"
func main()  {
	server := gateway.Server{}
	router := mux.NewRouter()
	//proto.NewServiceGroupsServiceClient()
	apiRouter := router.PathPrefix("/v1").Subrouter()
	gateway.GetV1Routes(apiRouter, server)
	gateway.GetReactRoutes(router)
	srv := gateway.NewServer(router)
	log.Info("[server.go Start] start listening on port " + port)
	if err := srv.ListenAndServe(); err != nil {
		log.Error(err)
	}
}