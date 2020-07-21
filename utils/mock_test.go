package utils

import (
	"io/ioutil"
	"net/http"
	"testing"
)

func TestStartIotServer(t *testing.T) {
	go StartIotServer(9090)
	resp, err := http.Get("http://localhost:9090/iot/services")
	if err != nil {
		t.Error(err)
	}
	defer resp.Body.Close()
	if resp.StatusCode != http.StatusBadRequest {
		t.Errorf("status code should be %d but was %d", http.StatusBadRequest, resp.StatusCode)
	}
	errorResponse, err := ioutil.ReadAll(resp.Body)
	if err != nil {
		t.Error(err)
	}
	if string(errorResponse) != noFiwareHeaders {
		t.Errorf("response body should be %s but was %s", noFiwareHeaders, string(errorResponse))
	}

}
