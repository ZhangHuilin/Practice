/**
* 删除链表中等于给定值val的所有节点。
*
* 样例
* 给出链表 1->2->3->3->4->5->3, 和 val = 3, 你需要返回删除3之后的链表：1->2->4->5。
* 考虑边界情况
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


public class Solution {
    /*
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        
        // 删除头部等于 val 的节点
        while(true){
            if(head == null) return null;
            if(head.val == val){
                head = head.next;
            }else break;
        }
        
        ListNode pre = head;
        ListNode tmp = head.next;
        
        while(tmp != null){
            if(tmp.val == val){
                pre.next = tmp.next;
                tmp = tmp.next;
            }else{
                pre = pre.next;
                tmp = tmp.next;
            }
        }
        return head;
        
    }
}