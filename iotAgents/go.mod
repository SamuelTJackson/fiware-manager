module iotAgents

go 1.14

replace github.com/SamuelTJackson/fiware-manager/utils => /home/sam/Documents/private/fiware-manager/utils
replace github.com/SamuelTJackson/fiware-manager/proto => /home/sam/Documents/private/fiware-manager/proto
//replace github.com/SamuelTJackson/fiware-manager/utils => /Users/samueltinapp/Documents/private/fiware-manager/utils
//replace github.com/SamuelTJackson/fiware-manager/proto => /Users/samueltinapp/Documents/private/fiware-manager/proto
require (
	github.com/SamuelTJackson/fiware-manager/proto v0.0.0-00010101000000-000000000000
	github.com/SamuelTJackson/fiware-manager/utils v0.0.0-20200708183204-d88aa0d9f03f
	github.com/golang/protobuf v1.3.3
	github.com/sirupsen/logrus v1.4.2
	go.mongodb.org/mongo-driver v1.3.5
	google.golang.org/grpc v1.30.0
)
