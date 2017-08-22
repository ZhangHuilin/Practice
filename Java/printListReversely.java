/**
* 输入一个链表，从尾到头打印链表每个节点的值。
*/

/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> a = new ArrayList<Integer> ();
        while (listNode != null) {
            a.add(0, listNode.val);
            listNode = listNode.next;
        }
        return a;
    }
}