/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) 
        {
            return null;
        }
        HashMap<Node, Node> oldToCopy = new HashMap<>();
        oldToCopy.put(null, null);
        Node curr = head;
        while(curr != null)
        {
           if(!oldToCopy.containsKey(curr))
           {
            oldToCopy.put(curr, new Node(curr.val));
           }
           if((!oldToCopy.containsKey(curr.next)))
           {
            oldToCopy.put(curr.next, new Node(curr.next.val));
           }
           oldToCopy.get(curr).next = oldToCopy.get(curr.next);
           if(!oldToCopy.containsKey(curr.random))
           {
            oldToCopy.put(curr.random, new Node(curr.random.val));
           }
            oldToCopy.get(curr).random = oldToCopy.get(curr.random);

           curr = curr.next;
        }
        return oldToCopy.get(head);
    }
}
