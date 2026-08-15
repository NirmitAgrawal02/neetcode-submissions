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
    public ListNode[] reverseGroup(ListNode prev, int k)
    {
        ListNode curr = prev;
        while(k > 1 && curr.next != null)
        {
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = prev;
            prev = temp;
            k--;
        }
        ListNode[] values = {prev, curr};
        return values;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode check = head;
        while(check != null)
        {
            count++;
            check = check.next;
        }
        if(count < k)
        {
            return head;
        }
        else if(count % k != 0)
        {
            count -= (count % k);
        }
        int iterance = count / k;
        ListNode startingPoint = new ListNode(0);
        ListNode dummy = startingPoint;
        ListNode prev = head;
        while(iterance > 0)
        {     
            ListNode[] values = reverseGroup(prev, k);
            if(dummy.next == null)
            {
                dummy.next = values[0];
            }
            else
            {
                dummy.next = values[0];
            }
            prev = values[1];
            
            if(prev.next != null)
            {
                dummy = prev;
                prev = prev.next;
            }
            iterance -=1;
        }
        return startingPoint.next;
    }
}
