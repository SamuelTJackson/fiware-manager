package handler

import (
	"encoding/json"
	"github.com/SamuelTJackson/fiware-manager/proto"
	"github.com/SamuelTJackson/fiware-manager/utils"
	google_protobuf1 "github.com/golang/protobuf/ptypes/empty"
	google_protobuf2 "github.com/golang/protobuf/ptypes/wrappers"
	"github.com/gorilla/mux"
	"net/http"
)

func (s Server) GetServiceGroups(writer http.ResponseWriter, request *http.Request) (int, error) {
	ctx := utils.CreateContext(request)
	services, err := s.serviceGroupsClient.ListServiceGroups(ctx, &google_protobuf1.Empty{})
	if err != nil {
		return http.StatusNoContent, err
	}
	payload, err := json.Marshal(services)
	if err != nil {
		return http.StatusInternalServerError, err
	}
	_, err = writer.Write(payload)
	if err != nil {
		return http.StatusInternalServerError, err
	}
	return http.StatusOK, nil
}

func (s Server) GetServiceGroup(writer http.ResponseWriter, request *http.Request) (int, error) {
	ctx := utils.CreateContext(request)
	id := mux.Vars(request)["id"]
	services, err := s.serviceGroupsClient.ServiceGroup(ctx, &google_protobuf2.StringValue{Value: id} )
	if err != nil {
		return http.StatusNoContent, err
	}
	payload, err := json.Marshal(services)
	if err != nil {
		return http.StatusInternalServerError, err
	}
	_, err = writer.Write(payload)
	if err != nil {
		return http.StatusInternalServerError, err
	}
	return http.StatusOK, nil
}

func (s Server) CreateServiceGroup(_ http.ResponseWriter, request *http.Request) (int, error) {
	ctx := utils.CreateContext(request)
	serviceGroup := &proto.ServiceGroup{}
	if err := json.NewDecoder(request.Body).Decode(serviceGroup); err != nil {
		return http.StatusInternalServerError, err
	}
	_, err := s.serviceGroupsClient.CreateServiceGroup(ctx, &proto.CreateServiceGroupRequest{ServiceGroup: serviceGroup})
	if err != nil {
		return http.StatusInternalServerError, err
	}
	return http.StatusOK, nil
}

func (s Server) UpdateServiceGroup(_ http.ResponseWriter, request *http.Request) (int, error) {
	ctx := utils.CreateContext(request)
	group := &proto.ServiceGroup{}
	if err := json.NewDecoder(request.Body).Decode(group); err != nil {
		return http.StatusInternalServerError, err
	}
	_, err := s.serviceGroupsClient.UpdateServiceGroup(ctx, &proto.UpdateServiceGroupRequest{ServiceGroup: group})
	if err != nil {
		return http.StatusInternalServerError, err
	}
	return http.StatusOK, nil

}

func (s Server) DeleteServiceGroup(_ http.ResponseWriter, request *http.Request) (int, error) {
	ctx := utils.CreateContext(request)
	resource := mux.Vars(request)["resource"]
	key := mux.Vars(request)["key"]
	if _, err := s.serviceGroupsClient.DeleteServiceGroup(ctx, &proto.DeleteServiceGroupRequest{ServiceGroup: &proto.ServiceGroup{
		ApiKey:   key,
		Resource: resource,
	}}); err != nil {
		return http.StatusInternalServerError, nil
	}

	return http.StatusOK, nil
}
