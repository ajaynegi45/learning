package main

import (
	"fmt"
	"slices"
)

func main() {

	// Array
	// Fixed size, that is predictable
	// Memory optimization
	// Constant time access

	// Default values are Int -> 0, String -> "", Boolean -> false
	var nums [5]int
	var arr = [5]int{1, 2, 3, 4, 5}
	nums2 := [5]int{1, 2, 3, 4, 5}

	nums[2] = 5 // Add value in array

	fmt.Println(len(nums))        // used to get the size of the array
	fmt.Println(nums, arr, nums2) // Print the whole array

	// 2D Arrays
	twoDArr := [2][2]int{{1, 2}, {3, 4}}
	fmt.Println(twoDArr)

	// Slice ->  Dynamic Size
	// most used construct in go
	// + useful methods

	// uninitialised slice is nil
	var slice []int
	fmt.Println(slice)

	var emptySlice = []int{}
	fmt.Println(emptySlice)

	var slice2 = make([]int, 2) // No default nil value. We declared default starting size of it

	// make([]datatype, initial size, initial capacity) capacity -> maximum number of element it can fit in it
	// cap(slice2) // is used to get the capacity

	slice2 = append(slice2, 2)
	slice2 = append(slice2, 4)
	slice = append(slice, 2)
	slice[0] = 2

	copy(slice, slice2) // Copy slice data copy(destination,source)

	fmt.Println(slice2)

	// slice Operator
	fmt.Println(slice2[0:2]) // print in range name(starting : end); it excludes the last element
	fmt.Println(slice2[:2])
	fmt.Println(slice2[0:])

	// Equal two slices
	fmt.Println(slices.Equal(slice, slice2))

	// 2D Slice
	var array = [5][5]int{{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}}

	fmt.Println(array)
}
