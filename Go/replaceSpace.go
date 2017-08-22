package main

import (
	"strings"
	"fmt"
)

/*
* 请实现一个函数，将一个字符串中的空格替换成“%20”。
* 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

import (
	"strings"
	"fmt"
)

func replaceSpace(str string) string {
	return strings.Replace(str, " ", "%20", -1)
}

func main() {
	str := "we are good"
	fmt.Println(replaceSpace(str))
}
