package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {

	reader := bufio.NewReader(os.Stdin)
	fmt.Print("Please enter your name: ")

	input, _ := reader.ReadString('\n')

	fmt.Println("Your Name is: ", input)

	// for integer
	rate, err := strconv.Atoi(strings.TrimSpace(input))
	if err != nil {
		fmt.Println(err)
	} else {
		fmt.Printf("You have %d requests\n", rate-20)
	}

}
