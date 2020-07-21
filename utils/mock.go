package utils

import (
	"fmt"
	"net/http"
	"strings"
)

var services []string

func startIotServer(port int) {
	http.HandleFunc("/iot/services", func(writer http.ResponseWriter, request *http.Request) {
		query := request.URL.Query()
		switch request.Method {
		case http.MethodGet:
			b := []byte(fmt.Sprintf("[%s]", strings.Join(services,",")))
			writer.Write(b)
			writer.WriteHeader(http.StatusOK)
		case http.MethodPost:
			fmt.Println("Post")
		case http.MethodPut:
			fmt.Println("Put")
		case http.MethodDelete:
			fmt.Println("Delete")
		}

	})
	http.ListenAndServe(fmt.Sprintf(":%d", port), nil)

}
