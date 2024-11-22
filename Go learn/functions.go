package main

import "fmt"

func main() {

	fmt.Println(add(1, 2))

	fmt.Println(name("ajay", "sahil"))
	name1, name2 := name("ajay", "sahil") // use underscore to suppress the compiler used the variable "name1, _"
	fmt.Println(name1, name2)

}

// Single return type
// func add(x int, y int) "Mention return type here" {
func add(x int, y int) int {
	return x + y
}

// Multiple return type
func name(x, y string) (string, string) {
	return x, y
}

// Multiple inputs
func inputs(values ...int) int {
	total := 0
	for _, value := range values {
		total += value
	}
	return total
}
