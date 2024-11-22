package main

import "fmt"

func main() {

	nums := []int{1, 2, 3, 4, 5}
	fmt.Println(sum(nums...))

	fmt.Println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9))
	anyfun()

}

// Function can receive n number of parameters
func sum(nums ...int) int {
	total := 0
	for _, num := range nums {
		total += num
	}
	return total
}

// Function can receive n number of parameters
func anyfun(anytype ...interface{}) int {
	total := 0

	return total
}
