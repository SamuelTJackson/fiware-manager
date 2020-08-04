.PHONY: iotDevice serviceGroup iotAgent

all: 
	docker run --rm -v $(shell pwd):/data -w /data znly/protoc --go_out=plugins=grpc:. -I=. *.proto
	protoc-go-inject-tag -input=./serviceGroup.pb.go
	protoc-go-inject-tag -input=./iotAgent.pb.go
	protoc-go-inject-tag -input=./iotDevice.pb.go
	protoc-go-inject-tag -input=./user.pb.go
	protoc-go-inject-tag -input=./values.pb.go
iotDevice:
	docker run --rm -v $(shell pwd):/data -w /data znly/protoc --go_out=plugins=grpc:. -I=. iotDevice.proto
serviceGroup:
	docker run --rm -v $(shell pwd):/data -w /data znly/protoc --go_out=plugins=grpc:. -I=. serviceGroup.proto
iotAgent:
	docker run --rm -v $(shell pwd):/data -w /data znly/protoc --go_out=plugins=grpc:. -I=. iotAgent.proto
