// Code generated by protoc-gen-go. DO NOT EDIT.
// source: serviceGroup.proto

/*
Package proto is a generated protocol buffer package.

It is generated from these files:
	serviceGroup.proto

It has these top-level messages:
	ServiceGroup
	Command
	Attribute
	StaticAttribute
	Lazy
	DeleteServiceGroupRequest
	CreateServiceGroupRequest
	ListServiceGroupsResponse
	UpdateServiceGroupRequest
	ServiceGroupResponse
	ServiceGroupRequest
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

type ServiceGroup struct {
	ApiKey           string             `protobuf:"bytes,1,opt,name=ApiKey,json=apikey,omitempty" json:"ApiKey,omitempty"`
	EntityType       string             `protobuf:"bytes,2,opt,name=EntityType,json=entity_type,omitempty" json:"EntityType,omitempty"`
	Resource         string             `protobuf:"bytes,3,opt,name=Resource,json=resource,omitempty" json:"Resource,omitempty"`
	Commands         []*Command         `protobuf:"bytes,4,rep,name=Commands,json=commands,omitempty" json:"Commands,omitempty"`
	Attributes       []*Attribute       `protobuf:"bytes,5,rep,name=Attributes,json=attributes,omitempty" json:"Attributes,omitempty"`
	StaticAttributes []*StaticAttribute `protobuf:"bytes,6,rep,name=StaticAttributes,json=static_attributes,omitempty" json:"StaticAttributes,omitempty"`
	Lazy             []*Lazy            `protobuf:"bytes,7,rep,name=Lazy,json=lazy,omitempty" json:"Lazy,omitempty"`
	Service          string             `protobuf:"bytes,8,opt,name=Service,json=service,omitempty" json:"Service,omitempty"`
	Subservice       string             `protobuf:"bytes,9,opt,name=Subservice,json=subservice,omitempty" json:"Subservice,omitempty"`
	ID               string             `protobuf:"bytes,10,opt,name=ID,json=_id,omitempty" json:"ID,omitempty"`
	Protocol         string             `protobuf:"bytes,11,opt,name=Protocol,json=protocol, omitempty" json:"Protocol,omitempty"`
}

func (m *ServiceGroup) Reset()                    { *m = ServiceGroup{} }
func (m *ServiceGroup) String() string            { return proto1.CompactTextString(m) }
func (*ServiceGroup) ProtoMessage()               {}
func (*ServiceGroup) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{0} }

func (m *ServiceGroup) GetApiKey() string {
	if m != nil {
		return m.ApiKey
	}
	return ""
}

func (m *ServiceGroup) GetEntityType() string {
	if m != nil {
		return m.EntityType
	}
	return ""
}

func (m *ServiceGroup) GetResource() string {
	if m != nil {
		return m.Resource
	}
	return ""
}

func (m *ServiceGroup) GetCommands() []*Command {
	if m != nil {
		return m.Commands
	}
	return nil
}

func (m *ServiceGroup) GetAttributes() []*Attribute {
	if m != nil {
		return m.Attributes
	}
	return nil
}

func (m *ServiceGroup) GetStaticAttributes() []*StaticAttribute {
	if m != nil {
		return m.StaticAttributes
	}
	return nil
}

func (m *ServiceGroup) GetLazy() []*Lazy {
	if m != nil {
		return m.Lazy
	}
	return nil
}

func (m *ServiceGroup) GetService() string {
	if m != nil {
		return m.Service
	}
	return ""
}

func (m *ServiceGroup) GetSubservice() string {
	if m != nil {
		return m.Subservice
	}
	return ""
}

func (m *ServiceGroup) GetID() string {
	if m != nil {
		return m.ID
	}
	return ""
}

func (m *ServiceGroup) GetProtocol() string {
	if m != nil {
		return m.Protocol
	}
	return ""
}

type Command struct {
	Name string `protobuf:"bytes,1,opt,name=Name,json=name" json:"Name,omitempty"`
	Type string `protobuf:"bytes,2,opt,name=Type,json=type" json:"Type,omitempty"`
}

func (m *Command) Reset()                    { *m = Command{} }
func (m *Command) String() string            { return proto1.CompactTextString(m) }
func (*Command) ProtoMessage()               {}
func (*Command) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{1} }

func (m *Command) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *Command) GetType() string {
	if m != nil {
		return m.Type
	}
	return ""
}

type Attribute struct {
	ObjectID string `protobuf:"bytes,1,opt,name=ObjectID,json=object_id" json:"ObjectID,omitempty"`
	Name     string `protobuf:"bytes,2,opt,name=Name,json=name" json:"Name,omitempty"`
	Type     string `protobuf:"bytes,3,opt,name=Type,json=type" json:"Type,omitempty"`
}

func (m *Attribute) Reset()                    { *m = Attribute{} }
func (m *Attribute) String() string            { return proto1.CompactTextString(m) }
func (*Attribute) ProtoMessage()               {}
func (*Attribute) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{2} }

func (m *Attribute) GetObjectID() string {
	if m != nil {
		return m.ObjectID
	}
	return ""
}

func (m *Attribute) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *Attribute) GetType() string {
	if m != nil {
		return m.Type
	}
	return ""
}

type StaticAttribute struct {
	Value string `protobuf:"bytes,1,opt,name=Value,json=value" json:"Value,omitempty"`
	Name  string `protobuf:"bytes,2,opt,name=Name,json=name" json:"Name,omitempty"`
	Type  string `protobuf:"bytes,3,opt,name=Type,json=type" json:"Type,omitempty"`
}

func (m *StaticAttribute) Reset()                    { *m = StaticAttribute{} }
func (m *StaticAttribute) String() string            { return proto1.CompactTextString(m) }
func (*StaticAttribute) ProtoMessage()               {}
func (*StaticAttribute) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{3} }

func (m *StaticAttribute) GetValue() string {
	if m != nil {
		return m.Value
	}
	return ""
}

func (m *StaticAttribute) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *StaticAttribute) GetType() string {
	if m != nil {
		return m.Type
	}
	return ""
}

type Lazy struct {
	Name string `protobuf:"bytes,1,opt,name=Name,json=name" json:"Name,omitempty"`
	Type string `protobuf:"bytes,2,opt,name=Type,json=type" json:"Type,omitempty"`
}

func (m *Lazy) Reset()                    { *m = Lazy{} }
func (m *Lazy) String() string            { return proto1.CompactTextString(m) }
func (*Lazy) ProtoMessage()               {}
func (*Lazy) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{4} }

func (m *Lazy) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *Lazy) GetType() string {
	if m != nil {
		return m.Type
	}
	return ""
}

type DeleteServiceGroupRequest struct {
	ServiceGroup *ServiceGroup `protobuf:"bytes,1,opt,name=serviceGroup" json:"serviceGroup,omitempty"`
}

func (m *DeleteServiceGroupRequest) Reset()                    { *m = DeleteServiceGroupRequest{} }
func (m *DeleteServiceGroupRequest) String() string            { return proto1.CompactTextString(m) }
func (*DeleteServiceGroupRequest) ProtoMessage()               {}
func (*DeleteServiceGroupRequest) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{5} }

func (m *DeleteServiceGroupRequest) GetServiceGroup() *ServiceGroup {
	if m != nil {
		return m.ServiceGroup
	}
	return nil
}

type CreateServiceGroupRequest struct {
	ServiceGroup *ServiceGroup `protobuf:"bytes,1,opt,name=serviceGroup" json:"serviceGroup,omitempty"`
}

func (m *CreateServiceGroupRequest) Reset()                    { *m = CreateServiceGroupRequest{} }
func (m *CreateServiceGroupRequest) String() string            { return proto1.CompactTextString(m) }
func (*CreateServiceGroupRequest) ProtoMessage()               {}
func (*CreateServiceGroupRequest) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{6} }

func (m *CreateServiceGroupRequest) GetServiceGroup() *ServiceGroup {
	if m != nil {
		return m.ServiceGroup
	}
	return nil
}

type ListServiceGroupsResponse struct {
	ServiceGroup []*ServiceGroup `protobuf:"bytes,1,rep,name=serviceGroup" json:"serviceGroup,omitempty"`
}

func (m *ListServiceGroupsResponse) Reset()                    { *m = ListServiceGroupsResponse{} }
func (m *ListServiceGroupsResponse) String() string            { return proto1.CompactTextString(m) }
func (*ListServiceGroupsResponse) ProtoMessage()               {}
func (*ListServiceGroupsResponse) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{7} }

func (m *ListServiceGroupsResponse) GetServiceGroup() []*ServiceGroup {
	if m != nil {
		return m.ServiceGroup
	}
	return nil
}

type UpdateServiceGroupRequest struct {
	ServiceGroup *ServiceGroup `protobuf:"bytes,1,opt,name=serviceGroup" json:"serviceGroup,omitempty"`
}

func (m *UpdateServiceGroupRequest) Reset()                    { *m = UpdateServiceGroupRequest{} }
func (m *UpdateServiceGroupRequest) String() string            { return proto1.CompactTextString(m) }
func (*UpdateServiceGroupRequest) ProtoMessage()               {}
func (*UpdateServiceGroupRequest) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{8} }

func (m *UpdateServiceGroupRequest) GetServiceGroup() *ServiceGroup {
	if m != nil {
		return m.ServiceGroup
	}
	return nil
}

type ServiceGroupResponse struct {
	ServiceGroup *ServiceGroup `protobuf:"bytes,1,opt,name=serviceGroup" json:"serviceGroup,omitempty"`
}

func (m *ServiceGroupResponse) Reset()                    { *m = ServiceGroupResponse{} }
func (m *ServiceGroupResponse) String() string            { return proto1.CompactTextString(m) }
func (*ServiceGroupResponse) ProtoMessage()               {}
func (*ServiceGroupResponse) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{9} }

func (m *ServiceGroupResponse) GetServiceGroup() *ServiceGroup {
	if m != nil {
		return m.ServiceGroup
	}
	return nil
}

type ServiceGroupRequest struct {
	Protocol string `protobuf:"bytes,1,opt,name=Protocol" json:"Protocol,omitempty"`
	ID       string `protobuf:"bytes,2,opt,name=ID" json:"ID,omitempty"`
}

func (m *ServiceGroupRequest) Reset()                    { *m = ServiceGroupRequest{} }
func (m *ServiceGroupRequest) String() string            { return proto1.CompactTextString(m) }
func (*ServiceGroupRequest) ProtoMessage()               {}
func (*ServiceGroupRequest) Descriptor() ([]byte, []int) { return fileDescriptor0, []int{10} }

func (m *ServiceGroupRequest) GetProtocol() string {
	if m != nil {
		return m.Protocol
	}
	return ""
}

func (m *ServiceGroupRequest) GetID() string {
	if m != nil {
		return m.ID
	}
	return ""
}

func init() {
	proto1.RegisterType((*ServiceGroup)(nil), "proto.ServiceGroup")
	proto1.RegisterType((*Command)(nil), "proto.Command")
	proto1.RegisterType((*Attribute)(nil), "proto.Attribute")
	proto1.RegisterType((*StaticAttribute)(nil), "proto.StaticAttribute")
	proto1.RegisterType((*Lazy)(nil), "proto.Lazy")
	proto1.RegisterType((*DeleteServiceGroupRequest)(nil), "proto.DeleteServiceGroupRequest")
	proto1.RegisterType((*CreateServiceGroupRequest)(nil), "proto.CreateServiceGroupRequest")
	proto1.RegisterType((*ListServiceGroupsResponse)(nil), "proto.ListServiceGroupsResponse")
	proto1.RegisterType((*UpdateServiceGroupRequest)(nil), "proto.UpdateServiceGroupRequest")
	proto1.RegisterType((*ServiceGroupResponse)(nil), "proto.ServiceGroupResponse")
	proto1.RegisterType((*ServiceGroupRequest)(nil), "proto.ServiceGroupRequest")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// Client API for ServiceGroupsService service

type ServiceGroupsServiceClient interface {
	DeleteServiceGroup(ctx context.Context, in *DeleteServiceGroupRequest, opts ...grpc.CallOption) (*google_protobuf1.Empty, error)
	CreateServiceGroup(ctx context.Context, in *CreateServiceGroupRequest, opts ...grpc.CallOption) (*google_protobuf1.Empty, error)
	ListServiceGroups(ctx context.Context, in *google_protobuf1.Empty, opts ...grpc.CallOption) (*ListServiceGroupsResponse, error)
	UpdateServiceGroup(ctx context.Context, in *UpdateServiceGroupRequest, opts ...grpc.CallOption) (*google_protobuf1.Empty, error)
	ServiceGroup(ctx context.Context, in *ServiceGroupRequest, opts ...grpc.CallOption) (*ServiceGroupResponse, error)
}

type serviceGroupsServiceClient struct {
	cc *grpc.ClientConn
}

func NewServiceGroupsServiceClient(cc *grpc.ClientConn) ServiceGroupsServiceClient {
	return &serviceGroupsServiceClient{cc}
}

func (c *serviceGroupsServiceClient) DeleteServiceGroup(ctx context.Context, in *DeleteServiceGroupRequest, opts ...grpc.CallOption) (*google_protobuf1.Empty, error) {
	out := new(google_protobuf1.Empty)
	err := grpc.Invoke(ctx, "/proto.ServiceGroupsService/DeleteServiceGroup", in, out, c.cc, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *serviceGroupsServiceClient) CreateServiceGroup(ctx context.Context, in *CreateServiceGroupRequest, opts ...grpc.CallOption) (*google_protobuf1.Empty, error) {
	out := new(google_protobuf1.Empty)
	err := grpc.Invoke(ctx, "/proto.ServiceGroupsService/CreateServiceGroup", in, out, c.cc, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *serviceGroupsServiceClient) ListServiceGroups(ctx context.Context, in *google_protobuf1.Empty, opts ...grpc.CallOption) (*ListServiceGroupsResponse, error) {
	out := new(ListServiceGroupsResponse)
	err := grpc.Invoke(ctx, "/proto.ServiceGroupsService/ListServiceGroups", in, out, c.cc, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *serviceGroupsServiceClient) UpdateServiceGroup(ctx context.Context, in *UpdateServiceGroupRequest, opts ...grpc.CallOption) (*google_protobuf1.Empty, error) {
	out := new(google_protobuf1.Empty)
	err := grpc.Invoke(ctx, "/proto.ServiceGroupsService/UpdateServiceGroup", in, out, c.cc, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *serviceGroupsServiceClient) ServiceGroup(ctx context.Context, in *ServiceGroupRequest, opts ...grpc.CallOption) (*ServiceGroupResponse, error) {
	out := new(ServiceGroupResponse)
	err := grpc.Invoke(ctx, "/proto.ServiceGroupsService/ServiceGroup", in, out, c.cc, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// Server API for ServiceGroupsService service

type ServiceGroupsServiceServer interface {
	DeleteServiceGroup(context.Context, *DeleteServiceGroupRequest) (*google_protobuf1.Empty, error)
	CreateServiceGroup(context.Context, *CreateServiceGroupRequest) (*google_protobuf1.Empty, error)
	ListServiceGroups(context.Context, *google_protobuf1.Empty) (*ListServiceGroupsResponse, error)
	UpdateServiceGroup(context.Context, *UpdateServiceGroupRequest) (*google_protobuf1.Empty, error)
	ServiceGroup(context.Context, *ServiceGroupRequest) (*ServiceGroupResponse, error)
}

func RegisterServiceGroupsServiceServer(s *grpc.Server, srv ServiceGroupsServiceServer) {
	s.RegisterService(&_ServiceGroupsService_serviceDesc, srv)
}

func _ServiceGroupsService_DeleteServiceGroup_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteServiceGroupRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ServiceGroupsServiceServer).DeleteServiceGroup(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/proto.ServiceGroupsService/DeleteServiceGroup",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ServiceGroupsServiceServer).DeleteServiceGroup(ctx, req.(*DeleteServiceGroupRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ServiceGroupsService_CreateServiceGroup_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateServiceGroupRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ServiceGroupsServiceServer).CreateServiceGroup(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/proto.ServiceGroupsService/CreateServiceGroup",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ServiceGroupsServiceServer).CreateServiceGroup(ctx, req.(*CreateServiceGroupRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ServiceGroupsService_ListServiceGroups_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(google_protobuf1.Empty)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ServiceGroupsServiceServer).ListServiceGroups(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/proto.ServiceGroupsService/ListServiceGroups",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ServiceGroupsServiceServer).ListServiceGroups(ctx, req.(*google_protobuf1.Empty))
	}
	return interceptor(ctx, in, info, handler)
}

func _ServiceGroupsService_UpdateServiceGroup_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateServiceGroupRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ServiceGroupsServiceServer).UpdateServiceGroup(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/proto.ServiceGroupsService/UpdateServiceGroup",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ServiceGroupsServiceServer).UpdateServiceGroup(ctx, req.(*UpdateServiceGroupRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ServiceGroupsService_ServiceGroup_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ServiceGroupRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ServiceGroupsServiceServer).ServiceGroup(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/proto.ServiceGroupsService/ServiceGroup",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ServiceGroupsServiceServer).ServiceGroup(ctx, req.(*ServiceGroupRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _ServiceGroupsService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "proto.ServiceGroupsService",
	HandlerType: (*ServiceGroupsServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "DeleteServiceGroup",
			Handler:    _ServiceGroupsService_DeleteServiceGroup_Handler,
		},
		{
			MethodName: "CreateServiceGroup",
			Handler:    _ServiceGroupsService_CreateServiceGroup_Handler,
		},
		{
			MethodName: "ListServiceGroups",
			Handler:    _ServiceGroupsService_ListServiceGroups_Handler,
		},
		{
			MethodName: "UpdateServiceGroup",
			Handler:    _ServiceGroupsService_UpdateServiceGroup_Handler,
		},
		{
			MethodName: "ServiceGroup",
			Handler:    _ServiceGroupsService_ServiceGroup_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "serviceGroup.proto",
}

func init() { proto1.RegisterFile("serviceGroup.proto", fileDescriptor0) }

var fileDescriptor0 = []byte{
	// 601 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xac, 0x95, 0xc1, 0x4e, 0xdb, 0x40,
	0x10, 0x86, 0x4b, 0x9c, 0x40, 0x32, 0xa1, 0x14, 0x96, 0x14, 0x19, 0xa7, 0x87, 0x28, 0x6a, 0x25,
	0x90, 0x90, 0x51, 0xd3, 0x4a, 0x95, 0x7a, 0x8b, 0x08, 0xaa, 0xa2, 0xd2, 0x26, 0x72, 0x68, 0xaf,
	0xd1, 0xc6, 0x99, 0x22, 0xb7, 0xb1, 0xd7, 0xf5, 0xae, 0x91, 0xcc, 0x13, 0xf5, 0x25, 0x2b, 0x55,
	0x5e, 0x6f, 0xdc, 0x4d, 0x62, 0xa3, 0x1c, 0x38, 0xa1, 0x99, 0xf9, 0xe7, 0xe3, 0x67, 0x66, 0xd6,
	0x00, 0xe1, 0x18, 0xdd, 0x7b, 0x2e, 0x7e, 0x8a, 0x58, 0x1c, 0xda, 0x61, 0xc4, 0x04, 0x23, 0x35,
	0xf9, 0xc3, 0x7a, 0x75, 0xc7, 0xd8, 0xdd, 0x02, 0x2f, 0x69, 0xe8, 0x5d, 0xd2, 0x20, 0x60, 0x82,
	0x0a, 0x8f, 0x05, 0x3c, 0x13, 0x59, 0x6d, 0x55, 0x95, 0xd1, 0x2c, 0xfe, 0x71, 0x89, 0x7e, 0x28,
	0x92, 0xac, 0xd8, 0xfd, 0x6b, 0xc0, 0xfe, 0x44, 0x03, 0x93, 0x0e, 0xec, 0xf6, 0x43, 0xef, 0x33,
	0x26, 0xe6, 0x4e, 0x67, 0xe7, 0xac, 0xe1, 0x1c, 0xd2, 0xd0, 0xfb, 0x85, 0xc9, 0x05, 0xf3, 0x3d,
	0x21, 0x1b, 0xc9, 0x39, 0xc0, 0x75, 0x20, 0x3c, 0x91, 0xdc, 0x26, 0x21, 0x9a, 0x15, 0xa9, 0x7a,
	0x89, 0x32, 0x33, 0x15, 0x49, 0x88, 0x9a, 0xf4, 0x35, 0xd4, 0x1d, 0xe4, 0x2c, 0x8e, 0x5c, 0x34,
	0x0d, 0x29, 0x24, 0x91, 0x8a, 0x35, 0xd5, 0x7b, 0xa8, 0x5f, 0x31, 0xdf, 0xa7, 0xc1, 0x9c, 0x9b,
	0xd5, 0x8e, 0x71, 0xd6, 0xec, 0x1d, 0x64, 0xee, 0x6c, 0x95, 0x76, 0x88, 0xab, 0xea, 0x5a, 0xd7,
	0x47, 0x80, 0xbe, 0x10, 0x91, 0x37, 0x8b, 0x05, 0x72, 0xb3, 0x26, 0xfb, 0x0e, 0x55, 0x5f, 0x5e,
	0x70, 0x5a, 0x34, 0xd7, 0x68, 0xbd, 0x5f, 0xe0, 0x70, 0x92, 0x0e, 0xc9, 0xd5, 0x08, 0xbb, 0x92,
	0x70, 0xa2, 0x08, 0x6b, 0x65, 0xa7, 0xcd, 0x65, 0x62, 0x5a, 0x88, 0x3b, 0x87, 0xea, 0x0d, 0x7d,
	0x48, 0xcc, 0x3d, 0x89, 0x68, 0x2a, 0x44, 0x9a, 0x72, 0x0e, 0x16, 0xf4, 0x41, 0x1f, 0x5e, 0x17,
	0xf6, 0xd4, 0xb8, 0xcd, 0xba, 0x1c, 0xc8, 0x91, 0x5a, 0xab, 0xa6, 0x39, 0x03, 0x98, 0xc4, 0x33,
	0x95, 0x37, 0x1b, 0x52, 0xd6, 0xe2, 0x79, 0x46, 0x53, 0x9e, 0x42, 0x65, 0x38, 0x30, 0x41, 0x2a,
	0x9e, 0x4f, 0xbd, 0xb9, 0x56, 0x7a, 0x03, 0xf5, 0x71, 0x6a, 0xc3, 0x65, 0x0b, 0xb3, 0x29, 0x05,
	0xc7, 0xa1, 0x8a, 0x2f, 0x3a, 0xb9, 0xac, 0xfb, 0x16, 0xf6, 0xd4, 0x90, 0x09, 0x81, 0xea, 0x57,
	0xea, 0xa3, 0xda, 0x7b, 0x35, 0xa0, 0x3e, 0xa6, 0x39, 0x6d, 0xcb, 0xd5, 0x74, 0xbd, 0xdd, 0x31,
	0x34, 0xf2, 0xb9, 0x90, 0x36, 0xd4, 0x47, 0xb3, 0x9f, 0xe8, 0x8a, 0xe1, 0x40, 0x35, 0x36, 0x98,
	0x8c, 0xa7, 0xde, 0x7f, 0x62, 0xa5, 0x80, 0x68, 0x68, 0xc4, 0x11, 0xbc, 0x58, 0x9b, 0x37, 0x69,
	0x41, 0xed, 0x3b, 0x5d, 0xc4, 0x4b, 0x37, 0xb5, 0xfb, 0x34, 0xd8, 0x1a, 0x68, 0x67, 0x0b, 0xd9,
	0xfa, 0x4f, 0xba, 0x85, 0xd3, 0x01, 0x2e, 0x50, 0xa0, 0xfe, 0x14, 0x1c, 0xfc, 0x1d, 0x23, 0x17,
	0xe4, 0x03, 0xec, 0xeb, 0x4f, 0x4f, 0xc2, 0x9a, 0xbd, 0xe3, 0xe5, 0xa1, 0xe8, 0x1d, 0x2b, 0xc2,
	0x94, 0x7a, 0x15, 0x21, 0x7d, 0x7a, 0xea, 0x8d, 0xc7, 0x85, 0xae, 0xe0, 0x0e, 0xf2, 0x90, 0x05,
	0x1c, 0x0b, 0xa8, 0xc6, 0xd6, 0xd4, 0x6f, 0xe1, 0xfc, 0xa9, 0xbd, 0x8e, 0xa0, 0xb5, 0xca, 0x2b,
	0xb5, 0xb9, 0x25, 0xb0, 0x0f, 0xc7, 0x45, 0x06, 0x2d, 0xed, 0xd8, 0xb3, 0x5d, 0xe7, 0x31, 0x39,
	0x90, 0x6f, 0x24, 0xdb, 0x76, 0x65, 0x38, 0xe8, 0xfd, 0x31, 0x56, 0x4d, 0x71, 0x15, 0x90, 0x31,
	0x90, 0xcd, 0x23, 0x20, 0x1d, 0x65, 0xaa, 0xf4, 0x3e, 0xac, 0x13, 0x3b, 0xfb, 0xc0, 0xda, 0xcb,
	0x0f, 0xac, 0x7d, 0x2d, 0x9f, 0xd6, 0xb3, 0x94, 0xb8, 0x79, 0x00, 0x39, 0xb1, 0xf4, 0x36, 0x1e,
	0x21, 0x8e, 0xe0, 0x68, 0x63, 0xf9, 0xa4, 0x44, 0x6e, 0x2d, 0x7f, 0x51, 0xe9, 0xb9, 0x64, 0x16,
	0x37, 0xf7, 0x9e, 0x5b, 0x2c, 0x3d, 0x89, 0x47, 0x2c, 0x0e, 0xd7, 0xfe, 0xa1, 0x58, 0x45, 0x5b,
	0x55, 0x94, 0x76, 0x61, 0x6d, 0x69, 0x6e, 0xb6, 0x2b, 0xab, 0xef, 0xfe, 0x05, 0x00, 0x00, 0xff,
	0xff, 0xd1, 0x51, 0x5c, 0x7d, 0xfb, 0x06, 0x00, 0x00,
}