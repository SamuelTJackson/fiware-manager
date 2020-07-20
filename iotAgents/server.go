package iotAgents

import (
	"context"
	"github.com/SamuelTJackson/fiware-manager/proto"
	"github.com/SamuelTJackson/fiware-manager/utils"
	google_protobuf1 "github.com/golang/protobuf/ptypes/empty"
	log "github.com/sirupsen/logrus"
	"go.mongodb.org/mongo-driver/bson"
	"go.mongodb.org/mongo-driver/mongo"
)

type Server struct {
	Config *utils.Config
	Database *mongo.Database
}

const collection = "iot-agents"

func (s *Server) AddIotAgent(ctx context.Context,req *proto.AddIotAgentRequest) (*google_protobuf1.Empty, error) {
	log.Infof("add iot-agent (%s) to database with protocol %s", req.IotAgent.GetHost(), req.IotAgent.GetProtocol())
	number, err := s.Database.Collection(collection).
		CountDocuments(context.TODO(), bson.D{{"host", req.IotAgent.GetHost()}})
	if err != nil {
		return &google_protobuf1.Empty{}, err
	}

	if number == 0 {
		_, err := s.Database.Collection(collection).InsertOne(context.Background(), req.IotAgent)
		if err != nil {
			return &google_protobuf1.Empty{}, err
		}
	}
	return &google_protobuf1.Empty{}, nil
}

func (s *Server) ListIotAgents(ctx context.Context,_ *google_protobuf1.Empty) (*proto.ListIotAgentsResponse, error) {
	c, err := s.Database.Collection(collection).Find(context.Background(), bson.D{})
	if err != nil {
		return nil, err
	}
	var agents []*proto.IotAgent
	for c.Next(context.Background()) {
		var elem *proto.IotAgent
		if err := c.Decode(&elem); err != nil {
			return nil, err
		}
		agents = append(agents, elem)
	}
	return &proto.ListIotAgentsResponse{IotAgent: agents}, nil
}
func (s *Server) GetIotAgentWithProtocol(ctx context.Context, req *proto.GetIotAgentWithProtocolRequest) (*proto.GetIotAgentWithProtocolResponse, error) {
	res := s.Database.Collection(collection).FindOne(context.Background(), bson.D{{"protocol", req.GetProtocol()}})
	var agent *proto.IotAgent
	if err := res.Decode(agent); err != nil {
		return nil, err
	}
	return &proto.GetIotAgentWithProtocolResponse{IotAgent: agent}, nil
}
