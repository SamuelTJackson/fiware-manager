package serviceGroups

import (
	"context"
	"encoding/json"
	"fmt"
	"github.com/SamuelTJackson/fiware-manager/proto"
	"github.com/SamuelTJackson/fiware-manager/utils"
	google_protobuf1 "github.com/golang/protobuf/ptypes/empty"
	google_protobuf2 "github.com/golang/protobuf/ptypes/wrappers"
	"net/http"
)

type Server struct {
}

func (s *Server) DeleteServiceGroup(ctx context.Context, serviceGroup *proto.DeleteServiceGroupRequest) (*google_protobuf1.Empty, error) {
	url := fmt.Sprintf("http://localhost:4041/iot/services?resource=%s&apikey=%s", serviceGroup.ServiceGroup.Resource, serviceGroup.ServiceGroup.ApiKey)
	req, err := utils.CreateFiwareRequest(ctx, url, http.MethodDelete, nil)
	if err != nil {
		return nil, err
	}
	client := http.Client{}
	if _, err := client.Do(req); err != nil {
		return nil, err
	}
	return nil, nil
}
func (s *Server) CreateServiceGroup(ctx context.Context, req *proto.CreateServiceGroupRequest) (*google_protobuf1.Empty, error) {
	return nil, nil
}

func (s *Server) ListServiceGroups(ctx context.Context, req *google_protobuf1.Empty) (*proto.ListServiceGroupsResponse, error) {
	return nil, nil
}

func (s *Server) UpdateServiceGroup(ctx context.Context, req *proto.UpdateServiceGroupRequest) (*google_protobuf1.Empty, error) {
	return nil, nil
}

func (s *Server) ServiceGroup(ctx context.Context, id *google_protobuf2.StringValue) (*proto.ServiceGroupResponse, error) {
	url := fmt.Sprintf("http://localhost:4041/iot/services?id=%s", id.Value)
	req, err := utils.CreateFiwareRequest(ctx, url, http.MethodGet, nil)
	if err != nil {
		return nil, err
	}
	client := http.Client{}
	response, err := client.Do(req)
	if err != nil {
		return nil, err
	}
	defer response.Body.Close()
	serviceGroup :=  &proto.ServiceGroup{}
	if err := json.NewDecoder(response.Body).Decode(serviceGroup); err != nil {
		return nil, err
	}
	return &proto.ServiceGroupResponse{ServiceGroup: serviceGroup}, nil

}
