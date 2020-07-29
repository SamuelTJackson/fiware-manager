package iotDevice

import (
	"context"
	"encoding/json"
	"fmt"
	"github.com/SamuelTJackson/fiware-manager/proto"
	"github.com/SamuelTJackson/fiware-manager/utils"
	google_protobuf1 "github.com/golang/protobuf/ptypes/empty"
	"net/http"
	"sync"
)

type Server struct {
	Config *utils.Config
	IotAgentClient proto.IotAgentServiceClient
}
func addLocation(devices []*proto.IotDevice) {
	for i, device := range devices {
		for pos, attr := range device.StaticAttributes {
			if attr.Name == "location" {
				devices[i].StaticAttributes = append(device.StaticAttributes[:pos], device.StaticAttributes[pos+1:]...)
				continue
			}
		}
	}
}
//func removeLocation(device *iotcreator.IotDevice) {
//	if device.Location != nil {
//		device.StaticAttributes = append(device.StaticAttributes, *device.Location)
//		device.Location = nil
//	}
//}
func (s *Server) DeleteIotDevice(ctx context.Context, iotDevice *proto.DeleteIotDeviceRequest) (*google_protobuf1.Empty, error) {
	agent, err := s.IotAgentClient.GetIotAgentWithProtocol(context.Background(),
		&proto.GetIotAgentWithProtocolRequest{Protocol: iotDevice.GetProtocol()})
	url := fmt.Sprintf("%s/iot/devices/%s", agent.GetIotAgent().GetHost(), iotDevice.GetId())
	req, err := utils.CreateFiwareRequest(ctx, url, http.MethodDelete, nil)
	if err != nil {
		return nil, err
	}
	client := http.Client{}
	if _, err := client.Do(req); err != nil {
		return nil, err
	}
	return nil, nil
}
func (s *Server) CreateIotDevice(ctx context.Context, req *proto.CreateIotDeviceRequest) (*google_protobuf1.Empty, error) {
	return nil, nil
}
func (s *Server) ListIotDevices(ctx context.Context, _ *google_protobuf1.Empty) (*proto.ListIotDevicesResponse, error){
	list, err := s.IotAgentClient.ListIotAgents(context.Background(), nil)
	if err != nil {
		return nil, err
	}
	group := sync.WaitGroup{}
	group.Add(len(list.IotAgent))
	deviceChannel:= make(chan *proto.IotDevice)
	for _, agent := range list.IotAgent {
		go func() {
			defer group.Done()
			url := fmt.Sprintf("%s/iot/devices",agent.Host)
			req, err := utils.CreateFiwareRequest(ctx, url, http.MethodGet, nil)
			if err != nil {

			}
			client := &http.Client{}
			resp, err := client.Do(req)
			if err != nil {

			}
			defer resp.Body.Close()
			var response IotDeviceListResponse
			if err := json.NewDecoder(resp.Body).Decode(&response); err != nil {

			}
			for _, d := range response.Devices {
				d.Protocol = agent.Protocol
				deviceChannel <- d
			}
		}()
	}
	go func() {
		group.Wait()
		close(deviceChannel)
	}()
	var iotDevices []*proto.IotDevice
	for device := range deviceChannel {
		iotDevices = append(iotDevices, device)
	}
	return &proto.ListIotDevicesResponse{IotDevices: iotDevices}, nil
}
func (s *Server) UpdateIotDevice(ctx context.Context, req *proto.UpdateIotDeviceRequest) (*google_protobuf1.Empty, error){
	return nil, nil
}
func (s *Server) IotDevice(ctx context.Context, req *proto.IotDeviceRequest) (*proto.IotDeviceResponse, error) {
	return nil, nil
}

