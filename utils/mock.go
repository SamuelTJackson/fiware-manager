package utils

import (
	"encoding/json"
	"fmt"
	"net/http"
)

type serviceGroup struct {
	Count    int       `json:"count"`
	Services []service `json:"services"`
}

type iotError struct {
	Name    string `json:"name"`
	Message string `json:"message"`
}
type service struct {
	Commands           []interface{} `json:"commands"`
	Lazy               []interface{} `json:"lazy"`
	Attributes         []interface{} `json:"attributes"`
	ID                 string        `json:"_id"`
	Resource           string        `json:"resource"`
	Apikey             string        `json:"apikey"`
	Service            string        `json:"service"`
	Subservice         string        `json:"subservice"`
	V                  int           `json:"__v"`
	StaticAttributes   []interface{} `json:"static_attributes"`
	InternalAttributes []interface{} `json:"internal_attributes"`
}

var services []service

const (
	noFiwareHeaders = "{\"name\":\"MISSING_HEADERS\",\"message\":\"Some headers were missing from the request: [\\\"fiware-service\\\",\\\"fiware-servicepath\\\"]\"}"
)

func StartIotServer(port int) {
	http.HandleFunc("/iot/services", func(writer http.ResponseWriter, request *http.Request) {
		fiwareService := request.Header.Get("fiware-service")
		fiwareServicePath := request.Header.Get("fiware-servicePath")
		if len(fiwareService) == 0 || len(fiwareServicePath) == 0 {
			writer.Header().Add("Content-Type", "application/json")
			writer.WriteHeader(http.StatusBadRequest)
			writer.Write([]byte(noFiwareHeaders))
			return

		}
		//query := request.URL.Query()
		switch request.Method {
		case http.MethodGet:
			b, err := json.Marshal(&serviceGroup{
				Count:    len(services),
				Services: services,
			})
			if err != nil {
				panic(err)
			}
			writer.Write(b)
			writer.WriteHeader(http.StatusOK)

		case http.MethodPost:
			var newServiceGroup service
			if err := json.NewDecoder(request.Body).Decode(&newServiceGroup); err != nil {
				panic(err)
			}
			services = append(services, newServiceGroup)
			writer.WriteHeader(http.StatusOK)
			return
		case http.MethodPut:
			fmt.Println("Put")
		case http.MethodDelete:
			fmt.Println("Delete")
		}
	})
	http.ListenAndServe(fmt.Sprintf(":%d", port), nil)
}