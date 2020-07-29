package iotDevice

import "github.com/SamuelTJackson/fiware-manager/proto"

type IotDeviceListResponse struct {
	Count    int             `json:"count,omitempty"`
	Devices []*proto.IotDevice`json:"devices"`
}
