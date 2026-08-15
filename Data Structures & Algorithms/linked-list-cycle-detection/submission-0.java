/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode turtle = head;
        ListNode rabbit = head;
        while(rabbit != null)
        {
            if(rabbit.next != null)
            {
                rabbit = rabbit.next.next;
            }
            else
            {
                return false;
            }
            turtle = turtle.next;
            if(rabbit == turtle)
            {
                return true;
            }
        }
        return false;
    }
}
