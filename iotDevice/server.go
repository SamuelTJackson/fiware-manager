package iotDevice

import (
	"context"
	"github.com/SamuelTJackson/fiware-manager/proto"
	"github.com/SamuelTJackson/fiware-manager/utils"
	google_protobuf1 "github.com/golang/protobuf/ptypes/empty"
)

type Server struct {
	Config *utils.Config
	IotAgentClient proto.IotAgentServiceClient
}

func (s *Server) DeleteIotDevice(ctx context.Context, req *proto.DeleteIotDeviceRequest) (*google_protobuf1.Empty, error) {

	return nil, nil
}
func (s *Server) CreateIotDevice(ctx context.Context, req *proto.CreateIotDeviceRequest) (*google_protobuf1.Empty, error) {
	return nil, nil
}
func (s *Server) ListIotDevices(ctx context.Context, _ *google_protobuf1.Empty) (*proto.ListIotDevicesResponse, error){
	return nil, nil
}
func (s *Server) UpdateIotDevice(ctx context.Context, req *proto.UpdateIotDeviceRequest) (*google_protobuf1.Empty, error){
	return nil, nil
}
func (s *Server) IotDevice(ctx context.Context, req *proto.IotDeviceRequest) (*proto.IotDeviceResponse, error) {
	return nil, nil
}

