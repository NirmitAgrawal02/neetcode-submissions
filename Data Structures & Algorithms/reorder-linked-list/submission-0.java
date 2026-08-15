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
    public void reorderList(ListNode head) {
        HashMap<Integer,ListNode> map = new HashMap<>();
        int count = 0;
        ListNode curr = head;
        while(curr != null)
        {
            map.put(count, curr);
            count++;
            curr = curr.next;
        }
        curr = head;
        int  i = 1;
        count--;
        for(;i <= count; i++)
        {
            System.out.println(i+ " " + count);
            if(i == count)
            {
                head.next = map.get(count);
                head = head.next;
                break;
            }
            head.next = map.get(count--);
            head = head.next;
            head.next = map.get(i);
            head = head.next;
            
        }
        // if(i - 1 == count)
        // {
        //     System.out.println(head.val);
        //     head.next = map.get(i);
        //     head = head.next;
        // }
        if(head != null) 
            head.next = null;
    }
}
