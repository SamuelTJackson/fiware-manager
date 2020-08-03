package user

import (
	"context"
	"github.com/SamuelTJackson/fiware-manager/proto"
	"github.com/SamuelTJackson/fiware-manager/utils"
	google_protobuf1 "github.com/golang/protobuf/ptypes/empty"

)

type Server struct {
	Config *utils.Config
}
func (s *Server) GetUser(ctx context.Context, req *proto.GetUserRequest) (*proto.GetUserResponse, error){
		
}
func (s *Server) AddUser(ctx context.Context, req *proto.AddUserRequest) (*google_protobuf1.Empty, error){

}
func (s *Server) RemoveUser(ctx context.Context, req *proto.RemoveUserRequest) (*google_protobuf1.Empty, error){

}
func (s *Server) AddLorakey(ctx context.Context, req *proto.AddLorakeyRequest) (*google_protobuf1.Empty, error){

}
func (s *Server) RemoveLorakey(ctx context.Context, req *proto.RemoveLorakeyRequest) (*google_protobuf1.Empty, error){

}
func (s *Server) GetLorakey(ctx context.Context, req *proto.GetLorakeyRequest) (*proto.GetLorakeyResponse, error){

}
func (s *Server) LoginUser(ctx context.Context, req *proto.LoginUserRequest) (*proto.LoginUserResponse, error){

}
func (s *Server) LogoutUser(ctx context.Context, req *proto.LogoutUserRequest) (*google_protobuf1.Empty, error){

}
