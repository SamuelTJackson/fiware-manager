package main

import (
	"fmt"
	"github.com/SamuelTJackson/fiware-manager/proto"
	"google.golang.org/grpc"
	"log"
	"net"
	"serviceGroups"
)

func main() {
	list, err := net.Listen("tcp", fmt.Sprintf(":%d", 8080))
	if err != nil {
		panic(err)
	}
	server := &serviceGroups.Server{}
	grpcServer := grpc.NewServer()
	proto.RegisterServiceGroupsServiceServer(grpcServer, server)
	log.Fatal(grpcServer.Serve(list))

}
