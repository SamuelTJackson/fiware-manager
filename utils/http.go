package utils

import (
	"bytes"
	"context"
	"net/http"
)

func CreateFiwareRequest(ctx context.Context, url string, method string, body []byte) (*http.Request, error){
	req, err := http.NewRequest(method, url, bytes.NewBuffer(body))
	if err != nil {
		return nil, err
	}

	values, ok := ctx.Value("values").(map[string]string)
	if !ok {
		req.Header.Set("fiware-servicepath","/")
		req.Header.Set("fiware-service", "")
		return req, nil
	}
	if fiwareService, ok := values["fiwareservice"]; ok {
		req.Header.Set("fiware-service", fiwareService)
	} else {
		req.Header.Set("fiware-service", "")
	}
	if fiwareServicePath, ok := values["fiwareservicePath"]; ok {
		req.Header.Set("fiware-servicepath", fiwareServicePath)
	} else {
		req.Header.Set("fiware-servicepath","/")
	}

	return req, nil
}
func CreateContext(request *http.Request) context.Context {
	fiwareService := request.Header.Get("fiware-service")
	fiwareServicePath := request.Header.Get("fiware-serviicepath")

	if fiwareServicePath == "" {
		fiwareServicePath = "/"
	}
	return context.WithValue(context.Background(), "values", map[string]string{
		"fiware-service" : fiwareService,
		"fiware-servicepath" : fiwareServicePath,
	})
}