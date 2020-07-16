package utils

import (
	"context"
	"fmt"
	"go.mongodb.org/mongo-driver/mongo"
	"go.mongodb.org/mongo-driver/mongo/options"
	"go.mongodb.org/mongo-driver/mongo/readpref"
	"strings"
	"time"
)

func CreateDBConnection(db DB) (*mongo.Client, error){
	clientOptions := options.Client()
	if len(db.Host) == 0 {
		return nil, fmt.Errorf("db host is not set")
	}
	clientOptions.Hosts = strings.Split(db.Host, ",")
	if len(db.User) != 0 {
		clientOptions.Auth.Username = db.User
	}
	if len(db.Password) != 0 {
		clientOptions.Auth.Password = db.Password
	}
	if len(db.ReplicaSet) != 0 {
		clientOptions.ReplicaSet = &db.ReplicaSet
	}
	if len(db.AuthDB) != 0 {
		clientOptions.Auth.AuthSource = db.AuthDB
	}
	client, err := mongo.NewClient(clientOptions)
	if err != nil {
		return nil, err
	}
	ctx, _ := context.WithTimeout(context.Background(), 10*time.Second)
	if err := client.Connect(ctx); err != nil {
		return nil, err
	}

	if err := client.Ping(context.Background(),readpref.Primary()); err != nil {
		return nil, err
	}
	return client, nil
}
