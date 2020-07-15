package utils

import (
	"flag"
	"github.com/BurntSushi/toml"
	"io/ioutil"
	"os"
)

type Config struct {
	Gateway Gateway
	ServiceGroup ServiceGroup
	IotAgents IotAgents
}
type ServiceGroup struct {
	Host string
	Port int
}
type Gateway struct {
	Port int
}

type IotAgents struct {
	Json Json
}

type Json struct {
	Host string
	Port int
}
func GetConfigs() (*Config, error){
	var configurationPath string
	flag.StringVar(&configurationPath, "config", "../config.toml", "Path for the configuration file.")
	flag.Parse()
	file, err := os.Open(configurationPath)
	if err != nil {
		return nil, err
	}
	b, err := ioutil.ReadAll(file)
	if err != nil {
		return nil, err
	}
	config := &Config{}
	if _, err := toml.Decode(string(b), config); err != nil {
		return nil, err
	}
	return config, nil
}
