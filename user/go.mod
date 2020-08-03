module "user"

//replace github.com/SamuelTJackson/fiware-manager/utils => /home/sam/Documents/private/fiware-manager/utils
//replace github.com/SamuelTJackson/fiware-manager/proto => /home/sam/Documents/private/fiware-manager/proto

replace github.com/SamuelTJackson/fiware-manager/utils => /home/samuel/Documents/private/fiware-manager/utils

replace github.com/SamuelTJackson/fiware-manager/proto => /home/samuel/Documents/private/fiware-manager/proto

require (
	github.com/SamuelTJackson/fiware-manager/proto v0.0.0-20200708191427-4959795e281a
	github.com/SamuelTJackson/fiware-manager/utils v0.0.0-20200708183204-d88aa0d9f03f
	github.com/golang/protobuf v1.4.2
	golang.org/x/net v0.0.0-20200707034311-ab3426394381 // indirect
	google.golang.org/genproto v0.0.0-20200707001353-8e8330bf89df // indirect
	google.golang.org/grpc v1.30.0
)