package utils

import (
	"fmt"
	"github.com/SamuelTJackson/keyrock"
	"github.com/dgrijalva/jwt-go"
	log "github.com/sirupsen/logrus"
	"time"
)

func ValidateToken(tokenString string, secret string) (string, error) {
	claims := &Claims{}
	token, err := jwt.ParseWithClaims(tokenString,claims,  func(token *jwt.Token) (interface{}, error) {
		// Don't forget to validate the alg is what you expect:
		if _, ok := token.Method.(*jwt.SigningMethodHMAC); !ok {
			return nil, fmt.Errorf("Unexpected signing method: %v", token.Header["alg"])
		}

		// hmacSampleSecret is a []byte containing your secret, e.g. []byte("my_secret_key")
		return []byte(secret), nil
	})
	if err != nil {
		return "", err
	}

	if !token.Valid  {
		return "", fmt.Errorf("token is not valid")
	}
	return claims.UserID, nil

}
type Claims struct {
	UserID string `json:"user_id"`
	jwt.StandardClaims
}
func CreateToken(tokenInfo *keyrock.TokenInfo, secret string) (string, error) {
	// Create a new token object, specifying signing method and the claims
	// you would like it to contain.
	log.Debugf("create jwt for user %s", tokenInfo.User.ID)
	token := jwt.NewWithClaims(jwt.SigningMethodHS256,  Claims{
		UserID:         tokenInfo.User.ID,
		StandardClaims: jwt.StandardClaims{
			ExpiresAt: tokenInfo.Expires.Unix(),
			IssuedAt:  time.Now().Unix(),
			Issuer:    "iot-manager",
			NotBefore: time.Now().Unix(),
		},
	})

	// Sign and get the complete encoded token as a string using the secret
	tokenString, err := token.SignedString([]byte(secret))
	if err != nil {
		return "", err
	}

	return tokenString, nil
}

