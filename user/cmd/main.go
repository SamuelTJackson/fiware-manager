package main

import (
	"fmt"
	"github.com/SamuelTJackson/fiware-manager/proto"
	"github.com/SamuelTJackson/fiware-manager/utils"
	"google.golang.org/grpc"
	"log"
	"net"
	"user"
)

func main()  {
	confs, err := utils.GetConfigs()
	if err != nil {
		panic(err)
	}
	db , err := utils.CreateDBConnection(confs.User.DB)
	if err != nil {
		panic(err)
	}
	list, err := net.Listen("tcp", fmt.Sprintf(":%d", confs.User.Port))
	if err != nil {
		panic(err)
	}
	server := &user.Server{
		Config: confs,
		Database: db,
	}
	grpcServer := grpc.NewServer()
	proto.RegisterUserServiceServer(grpcServer, server)
	fmt.Printf("listen on %d\n", confs.User.Port)
	log.Fatal(grpcServer.Serve(list))
}
