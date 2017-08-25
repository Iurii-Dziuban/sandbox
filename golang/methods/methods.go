package main

import (
	"fmt"
	"math"
)

//MyFloat - docs
type MyFloat float64


//Abs - docs
func (f MyFloat) Abs() float64 {
	if f < 0 {
		return float64(-f)
	}
	return float64(f)
}

//Vertex - documention
type Vertex struct {
	X, Y float64
}

func (v Vertex) abs() float64 {
	return math.Sqrt(v.X*v.X + v.Y*v.Y)
}

func (v *Vertex) scale(f float64) {
	v.X = v.X * f
	v.Y = v.Y * f
}

func main() {
	f := MyFloat(-math.Sqrt2)
	fmt.Println(f.Abs())

	v := Vertex{3, 4}
	v.scale(10) // see the pointer
	fmt.Println(v.abs())
}

