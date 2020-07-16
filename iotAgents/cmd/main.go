package main

import (
	"fmt"
	"github.com/SamuelTJackson/fiware-manager/proto"
	"github.com/SamuelTJackson/fiware-manager/utils"
	"google.golang.org/grpc"
	"iotAgents"
	"log"
	"net"
)

func main()  {
	confs, err := utils.GetConfigs()
	if err != nil {
		panic(err)
	}
	db , err := utils.CreateDBConnection(confs.IotAgents.DB)
	if err != nil {
		panic(err)
	}

	list, err := net.Listen("tcp", fmt.Sprintf(":%d", confs.ServiceGroup.Port))
	if err != nil {
		panic(err)
	}
	server := &iotAgents.Server{
		Config: confs,
		Database: db,
	}
	grpcServer := grpc.NewServer()
	proto.RegisterIotAgentServiceServer(grpcServer, server)
	fmt.Printf("listen on %d\n", confs.IotAgents.Port)
	log.Fatal(grpcServer.Serve(list))
}