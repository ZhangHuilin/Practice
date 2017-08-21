# -*- coding:utf-8 -*-

# 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递
# 增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是
# 否含有该整数。


class Solution:
    # array 二维列表
    def Find(self, target, array):
        # write code here
        n = len(array)
        m = len(array[0])
        x = n-1
        y = 0
        
        while (x >= 0 and y < m):
            if target == array[x][y]:
                return 1
            elif target > array[x][y]:
                y += 1
                continue
            else:
                x -= 1
                continue
        return 0