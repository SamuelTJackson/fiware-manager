package handler

import (
	"gateway"
	"github.com/gorilla/mux"
	"net/http"
	"time"
)

func GetV1Routes(router *mux.Router, app gateway.Application) {
	router.Handle("/serviceGroups",  appHandler(app.GetServiceGroup)).Methods(http.MethodGet).
		Queries("id","{id}")
	router.Handle("/serviceGroups",  appHandler(app.GetServiceGroups)).Methods(http.MethodGet)
	router.Handle("/serviceGroups", appHandler(app.CreateServiceGroup)).Methods(http.MethodPost)
	router.Handle("/serviceGroups", appHandler(app.UpdateServiceGroup)).Methods(http.MethodPut).
		Queries("id","{id}")
	router.Handle("/serviceGroups", appHandler(app.DeleteServiceGroup)).Methods(http.MethodDelete).
		Queries("resource","{resource}","key","{key}")

	router.Handle("/Devices", appHandler(app.GetDevices)).Methods(http.MethodGet).
		Queries("id","{id}")
	router.Handle("/Devices", appHandler(app.GetDevices)).Methods(http.MethodGet)
	router.Handle("/Devices", appHandler(app.CreateDevice)).Methods(http.MethodPost)
	router.Handle("/Devices", appHandler(app.UpdateDevice)).Methods(http.MethodPut).
		Queries("id","{id}")
	router.Handle("/Devices", appHandler(app.DeleteDevice)).Methods(http.MethodDelete).
		Queries("id","{id}")
	router.Handle("/iotagents", appHandler(app.RegisterIotAgents)).Methods(http.MethodPost)
	router.Handle("/iotagents", appHandler(app.GetIotAgents)).Methods(http.MethodGet)
	router.Handle("/ws", appHandler(app.WebsocketHandler))
	router.Handle("/login", appHandler(app.LoginHandler)).Methods(http.MethodPost)
	router.Handle("/logout", appHandler(app.LogoutHandler)).Methods(http.MethodGet)
	router.Handle("/user", appHandler(app.UserInformation)).Methods(http.MethodGet)
	router.Handle("/chirpstackKey", appHandler(app.UpdateLoraKey)).Methods(http.MethodPost)
	router.Handle("/chirpstackKey", appHandler(app.GetLoraKey)).Methods(http.MethodGet)
	router.Handle("/chirpstack/organizations", appHandler(app.GetChirpstackOrganizations)).Methods(http.MethodGet)
	router.Handle("/chirpstack/applications", appHandler(app.GetChirpstackApplications)).Methods(http.MethodGet)
	router.Handle("/chirpstack/devices/{id:[0-9]+}", appHandler(app.GetChirpstackDevicesInApp)).Methods(http.MethodGet)
	router.Handle("/chirpstack/gateways/{id:[0-9]+}", appHandler(app.GetChirpstackGatewaysInOrganization)).Methods(http.MethodGet)
	router.Handle("/orion", appHandler(app.GetOrionEntities)).Methods(http.MethodGet).Queries("idPattern", "{idPattern}")
	router.Handle("/orion/{id}", appHandler(app.GetOrionEntity)).Methods(http.MethodGet)
}

func GetReactRoutes(router *mux.Router) {
	buildHandler := http.FileServer(http.Dir("./ui/build"))
	router.PathPrefix("/").Handler(buildHandler)
	staticHandler := http.StripPrefix("/static/", http.FileServer(http.Dir("./ui/build/static")))
	router.PathPrefix("/static/").Handler(staticHandler)
}
const port = "8080"
func NewServer(router *mux.Router) *http.Server {
	return &http.Server{
		Addr: "0.0.0.0:" + port,
		// Good practice to set timeouts to avoid slowloris attacks.
		WriteTimeout: time.Second * 15,
		ReadTimeout:  time.Second * 15,
		IdleTimeout:  time.Second * 60,
		Handler:      router, // Pass our instance of gorilla/mux in.
	}

}