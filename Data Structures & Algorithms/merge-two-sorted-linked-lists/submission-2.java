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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
        {
            return  list2;
        }
        else if(list2 == null)
        {
            return list1;
        }
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = null, temp = null;
        while(temp1 != null || temp2 != null)
        {
            if(temp1 == null)
            {
                temp.next = temp2;
                break;
            }
            if(temp2 == null)
            {
                temp.next = temp1;
                break;
            }
            if(temp1.val < temp2.val)
            {
                if(head == null)
                {
                    head = temp1;
                    temp = temp1;
                }
                else
                {
                    temp.next = temp1;
                    temp = temp.next;
                }
                temp1 = temp1.next;
            }
            else
            {
                if(head == null)
                {
                    head = temp2;
                    temp = temp2;
                }
                else
                {
                    temp.next = temp2;
                    temp = temp.next;
                }
                temp2 = temp2.next;
            }
        }
        return head;
    }
}