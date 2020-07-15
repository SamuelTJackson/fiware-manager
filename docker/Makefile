.PHONY: gateway serviceGroups
gateway:
	docker build -t fiware-manager-gateway:latest -f ../gateway/Dockerfile ../gateway

serviceGroups:
	docker build -t fiware-manager-servicegroups:latest -f ../serviceGroups/Dockerfile ../serviceGroups
