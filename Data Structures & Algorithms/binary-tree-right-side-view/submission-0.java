/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if(root == null)
        {
            return res;
        }
        queue.offer(root);
        int count = 1, tempCount = 0;
        while(!queue.isEmpty())
        {
            TreeNode temp = queue.poll();
            count --;
            if(temp.left != null)
            {
                tempCount++;
                queue.add(temp.left);
            }
            if(temp.right != null)
            {
                tempCount++;
                queue.add(temp.right);
            }
            if(count == 0)
            {
                res.add(temp.val);
                count = tempCount;
                tempCount = 0;
            }
        }
        return res;
    }
}
