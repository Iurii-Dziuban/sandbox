package main

import "fmt"

func main() {
	defer fmt.Println("world")

	fmt.Println("hello")

	defer fmt.Println("world 2")

	a()
}

func a() {
    i := 0
    defer fmt.Println("index", i)
    i++
    return
}
