package main

import "fmt"

// iterate over Data Structure
func main() {

	nums := []int{1, 2, 3, 4, 5}
	sum := 0
	for index, num := range nums {
		sum += num
		fmt.Println("index:", index, "num:", num, "sum:", sum)
	}

	ma := map[string]string{"Name": "Vijay", "Age": "20"}
	for k, v := range ma {
		fmt.Println("k:", k, "v:", v)
	}

	name := "Bhupender Singh Negi"
	for i, unicode := range name { // here i is starting byte of rune
		fmt.Println(i, unicode)
		fmt.Println(i, string(unicode))

	}

}
