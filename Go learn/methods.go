package main

import "fmt"

func main() {
	ajay := UserDetails{Name: "Ajay Negi", Age: 18, Email: "ajay@gmail.com", Status: "Okay"}

	fmt.Println(ajay)

	fmt.Println(ajay.GetStatus())
}

type UserDetails struct {
	Name   string
	Email  string
	Status string
	Age    int
}

func (user UserDetails) GetStatus() string {
	user.Status = "Good"
	return user.Status
}
