.PHONY: iotDevice serviceGroup iotAgent

all: iotDevice serviceGroup iotAgent

iotDevice:
	docker run --rm -v $(shell pwd):/data -w /data znly/protoc --go_out=plugins=grpc:. -I=. iotDevice.proto
serviceGroup:
	docker run --rm -v $(shell pwd):/data -w /data znly/protoc --go_out=plugins=grpc:. -I=. serviceGroup.proto
iotAgent:
	docker run --rm -v $(shell pwd):/data -w /data znly/protoc --go_out=plugins=grpc:. -I=. iotAgent.proto
