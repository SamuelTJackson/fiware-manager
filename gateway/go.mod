module gateway

go 1.14

replace github.com/SamuelTJackson/fiware-manager/utils => /home/sam/Documents/private/fiware-manager/utils

replace github.com/SamuelTJackson/fiware-manager/proto => /home/sam/Documents/private/fiware-manager/proto

//replace github.com/SamuelTJackson/fiware-manager/utils => /Users/samueltinapp/Documents/private/fiware-manager/utils
//replace github.com/SamuelTJackson/fiware-manager/proto => /Users/samueltinapp/Documents/private/fiware-manager/proto
require (
	github.com/SamuelTJackson/fiware-manager v0.0.0-20200708190609-5dc817c4f6ba
	github.com/SamuelTJackson/fiware-manager/utils v0.0.0-20200708183204-d88aa0d9f03f
	github.com/golang/protobuf v1.4.2
	github.com/gorilla/mux v1.7.4
	github.com/sirupsen/logrus v1.6.0
	golang.org/x/net v0.0.0-20200707034311-ab3426394381 // indirect
	google.golang.org/genproto v0.0.0-20200709005830-7a2ca40e9dc3 // indirect
	google.golang.org/grpc v1.30.0 // indirect
)
