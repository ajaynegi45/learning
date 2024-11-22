package main

import "fmt"

func main() {
	ajay := User{Name: "Ajay Negi", Age: 18, Email: "ajay@gmail.com", Status: "Okay"}

	fmt.Println(ajay)
}

type User struct {
	Name   string
	Email  string
	Status string
	Age    int
}
