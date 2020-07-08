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
	if fiwareService, ok := ctx.Value("fiwareservice").(string); ok {
		req.Header.Set("fiware-service", fiwareService)
	} else {
		req.Header.Set("fiware-service", "")
	}
	if fiwareServicePath, ok := ctx.Value("fiwareservicePath").(string); ok {
		req.Header.Set("fiware-servicepath", fiwareServicePath)
	} else {
		req.Header.Set("fiware-servicepath","/")
	}

	return req, nil
}