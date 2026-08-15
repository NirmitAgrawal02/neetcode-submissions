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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
        {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int count = 1, temp = 0;
        queue.offer(root);
        List<Integer> t = new ArrayList<>();
        while(!queue.isEmpty())
        {
            TreeNode node = queue.poll();
            count --; 
            if(node.left != null)
            {
                temp++;
                queue.offer(node.left);
            }
            if(node.right != null)
            {
                temp++;
                queue.offer(node.right);
            }
            t.add(node.val);
            if(count == 0)
            {
                res.add(new ArrayList<>(t));
                count = temp;
                temp = 0;
                t.clear();
            }
        }
        return res;
    }
}
