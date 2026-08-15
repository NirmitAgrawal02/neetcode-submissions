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
    int[] maxDepth = new int[1];
    public int maxDepth(TreeNode root) {
        dfs(root, 0);
        return maxDepth[0];
    }
    public void dfs(TreeNode root, int height)
    {
        if(root == null)
        {
            maxDepth[0] = Math.max(maxDepth[0], height);
            return;
        }
        dfs(root.left, height + 1);
        dfs(root.right, height + 1);
    }
}
