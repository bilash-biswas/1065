package main

import (
	"fmt"
)

func main() {
	var a [5]int
	var i, count int
	count = 0
	for i = 0; i < 5; i++ {
		fmt.Scan(&a[i])
	}
	for i = 0; i < 5; i++ {
		if a[i] % 2 == 0 {
			count++
		}
	}
	fmt.Printf("%d valores pares\n", count)
}
