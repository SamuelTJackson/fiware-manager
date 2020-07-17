package utils

import (
	"context"
	"fmt"
	log "github.com/sirupsen/logrus"
	"go.mongodb.org/mongo-driver/mongo"
	"go.mongodb.org/mongo-driver/mongo/options"
	"go.mongodb.org/mongo-driver/mongo/readpref"
	"strings"
	"time"
)

func CreateDBConnection(db DB) (*mongo.Database, error){
	clientOptions := options.Client()
	if len(db.Host) == 0 {
		return nil, fmt.Errorf("db host is not set")
	}
	clientOptions.SetHosts(strings.Split(db.Host, ","))
	authOptions := options.Credential{}
	if len(db.User) != 0 {
		authOptions.Username = db.User
	}
	if len(db.Password) != 0 {
		authOptions.Password = db.Password
	}
	if len(db.ReplicaSet) != 0 {
		clientOptions.SetReplicaSet(db.ReplicaSet)
	}
	if len(db.AuthDB) != 0 {
		authOptions.AuthSource = db.AuthDB
	}
	if len(db.Password) != 0 && len(db.User) != 0 {
		clientOptions.SetAuth(authOptions)
	}
	client, err := mongo.NewClient(clientOptions)
	if err != nil {
		return nil, err
	}
	ctx, _ := context.WithTimeout(context.Background(), 10 * time.Second)

	if err := client.Connect(ctx); err != nil {
		return nil, err
	}

	if err := client.Ping(context.Background(),readpref.Primary()); err != nil {
		return nil, err
	}
	log.Infof("connected to database %s", db.DB)
	return client.Database(db.DB), nil
}
