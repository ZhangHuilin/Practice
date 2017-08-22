package main

/**
* 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递
* 增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是
* 否含有该整数。
 */

import (
	"fmt"
)

func find(target int, array [][]int)  bool {
	n := len(array)
	m := len(array[0])
	x := n - 1
    y := 0

	for n >= 0 && y < m {
		if target == array[x][y] {
			return true
		} else if target > array[x][y] {
			y++
			continue
		} else {
			x--
			continue
		}
	}
	return false
}

func main() {
	a := [][]int {
		{1, 2, 3, 4},
		{2, 3, 4, 5},
		{4, 5, 6, 7},
		{6, 7, 8, 9},
	}
	res := find(8, a)
	fmt.Println(res)
}