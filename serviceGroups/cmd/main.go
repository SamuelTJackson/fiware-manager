package main

import (
	"fmt"
	fiware_manager_api "github.com/SamuelTJackson/fiware-manager-api/github.com/SamuelTJackson/fiware-manager-api"
	"google.golang.org/grpc"
	"log"
	"net"
	"serviceGroups"
	"github.com/SamuelTJackson/fiware-manager/utils"
)

func main() {
	list, err := net.Listen("tcp", fmt.Sprintf(":%d", 8080))
	if err != nil {
		panic(err)
	}
	server := &serviceGroups.Server{}
	grpcServer := grpc.NewServer()
	fiware_manager_api.RegisterServiceGroupsServiceServer(grpcServer, server)
	log.Fatal(grpcServer.Serve(list))
}
