package main

import "fmt"

func main() {
	m := make(map[string]string)
	
	m["Test"] = "Aschheim"
	m["BMW"] = "München"

	fmt.Println(m)
	fmt.Println(m["BMW"])

	basicMap(m)
}

func basicMap(m map[string]string) {
	delete(m, "BMW")
	fmt.Println("The value:", m["BMW"])

	v, ok := m["BMW"]
	fmt.Println("[BMW] The value:", v, "Present?", ok)

	v, ok = m["Test"]
	fmt.Println("[Test] The value:", v, "Present?", ok)
}