package serviceGroups

import (
	"context"
	"encoding/json"
	"fmt"
	fiware_manager_api "github.com/SamuelTJackson/fiware-manager-api/github.com/SamuelTJackson/fiware-manager-api"
	"github.com/SamuelTJackson/fiware-manager/utils"
	google_protobuf1 "github.com/golang/protobuf/ptypes/empty"
	google_protobuf2 "github.com/golang/protobuf/ptypes/wrappers"
	"net/http"
	"github.com/SamuelTJackson/fiware-manager/proto"
)

type Server struct {
}

func (s *Server) DeleteServiceGroup(ctx context.Context, req *fiware_manager_api.DeleteServiceGroupRequest) (*google_protobuf1.Empty, error) {
	return nil, nil
}
func (s *Server) CreateServiceGroup(ctx context.Context, req *fiware_manager_api.CreateServiceGroupRequest) (*google_protobuf1.Empty, error) {
	return nil, nil
}

func (s *Server) ListServiceGroups(ctx context.Context, req *google_protobuf1.Empty) (*fiware_manager_api.ListServiceGroupsResponse, error) {
	return nil, nil
}

func (s *Server) UpdateServiceGroup(ctx context.Context, req *fiware_manager_api.UpdateServiceGroupRequest) (*google_protobuf1.Empty, error) {
	return nil, nil
}

func (s *Server) ServiceGroup(ctx context.Context, id *google_protobuf2.StringValue) (*fiware_manager_api.ServiceGroupResponse, error) {
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
	serviceGroup :=  &fiware_manager_api.ServiceGroup{}
	if err := json.NewDecoder(response.Body).Decode(serviceGroup); err != nil {
		return nil, err
	}

	return &fiware_manager_api.ServiceGroupResponse{ServiceGroup: serviceGroup}, nil

}
