// Code generated by protoc-gen-go. DO NOT EDIT.
// source: iotAgent.proto

/*
Package proto is a generated protocol buffer package.

It is generated from these files:
	iotAgent.proto
	iotDevice.proto
	serviceGroup.proto
	user.proto
	values.proto

It has these top-level messages:
	IotAgent
	AddIotAgentRequest
	ListIotAgentsResponse
	GetIotAgentWithProtocolRequest
	GetIotAgentWithProtocolResponse
	Attributes
	StaticAttributes
	Commands
	IotDevice
	DeleteIotDeviceRequest
	CreateIotDeviceRequest
	ListIotDevicesResponse
	UpdateIotDeviceRequest
	IotDeviceResponse
	IotDeviceRequest
	ServiceGroup
	Command
	Attribute
	StaticAttribute
	DeleteServiceGroupRequest
	CreateServiceGroupRequest
	ListServiceGroupsResponse
	UpdateServiceGroupRequest
	ServiceGroupResponse
	ServiceGroupRequest
	User
	LoginUserRequest
	LoginUserResponse
	LogoutUserRequest
	GetUserRequest
	GetUserResponse
	AddUserRequest
	RemoveUserRequest
	AddLorakeyRequest
	RemoveLorakeyRequest
	GetLorakeyRequest
	GetLorakeyResponse
	Lazy
*/
package proto

import proto1 "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import _ "google.golang.org/genproto/googleapis/api/annotations"
import google_protobuf1 "github.com/golang/protobuf/ptypes/empty"

import (
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto1.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto1.ProtoPackageIsVersion2 // please upgrade the proto package

type IotAgent struct {
	// @inject_tag: json:"host,omitempty" bson:"host"
	Host string `protobuf:"bytes,1,opt,name=Host,json=host,omitempty" json:"host,omitempty" bson:"host"`
	// @inject_tag: json:"protocol,omitempty" bson:"protocol"
	Protocol string `protobuf:"bytes,2,opt,name=Protocol,json=protocol,omitempty" json:"protocol,omitempty" bson:"protocol"`
	// @inject_tag: json:"description,omitempty" bson:"description"
	Description string `protobuf:"bytes,3,opt,name=Description,json=description, omitempty" json:"description,omitempty" bson:"description"`
	// @inject_tag: json:"resource,omitempty" bson:"resource"
	Resource string `protobuf:"bytes,4,opt,name=Resource,json=resource, omitempty" json:"resource,omitempty" bson:"resource"`
}

func (m *IotAgent) Reset()                    { *m = IotAgent{} }
func (m *IotAgent) String() string            { return proto1.CompactTextString(m) }
func (*IotAgent) ProtoMessage()               {}
func (*IotAgent) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{0} }

func (m *IotAgent) GetHost() string {
	if m != nil {
		return m.Host
	}
	return ""
}

func (m *IotAgent) GetProtocol() string {
	if m != nil {
		return m.Protocol
	}
	return ""
}

func (m *IotAgent) GetDescription() string {
	if m != nil {
		return m.Description
	}
	return ""
}

func (m *IotAgent) GetResource() string {
	if m != nil {
		return m.Resource
	}
	return ""
}

type AddIotAgentRequest struct {
	IotAgent *IotAgent `protobuf:"bytes,1,opt,name=IotAgent" json:"IotAgent,omitempty"`
}

func (m *AddIotAgentRequest) Reset()                    { *m = AddIotAgentRequest{} }
func (m *AddIotAgentRequest) String() string            { return proto1.CompactTextString(m) }
func (*AddIotAgentRequest) ProtoMessage()               {}
func (*AddIotAgentRequest) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{1} }

func (m *AddIotAgentRequest) GetIotAgent() *IotAgent {
	if m != nil {
		return m.IotAgent
	}
	return nil
}

type ListIotAgentsResponse struct {
	IotAgent []*IotAgent `protobuf:"bytes,1,rep,name=iotAgent" json:"iotAgent,omitempty"`
}

func (m *ListIotAgentsResponse) Reset()                    { *m = ListIotAgentsResponse{} }
func (m *ListIotAgentsResponse) String() string            { return proto1.CompactTextString(m) }
func (*ListIotAgentsResponse) ProtoMessage()               {}
func (*ListIotAgentsResponse) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{2} }

func (m *ListIotAgentsResponse) GetIotAgent() []*IotAgent {
	if m != nil {
		return m.IotAgent
	}
	return nil
}

type GetIotAgentWithProtocolRequest struct {
	Protocol string `protobuf:"bytes,1,opt,name=Protocol" json:"Protocol,omitempty"`
}

func (m *GetIotAgentWithProtocolRequest) Reset()                    { *m = GetIotAgentWithProtocolRequest{} }
func (m *GetIotAgentWithProtocolRequest) String() string            { return proto1.CompactTextString(m) }
func (*GetIotAgentWithProtocolRequest) ProtoMessage()               {}
func (*GetIotAgentWithProtocolRequest) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{3} }

func (m *GetIotAgentWithProtocolRequest) GetProtocol() string {
	if m != nil {
		return m.Protocol
	}
	return ""
}

type GetIotAgentWithProtocolResponse struct {
	IotAgent *IotAgent `protobuf:"bytes,1,opt,name=IotAgent" json:"IotAgent,omitempty"`
}

func (m *GetIotAgentWithProtocolResponse) Reset()                    { *m = GetIotAgentWithProtocolResponse{} }
func (m *GetIotAgentWithProtocolResponse) String() string            { return proto1.CompactTextString(m) }
func (*GetIotAgentWithProtocolResponse) ProtoMessage()               {}
func (*GetIotAgentWithProtocolResponse) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{4} }

func (m *GetIotAgentWithProtocolResponse) GetIotAgent() *IotAgent {
	if m != nil {
		return m.IotAgent
	}
	return nil
}

func init() {
	proto1.RegisterType((*IotAgent)(nil), "proto.IotAgent")
	proto1.RegisterType((*AddIotAgentRequest)(nil), "proto.AddIotAgentRequest")
	proto1.RegisterType((*ListIotAgentsResponse)(nil), "proto.ListIotAgentsResponse")
	proto1.RegisterType((*GetIotAgentWithProtocolRequest)(nil), "proto.GetIotAgentWithProtocolRequest")
	proto1.RegisterType((*GetIotAgentWithProtocolResponse)(nil), "proto.GetIotAgentWithProtocolResponse")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// Client API for IotAgentService service

type IotAgentServiceClient interface {
	AddIotAgent(ctx context.Context, in *AddIotAgentRequest, opts ...grpc.CallOption) (*google_protobuf1.Empty, error)
	ListIotAgents(ctx context.Context, in *google_protobuf1.Empty, opts ...grpc.CallOption) (*ListIotAgentsResponse, error)
	GetIotAgentWithProtocol(ctx context.Context, in *GetIotAgentWithProtocolRequest, opts ...grpc.CallOption) (*GetIotAgentWithProtocolResponse, error)
}

type iotAgentServiceClient struct {
	cc *grpc.ClientConn
}

func NewIotAgentServiceClient(cc *grpc.ClientConn) IotAgentServiceClient {
	return &iotAgentServiceClient{cc}
}

func (c *iotAgentServiceClient) AddIotAgent(ctx context.Context, in *AddIotAgentRequest, opts ...grpc.CallOption) (*google_protobuf1.Empty, error) {
	out := new(google_protobuf1.Empty)
	err := grpc.Invoke(ctx, "/proto.IotAgentService/AddIotAgent", in, out, c.cc, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *iotAgentServiceClient) ListIotAgents(ctx context.Context, in *google_protobuf1.Empty, opts ...grpc.CallOption) (*ListIotAgentsResponse, error) {
	out := new(ListIotAgentsResponse)
	err := grpc.Invoke(ctx, "/proto.IotAgentService/ListIotAgents", in, out, c.cc, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *iotAgentServiceClient) GetIotAgentWithProtocol(ctx context.Context, in *GetIotAgentWithProtocolRequest, opts ...grpc.CallOption) (*GetIotAgentWithProtocolResponse, error) {
	out := new(GetIotAgentWithProtocolResponse)
	err := grpc.Invoke(ctx, "/proto.IotAgentService/GetIotAgentWithProtocol", in, out, c.cc, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// Server API for IotAgentService service

type IotAgentServiceServer interface {
	AddIotAgent(context.Context, *AddIotAgentRequest) (*google_protobuf1.Empty, error)
	ListIotAgents(context.Context, *google_protobuf1.Empty) (*ListIotAgentsResponse, error)
	GetIotAgentWithProtocol(context.Context, *GetIotAgentWithProtocolRequest) (*GetIotAgentWithProtocolResponse, error)
}

func RegisterIotAgentServiceServer(s *grpc.Server, srv IotAgentServiceServer) {
	s.RegisterService(&_IotAgentService_serviceDesc, srv)
}

func _IotAgentService_AddIotAgent_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(AddIotAgentRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(IotAgentServiceServer).AddIotAgent(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/proto.IotAgentService/AddIotAgent",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(IotAgentServiceServer).AddIotAgent(ctx, req.(*AddIotAgentRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _IotAgentService_ListIotAgents_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(google_protobuf1.Empty)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(IotAgentServiceServer).ListIotAgents(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/proto.IotAgentService/ListIotAgents",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(IotAgentServiceServer).ListIotAgents(ctx, req.(*google_protobuf1.Empty))
	}
	return interceptor(ctx, in, info, handler)
}

func _IotAgentService_GetIotAgentWithProtocol_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetIotAgentWithProtocolRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(IotAgentServiceServer).GetIotAgentWithProtocol(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/proto.IotAgentService/GetIotAgentWithProtocol",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(IotAgentServiceServer).GetIotAgentWithProtocol(ctx, req.(*GetIotAgentWithProtocolRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _IotAgentService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "proto.IotAgentService",
	HandlerType: (*IotAgentServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "AddIotAgent",
			Handler:    _IotAgentService_AddIotAgent_Handler,
		},
		{
			MethodName: "ListIotAgents",
			Handler:    _IotAgentService_ListIotAgents_Handler,
		},
		{
			MethodName: "GetIotAgentWithProtocol",
			Handler:    _IotAgentService_GetIotAgentWithProtocol_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "iotAgent.proto",
}

func init() { proto1.RegisterFile("iotAgent.proto", fileDescriptor0) }

var fileDescriptor0 = []byte{
	// 354 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x8c, 0x92, 0x5f, 0x4b, 0x02, 0x41,
	0x14, 0xc5, 0xfd, 0x57, 0xd8, 0x95, 0x14, 0x26, 0xb2, 0x6d, 0x93, 0x92, 0x25, 0x23, 0x50, 0x56,
	0xb0, 0xd7, 0x5e, 0x0c, 0xc3, 0x82, 0x88, 0xd8, 0x1e, 0x7a, 0xd6, 0xf5, 0xa6, 0x13, 0xba, 0x77,
	0xdb, 0x19, 0x83, 0xbe, 0x42, 0x1f, 0xa3, 0x4f, 0x1a, 0xce, 0xce, 0xec, 0x6e, 0xa4, 0xd5, 0xd3,
	0x72, 0x76, 0x7e, 0xf7, 0xcc, 0xb9, 0x87, 0x81, 0x2a, 0x27, 0xd9, 0x9f, 0x62, 0x20, 0xdd, 0x30,
	0x22, 0x49, 0x6c, 0x4b, 0x7d, 0xec, 0xc6, 0x94, 0x68, 0x3a, 0xc7, 0xee, 0x28, 0xe4, 0xdd, 0x51,
	0x10, 0x90, 0x1c, 0x49, 0x4e, 0x81, 0x88, 0x21, 0xfb, 0x48, 0x9f, 0x2a, 0x35, 0x5e, 0x3e, 0x77,
	0x71, 0x11, 0xca, 0xf7, 0xf8, 0xd0, 0xf9, 0xcc, 0x43, 0xf9, 0x56, 0x9b, 0xb2, 0x06, 0x94, 0x6e,
	0x48, 0x48, 0x2b, 0xdf, 0xcc, 0x9f, 0xef, 0x78, 0xd5, 0x19, 0x09, 0xd9, 0xa1, 0x05, 0x97, 0x6a,
	0x80, 0x9d, 0x42, 0xf9, 0x61, 0x35, 0xe3, 0xd3, 0xdc, 0x2a, 0x28, 0x82, 0x85, 0x5a, 0x67, 0xa8,
	0x36, 0x54, 0x06, 0x28, 0xfc, 0x88, 0x87, 0xab, 0x0c, 0x56, 0x51, 0x81, 0xf5, 0x49, 0xfa, 0xab,
	0xd3, 0x4c, 0xe1, 0x16, 0x94, 0x3d, 0x14, 0xb4, 0x8c, 0x7c, 0xb4, 0x4a, 0x8a, 0xdc, 0x8b, 0xb4,
	0xce, 0x60, 0x4e, 0x1f, 0x58, 0x7f, 0x32, 0x31, 0x31, 0x3d, 0x7c, 0x5d, 0xa2, 0x90, 0xac, 0x9d,
	0x26, 0x57, 0x89, 0x2b, 0xbd, 0x5a, 0xbc, 0x94, 0x9b, 0x90, 0x09, 0xe0, 0x0c, 0x60, 0xff, 0x8e,
	0x0b, 0x69, 0xb4, 0xf0, 0x50, 0x84, 0x14, 0x08, 0x5c, 0xb9, 0xf0, 0xd4, 0xa5, 0xb8, 0xd6, 0xc5,
	0x00, 0xce, 0x25, 0x1c, 0x0f, 0x31, 0x31, 0x79, 0xe2, 0x72, 0x66, 0x1a, 0x31, 0xa1, 0xec, 0x4c,
	0x49, 0x71, 0x8d, 0x89, 0x76, 0xee, 0xe1, 0x64, 0xe3, 0x74, 0x9a, 0xe6, 0xdf, 0x3b, 0xf5, 0x3e,
	0x0a, 0x50, 0x33, 0xe2, 0x11, 0xa3, 0x37, 0xee, 0x23, 0xbb, 0x82, 0x4a, 0xa6, 0x2a, 0x76, 0xa8,
	0xa7, 0x7f, 0xd6, 0x67, 0xd7, 0xdd, 0xf8, 0x5d, 0xb8, 0xe6, 0x5d, 0xb8, 0xd7, 0xaa, 0xec, 0x1c,
	0x1b, 0xc2, 0xee, 0xb7, 0xae, 0xd8, 0x06, 0xd4, 0x6e, 0x68, 0xf7, 0xb5, 0xcd, 0x3a, 0x39, 0xf6,
	0x02, 0x07, 0x1b, 0x16, 0x66, 0x2d, 0x3d, 0xfa, 0x7b, 0x9d, 0xf6, 0xd9, 0x5f, 0x98, 0xb9, 0x6b,
	0xbc, 0xad, 0xc0, 0x8b, 0xaf, 0x00, 0x00, 0x00, 0xff, 0xff, 0x8a, 0xd5, 0xb9, 0x14, 0x23, 0x03,
	0x00, 0x00,
}
