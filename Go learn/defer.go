package main

import (
	"fmt"
	"os"
)

func main() {

	//	defer is a keyword used to ensure that a function call is performed later in a program's execution, usually for purposes of cleanup. Deferred functions are executed in LIFO (last-in, first-out) order just before the surrounding function returns, regardless of whether the surrounding function terminates normally or via a panic.

	fmt.Println("Starting the program")

	// Defer the execution of the following function until the main function returns
	defer fmt.Println("Deferred function call")

	fmt.Println("Doing some work in the main function")

	// If you had multiple defer statements, they would execute in reverse order
	defer fmt.Println("Another deferred function call")

	fmt.Println("End of the program")

	// The defer statements delay the execution of their function calls until the surrounding function (main in this case) returns.
	// The defer statements execute in reverse order (LIFO). The last deferred call is executed first.

	//

	// the defer file.Close() statement ensures that the file is closed when the main function returns, even if an error occurs or the function exits early.
	file, err := os.Open("example.txt")
	if err != nil {
		fmt.Println("Error opening file:", err)
		return
	}
	// Ensure the file is closed when the function completes
	defer file.Close()

	// Perform file operations here

	fmt.Println("File opened successfully")
}
