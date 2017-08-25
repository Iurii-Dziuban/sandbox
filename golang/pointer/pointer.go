package main

import "fmt"

func main() {
	i, j := 42, 2701

	p := &i
	fmt.Println("pointer value =", *p)
	*p = 21
	fmt.Println("i changed through pointer =", i)

	p = &j
	*p = *p / 37
	fmt.Println("j changed through pointer =", j)
}
