package user

import (
	"context"
	"encoding/json"
	"github.com/SamuelTJackson/fiware-manager/proto"
	"github.com/SamuelTJackson/fiware-manager/utils"
	"github.com/SamuelTJackson/keyrock"
	google_protobuf1 "github.com/golang/protobuf/ptypes/empty"
	log "github.com/sirupsen/logrus"
	"go.mongodb.org/mongo-driver/bson"
	"go.mongodb.org/mongo-driver/mongo"
	"net/http"
)

type Server struct {
	Config *utils.Config
	Database *mongo.Database
}
const collection = "users"
func (s *Server) GetUser(ctx context.Context, req *proto.GetUserRequest) (*proto.GetUserResponse, error){
	log.Infof("Userinformation for userid %s", req.GetUserID())
	var user *proto.User
	res := s.Database.Collection(collection).FindOne(context.Background(), bson.M{"id": req.GetUserID()})
	if res.Err() != nil {
		return nil, res.Err()
	}
	if err := res.Decode(user); err != nil{
		return nil, err
	}
	return &proto.GetUserResponse{User: user}, nil
}
func (s *Server) AddUser(ctx context.Context, req *proto.AddUserRequest) (*google_protobuf1.Empty, error){
	log.Infof("Add User with name %s", req.GetUser().GetUsername())
	res := s.Database.Collection(collection).FindOneAndReplace(context.Background(),
		bson.M{"id": req.GetUser().GetUserID()}, req.GetUser())
	if res.Err() != nil {
		log.Info(res.Err().Error())
		_, err := s.Database.Collection(collection).InsertOne(context.Background(), req.GetUser())
		if err != nil {
			log.Error(err)
		}
		return nil, err
	}
	return nil, nil
}
func (s *Server) RemoveUser(ctx context.Context, req *proto.RemoveUserRequest) (*google_protobuf1.Empty, error){
	log.Info("Remove user with id %s", req.GetUserID())
	_, err := s.Database.Collection(collection).DeleteOne(context.Background(), bson.M{"id": req.GetUserID()})
	return nil, err

}
func (s *Server) AddLorakey(ctx context.Context, req *proto.AddLorakeyRequest) (*google_protobuf1.Empty, error){
	log.Infof("Add lora key for user %s", req.GetUserID())
	_, err := s.Database.Collection(collection).UpdateOne(context.Background(), bson.M{"id" : bson.M{"$eq": req.GetUserID()}},
		bson.M{"$set" : bson.M{"lora_key" : req.GetKey()}})
	return nil, err

}
func (s *Server) RemoveLorakey(ctx context.Context, req *proto.RemoveLorakeyRequest) (*google_protobuf1.Empty, error){
	log.Infof("Remove lora key for user %s", req.GetUserID())
	_, err := s.Database.Collection(collection).UpdateOne(context.Background(), bson.M{"id" : bson.M{"$eq": req.GetUserID()}},
		bson.M{"$set" : bson.M{"lora_key" : ""}})
	return nil, err
}
func (s *Server) GetLorakey(ctx context.Context, req *proto.GetLorakeyRequest) (*proto.GetLorakeyResponse, error){
	log.Infof("Get lorakey for userid %s", req.GetUserID())
	var user *proto.User
	res := s.Database.Collection(collection).FindOne(context.Background(), bson.M{"id": req.GetUserID()})
	if res.Err() != nil {
		return nil, res.Err()
	}
	if err := res.Decode(user); err != nil{
		return nil, err
	}
	return &proto.GetLorakeyResponse{
		Lorakey: user.GetLoraKey(),
	}, nil
}
func (s *Server) LoginUser(ctx context.Context, req *proto.LoginUserRequest) (*proto.LoginUserResponse, error){
	type login struct {
		Email    string `json:"email"`
		Password string `json:"password"`
	}
	var loginCredentials login
	if err := json.NewDecoder(request.Body).Decode(&loginCredentials); err != nil {
		return http.StatusInternalServerError, err
	}
	client, err := keyrock.NewClient(&keyrock.Options{
		BaseURL:  "https://keyrock.solvita.eng-its.de",
		Email:    loginCredentials.Email,
		Password: loginCredentials.Password,
	})
	if err != nil {
		return http.StatusInternalServerError, err
	}
	if err := client.GetTokenWithPassword(); err != nil {
		return http.StatusInternalServerError, err
	}
	info, err := client.GetTokenInfo()

}
func (s *Server) LogoutUser(ctx context.Context, req *proto.LogoutUserRequest) (*google_protobuf1.Empty, error){

}
