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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
        {
            return null;
        }
        if(lists.length == 1)
        {
            return lists[0];
        }
        return mergeSort(lists, 0, lists.length - 1);
    }
    public ListNode mergeSort(ListNode[] lists, int i , int n)
    {
        if(i > n)
        {
            return null;
        }
        if(i == n)
        {
            return lists[i];
        }
        int mid = i + (n - i) / 2;
        ListNode left = mergeSort(lists, i, mid);
        ListNode right = mergeSort(lists, mid + 1, n);
        return merge(left,right);
    }
    public ListNode merge(ListNode left, ListNode right)
    {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        while(left != null && right != null)
        {
            if(left.val < right.val)
            {
                prev.next = left;
                prev = prev.next;
                left = left.next;
            }
            else
            {
                prev.next = right;
                prev = prev.next;
                right = right.next;
            }
        }
        if(left != null)
        {
            prev.next = left;
        }
        if(right != null)
        {
            prev.next = right;
        }
        return dummy.next;
    }
}
