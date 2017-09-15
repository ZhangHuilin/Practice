public class Solution {
    /*
     * @param num: a positive number
     * @return: true if it's a palindrome or false
     */
    public boolean isPalindrome(int num) {
        // write your code here
        String s = Integer.toString(num);
        
        String r = new StringBuffer(s).reverse().toString();
        if(s.equals(r)) return true;
        else return false;
    }
}