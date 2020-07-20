package serviceGroups

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

func (s *Server) DeleteServiceGroup(ctx context.Context, serviceGroup *proto.DeleteServiceGroupRequest) (*google_protobuf1.Empty, error) {
	agent, err := s.IotAgentClient.GetIotAgentWithProtocol(context.Background(),
		&proto.GetIotAgentWithProtocolRequest{Protocol: serviceGroup.GetServiceGroup().GetProtocol()})
	url := fmt.Sprintf("%s/iot/services?resource=%s&apikey=%s", agent.GetIotAgent().GetHost(),
		serviceGroup.GetServiceGroup().GetResource(), serviceGroup.GetServiceGroup().GetApiKey())
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
func (s *Server) CreateServiceGroup(ctx context.Context, req *proto.CreateServiceGroupRequest) (*google_protobuf1.Empty, error) {
	agent, err := s.IotAgentClient.GetIotAgentWithProtocol(context.Background(),
		&proto.GetIotAgentWithProtocolRequest{Protocol: req.GetServiceGroup().GetProtocol()})
	if err != nil {
		return nil, err
	}
	serviceGroup := req.GetServiceGroup()
	serviceGroup.Protocol = ""
	url := fmt.Sprintf("%s/iot/services", agent.GetIotAgent().GetHost())
	body, err := json.Marshal(serviceGroup)
	if err != nil {
		return nil, err
	}
	newReq, err := utils.CreateFiwareRequest(ctx, url, http.MethodPost, body)
	if err != nil {
		return nil, err
	}
	newReq.Header.Set("content-type","application/json")
	client := &http.Client{}
	_, err = client.Do(newReq)
	if err != nil {
		return nil, err
	}
	return nil, nil
}

func (s *Server) ListServiceGroups(ctx context.Context, req *google_protobuf1.Empty) (*proto.ListServiceGroupsResponse, error) {
	list, err := s.IotAgentClient.ListIotAgents(context.Background(), nil)
	if err != nil {
		return nil, err
	}
	group := sync.WaitGroup{}
	group.Add(len(list.IotAgent))
	serviceGroupChan := make(chan *proto.ServiceGroup)
	for _, agent := range list.IotAgent {
		go func() {
			defer group.Done()
			url := fmt.Sprintf("%s/iot/services",agent.Host)
			req, err := utils.CreateFiwareRequest(ctx, url, http.MethodGet, nil)
			if err != nil {

			}
			client := &http.Client{}
			resp, err := client.Do(req)
			if err != nil {

			}
			defer resp.Body.Close()
			var response ServiceGroupListResponse
			if err := json.NewDecoder(resp.Body).Decode(&response); err != nil {

			}
			for _, sG := range response.Services {
				sG.Protocol = agent.Protocol
				serviceGroupChan <- sG
			}
		}()
	}
	go func() {
		group.Wait()
		close(serviceGroupChan)
	}()
	var serviceGroups []*proto.ServiceGroup
	for serviceGroup := range serviceGroupChan {
		serviceGroups = append(serviceGroups, serviceGroup)
	}
	return &proto.ListServiceGroupsResponse{ServiceGroup: serviceGroups}, nil
}

func (s *Server) UpdateServiceGroup(ctx context.Context, req *proto.UpdateServiceGroupRequest) (*google_protobuf1.Empty, error) {
	agent, err := s.IotAgentClient.GetIotAgentWithProtocol(context.Background(),
		&proto.GetIotAgentWithProtocolRequest{Protocol:  req.ServiceGroup.GetProtocol()})
	if err != nil {
		return nil, err
	}
	url := fmt.Sprintf("%s/iot/services?resource=%s&apikey=%s", agent.GetIotAgent().GetHost(),
		req.GetServiceGroup().GetResource(), req.GetServiceGroup().GetApiKey())
	serviceGroup := req.GetServiceGroup()
	serviceGroup.Protocol = ""
	body, err := json.Marshal(serviceGroup)
	if err != nil {
		return nil, err
	}
	newReq, err := utils.CreateFiwareRequest(ctx, url, http.MethodPut, body)
	if err != nil {
		return nil, err
	}
	newReq.Header.Set("content-type","application/json")
	client := &http.Client{}
	_, err = client.Do(newReq)
	if err != nil {
		return nil, err
	}
	return nil, nil
}

func (s *Server) ServiceGroup(ctx context.Context, req *proto.ServiceGroupRequest) (*proto.ServiceGroupResponse, error) {
	agent, err := s.IotAgentClient.GetIotAgentWithProtocol(context.Background(), &proto.GetIotAgentWithProtocolRequest{Protocol: req.GetProtocol()})
	url := fmt.Sprintf("%s/iot/services?id=%s",agent.GetIotAgent().GetHost(), req.GetID())
	newReq, err := utils.CreateFiwareRequest(ctx, url, http.MethodGet, nil)
	if err != nil {
		return nil, err
	}
	client := http.Client{}
	response, err := client.Do(newReq)
	if err != nil {
		return nil, err
	}
	defer response.Body.Close()
	serviceGroup :=  &proto.ServiceGroup{}
	if err := json.NewDecoder(response.Body).Decode(serviceGroup); err != nil {
		return nil, err
	}
	serviceGroup.Protocol = agent.GetIotAgent().GetProtocol()
	return &proto.ServiceGroupResponse{ServiceGroup: serviceGroup}, nil

}
