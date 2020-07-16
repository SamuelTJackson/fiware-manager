package gateway

import (
	"github.com/SamuelTJackson/fiware-manager/proto"
	"github.com/SamuelTJackson/fiware-manager/utils"
)

type Server struct {
	Config *utils.Config
	ServiceGroupsClient proto.ServiceGroupsServiceClient
	IotAgentClient proto.IotAgentServiceClient
}

