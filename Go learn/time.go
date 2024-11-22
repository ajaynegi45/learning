package main

import (
	"fmt"
	"time"
)

func main() {

	// to get current time
	var currentTime = time.Now()

	fmt.Println(currentTime.Format("2006-01-02 15:03:05 Monday"))

}
