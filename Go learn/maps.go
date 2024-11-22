package main

import (
	"fmt"
	"maps"
)

// maps -> hash, object, dictionary
func main() {

	m := make(map[string]string) // map[key datatype] value datatype

	ma := map[string]string{"Name": "Vijay", "Age": "20"}

	m["name"] = "Ajay Negi"
	m["age"] = "20"

	// IMP: If key does not exist in the map it returns default datatype value
	fmt.Println(m["name"], m["age"])

	delete(m, "name")
	clear(m)
	fmt.Println(len(m))

	// used to get elements
	value, ok := m["name"]
	if ok {
		fmt.Println(value)
	} else {
		fmt.Println("not exists")
	}
	fmt.Println(value, ok) // ok will returns true when present and false when key does not present. Value will give us the value of that key

	// check two map
	fmt.Println(maps.Equal(m, ma))
}
