package gateway

import (
	"context"
	"encoding/json"
	"github.com/SamuelTJackson/fiware-manager/proto"
	"net/http"
)
type IotAgentRegistrationMessage struct {
	Protocol    string `json:"protocol"`
	Description string `json:"description"`
	Iotagent    string `json:"iotagent"`
	Resource    string `json:"resource"`
	Services    []struct {
		Apikey           string        `json:"apikey"`
		Resource         string        `json:"resource"`
		Service          string        `json:"service"`
		ServicePath      string        `json:"service_path"`
		Attributes       []interface{} `json:"attributes"`
		StaticAttributes []interface{} `json:"static_attributes"`
	} `json:"services"`
}
func (s Server) RegisterIotAgents(writer http.ResponseWriter, request *http.Request) (int, error) {
	registration :=  IotAgentRegistrationMessage{}
	if err := json.NewDecoder(request.Body).Decode(&registration); err != nil {
		return http.StatusInternalServerError, err
	}
	if _, err := s.IotAgentClient.AddIotAgent(context.Background(), &proto.AddIotAgentRequest{IotAgent: &proto.IotAgent{
		Host:        registration.Iotagent,
		Protocol:   registration.Protocol,
		Description: registration.Description,
		Resource:    registration.Resource,
	}}); err != nil {
		return http.StatusInternalServerError, err
	}
	return http.StatusOK, nil
}
func (s Server) GetIotAgents(writer http.ResponseWriter, request *http.Request) (int, error) {
	list, err := s.IotAgentClient.ListIotAgents(context.Background(), nil)
	if err != nil {
		return http.StatusInternalServerError, err
	}
	b, err := json.Marshal(list.IotAgent)
	if err != nil {
		return http.StatusInternalServerError, err
	}
	if _, err := writer.Write(b); err != nil {
		return http.StatusInternalServerError, err
	}
	return http.StatusOK, nil
}
