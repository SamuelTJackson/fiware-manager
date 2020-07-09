package main

import (
	"gateway/handler"
	"github.com/gorilla/mux"
	log "github.com/sirupsen/logrus"
)

const port = "8080"
func main()  {
	router := mux.NewRouter()
	apiRouter := router.PathPrefix("/v1").Subrouter()
	handler.GetV1Routes(apiRouter, nil)
	handler.GetReactRoutes(router)
	srv := handler.NewServer(router)
	log.Info("[server.go Start] start listening on port " + port)
	if err := srv.ListenAndServe(); err != nil {
		log.Error(err)
	}
}