package serviceGroups

import (
	"context"
	fiware_manager_api "github.com/SamuelTJackson/fiware-manager-api/github.com/SamuelTJackson/fiware-manager-api"
	google_protobuf1 "github.com/golang/protobuf/ptypes/empty"
	google_protobuf2 "github.com/golang/protobuf/ptypes/wrappers"
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

func (s *Server) ServiceGroup(ctx context.Context, req *google_protobuf2.StringValue) (*fiware_manager_api.ServiceGroupResponse, error) {
	return nil, nil
}
