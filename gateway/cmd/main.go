package main

import (
	"flag"
	"gateway"
	"github.com/SamuelTJackson/fiware-manager/utils"
	"github.com/gorilla/mux"
	log "github.com/sirupsen/logrus"
)

const port = "8080"
type Config struct {
	Port int
}
func main()  {
	var configurationPath string
	flag.StringVar(&configurationPath, "config", "/app/config.toml", "Path for the configuration file.")
	flag.Parse()
	confs := Config{}
	if err := utils.GetConfigs(configurationPath, &confs); err != nil {
		panic(err)
	}
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