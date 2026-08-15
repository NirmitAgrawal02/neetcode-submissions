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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null)
        {
            return l2;
        }
        if(l2 == null)
        {
            return l1;
        }
        ListNode temp1 = l1, temp2 = l2;
        int carry = 0;
        while(temp1 != null || temp2 != null)
        {
            temp1.val = temp1.val + temp2.val + carry;
            if(temp1.val > 9)
            {
                temp1.val = temp1.val%10;
                carry = 1;
            }
            else
            {
                carry = 0;
            }
            if(temp1.next == null && temp2.next != null)
            {
                temp1.next = temp2.next;
                break;
            }
            if(temp2.next == null)
            {
                break;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;

        }
        while(carry == 1)
        {
            if(temp1.next == null)
            {
                temp1.next = new ListNode(1);
                return l1;
            }
            temp1.next.val = temp1.next.val + carry;
            if(temp1.next.val <= 9)
            {
                carry = 0;
                return l1;
            }
            else
            {
                temp1.next.val = temp1.next.val % 10;
            }
            
            temp1 = temp1.next;
        }
        return l1;
    }
}
