package handler

import (
	log "github.com/sirupsen/logrus"
	"net/http"
)

type appHandler func(http.ResponseWriter, *http.Request) (int, error)
func (fn appHandler) ServeHTTP(w http.ResponseWriter, r *http.Request) {
	if status, err := fn(w, r); err != nil {
		log.Printf("HTTP %d: %v", status, err)
		switch status {
		case http.StatusNotFound:
			http.NotFound(w, r)
		case http.StatusInternalServerError:
			http.Error(w, err.Error(), http.StatusInternalServerError)
		default:
			http.Error(w, err.Error(), http.StatusInternalServerError)
		}
	}
}
