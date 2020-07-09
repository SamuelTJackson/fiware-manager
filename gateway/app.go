package gateway

import "net/http"

type Application interface {
	GetServiceGroups(writer http.ResponseWriter, request *http.Request) (int, error)
	CreateServiceGroup(writer http.ResponseWriter, request *http.Request) (int, error)
	GetServiceGroup(writer http.ResponseWriter, request *http.Request) (int, error)
	UpdateServiceGroup(writer http.ResponseWriter, request *http.Request) (int, error)
	DeleteServiceGroup(writer http.ResponseWriter, request *http.Request) (int, error)
	GetDevices(writer http.ResponseWriter, request *http.Request) (int, error)
	CreateDevice(writer http.ResponseWriter, request *http.Request) (int, error)
	UpdateDevice(writer http.ResponseWriter, request *http.Request) (int, error)
	DeleteDevice(writer http.ResponseWriter, request *http.Request) (int, error)
	RegisterIotAgents(writer http.ResponseWriter, request *http.Request) (int, error)
	GetIotAgents(writer http.ResponseWriter, request *http.Request) (int, error)
	UserInformation(writer http.ResponseWriter, request *http.Request) (int, error)
	LogoutHandler(writer http.ResponseWriter, request *http.Request) (int, error)
	LoginHandler(writer http.ResponseWriter, request *http.Request) (int, error)
	WebsocketHandler(writer http.ResponseWriter, request *http.Request) (int, error)
	UpdateLoraKey(writer http.ResponseWriter, request *http.Request) (int, error)
	GetLoraKey(writer http.ResponseWriter, request *http.Request) (int, error)
	GetChirpstackOrganizations(writer http.ResponseWriter, request *http.Request) (int, error)
	GetChirpstackApplications(writer http.ResponseWriter, request *http.Request) (int, error)
	GetChirpstackDevicesInApp(writer http.ResponseWriter, request *http.Request) (int, error)
	GetChirpstackGatewaysInOrganization(writer http.ResponseWriter, request *http.Request) (int, error)
	GetOrionEntities(writer http.ResponseWriter, request *http.Request) (int, error)
	GetOrionEntity(writer http.ResponseWriter, request *http.Request) (int, error)
	ValidateDataModel(writer http.ResponseWriter, request *http.Request) (int, error)
	AddSmartDataModelRepository(writer http.ResponseWriter, request *http.Request) (int, error)
}
