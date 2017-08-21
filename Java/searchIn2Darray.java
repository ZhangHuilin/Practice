/* 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递
* 增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是
* 否含有该整数。
*/

 public class Solution {
    public boolean Find(int target, int [][] array) {
        int len = array.length - 1;
        int i = 0;
        while ((len >= 0) && i < array[0].length) {
            if (target == array[len][i]) {
                return true;
            } else if (target < array[len][i]) {
                len --;
            } else {
                i++;
            }
        }
        return false;
    }
}