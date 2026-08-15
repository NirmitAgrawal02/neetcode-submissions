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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        if(head.next == null && n == 1)
        {
            return null;
        }
        while(n > 0)
        {
            temp = temp.next;
            n--;
        }
        while(temp != null)
        {
            dummy = dummy.next;
            temp = temp.next;
        }
        if(dummy.next == head)
        {
            return head.next;
        }
        dummy.next = dummy.next.next;
        return head;
    }
}
