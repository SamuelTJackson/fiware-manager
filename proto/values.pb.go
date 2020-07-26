// Code generated by protoc-gen-go. DO NOT EDIT.
// source: values.proto

package proto

import proto1 "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import _ "google.golang.org/genproto/googleapis/api/annotations"
import _ "github.com/golang/protobuf/ptypes/empty"

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto1.Marshal
var _ = fmt.Errorf
var _ = math.Inf

type Lazy struct {
	Name string `protobuf:"bytes,1,opt,name=Name,json=name" json:"Name,omitempty"`
	Type string `protobuf:"bytes,2,opt,name=Type,json=type" json:"Type,omitempty"`
}

func (m *Lazy) Reset()                    { *m = Lazy{} }
func (m *Lazy) String() string            { return proto1.CompactTextString(m) }
func (*Lazy) ProtoMessage()               {}
func (*Lazy) Descriptor() ([]byte, []int) { return fileDescriptor3, []int{0} }

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

func init() {
	proto1.RegisterType((*Lazy)(nil), "proto.Lazy")
}

func init() { proto1.RegisterFile("values.proto", fileDescriptor3) }

var fileDescriptor3 = []byte{
	// 130 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0xe2, 0x29, 0x4b, 0xcc, 0x29,
	0x4d, 0x2d, 0xd6, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0x62, 0x05, 0x53, 0x52, 0x32, 0xe9, 0xf9,
	0xf9, 0xe9, 0x39, 0xa9, 0xfa, 0x89, 0x05, 0x99, 0xfa, 0x89, 0x79, 0x79, 0xf9, 0x25, 0x89, 0x25,
	0x99, 0xf9, 0x79, 0x50, 0x45, 0x52, 0xd2, 0x50, 0x59, 0x30, 0x2f, 0xa9, 0x34, 0x4d, 0x3f, 0x35,
	0xb7, 0xa0, 0xa4, 0x12, 0x22, 0xa9, 0xa4, 0xc7, 0xc5, 0xe2, 0x93, 0x58, 0x55, 0x29, 0x24, 0xc4,
	0xc5, 0xe2, 0x97, 0x98, 0x9b, 0x2a, 0xc1, 0xa8, 0xc0, 0xa8, 0xc1, 0x19, 0xc4, 0x92, 0x97, 0x98,
	0x9b, 0x0a, 0x12, 0x0b, 0xa9, 0x2c, 0x48, 0x95, 0x60, 0x82, 0x88, 0x95, 0x54, 0x16, 0xa4, 0x26,
	0xb1, 0x81, 0xb5, 0x19, 0x03, 0x02, 0x00, 0x00, 0xff, 0xff, 0xe3, 0x24, 0x6f, 0xb2, 0x88, 0x00,
	0x00, 0x00,
}