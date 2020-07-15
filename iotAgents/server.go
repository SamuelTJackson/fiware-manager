package iotAgents

import (
	"context"
	"github.com/SamuelTJackson/fiware-manager/proto"
	"github.com/SamuelTJackson/fiware-manager/utils"
	google_protobuf1 "github.com/golang/protobuf/ptypes/empty"
)

type Server struct {
	Config *utils.Config
}

func (s *Server) AddIotAgent(ctx context.Context,req *proto.AddIotAgentRequest) (*google_protobuf1.Empty, error) {
	return nil, nil
}

func (s *Server) ListIotAgents(ctx context.Context,_ *google_protobuf1.Empty) (*proto.ListIotAgentsResponse, error) {
	return nil, nil
}
func (s *Server) GetIotAgentWithProtocol(ctx context.Context, req *proto.GetIotAgentWithProtocolRequest) (*proto.GetIotAgentWithProtocolResponse, error) {
	return nil, nil
}
