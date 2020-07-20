package main

import (
	"fmt"
	"github.com/SamuelTJackson/fiware-manager/proto"
	"github.com/SamuelTJackson/fiware-manager/utils"
	"google.golang.org/grpc"
	"log"
	"net"
	"serviceGroups"
)

func main() {
	confs, err := utils.GetConfigs()
	if err != nil {
		panic(err)
	}
	list, err := net.Listen("tcp", fmt.Sprintf(":%d", confs.ServiceGroup.Port))
	if err != nil {
		panic(err)
	}
	iotAgentConn, err := utils.NewGrpcConn(fmt.Sprintf("%s:%d", confs.IotAgents.Host, confs.IotAgents.Port),
		"iotAgents")
	server := &serviceGroups.Server{
		Config: confs,
		IotAgentClient: proto.NewIotAgentServiceClient(iotAgentConn),
	}
	grpcServer := grpc.NewServer()
	proto.RegisterServiceGroupsServiceServer(grpcServer, server)
	fmt.Printf("listen on %d\n", confs.ServiceGroup.Port)
	log.Fatal(grpcServer.Serve(list))

}
