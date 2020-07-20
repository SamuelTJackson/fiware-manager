package serviceGroups

import "github.com/SamuelTJackson/fiware-manager/proto"

type ServiceGroupListResponse struct {
	Count    int             `json:"count,omitempty"`
	Services []*proto.ServiceGroup `json:"services"`
}
