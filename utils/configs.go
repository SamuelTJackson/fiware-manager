package utils

import (
	"github.com/BurntSushi/toml"
	"io/ioutil"
	"os"
)

func GetConfigs(filePath string, config interface{}) error {
	file, err := os.Open(filePath)
	if err != nil {
		return err
	}
	b, err := ioutil.ReadAll(file)
	if err != nil {
		return err
	}
	if _, err := toml.Decode(string(b), config); err != nil {
		return err
	}
	return nil
}
