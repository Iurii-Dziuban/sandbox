package main

import "fmt"

func main() {
	primes := [6]int{2, 3, 5, 7, 11, 13}

	s := primes[1:4] // int[]
	fmt.Println(s)

	names := []string{
		"John",
		"Paul",
		"George",
		"Ringo",
	}
	printSlice(names)
	printSlice(names[1:3])

}

func printSlice(s []string) {
	fmt.Printf("len=%d cap=%d %v\n", len(s), cap(s), s)
}
