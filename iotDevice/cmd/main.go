package main

import (
	"fmt"
	"github.com/SamuelTJackson/fiware-manager/proto"
	"github.com/SamuelTJackson/fiware-manager/utils"
	"google.golang.org/grpc"
	"iotDevice"
	"log"
	"net"
)

func main() {
	confs, err := utils.GetConfigs()
	if err != nil {
		panic(err)
	}
	list, err := net.Listen("tcp", fmt.Sprintf(":%d", confs.IotDevice.Port))
	if err != nil {
		panic(err)
	}
	iotAgentConn, err := utils.NewGrpcConn(fmt.Sprintf("%s:%d", confs.IotAgents.Host, confs.IotAgents.Port),
		"iotAgents")
	server := &iotDevice.Server{
		Config: confs,
		IotAgentClient: proto.NewIotAgentServiceClient(iotAgentConn),
	}
	grpcServer := grpc.NewServer()
	proto.RegisterIotDevicesServiceServer(grpcServer, server)
	fmt.Printf("listen on %d\n", confs.IotDevice.Port)
	log.Fatal(grpcServer.Serve(list))
}



