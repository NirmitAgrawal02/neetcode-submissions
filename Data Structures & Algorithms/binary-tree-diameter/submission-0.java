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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        int[] maxLength = new int[1];
        dfs(root, maxLength);
        return maxLength[0];
        
    }
    public int dfs(TreeNode root, int[] maxLength)
    {
        if(root == null)
        {
            return 0;
        }
        int left = dfs(root.left, maxLength);
        int right = dfs(root.right, maxLength);
        
        maxLength[0] = Math.max(maxLength[0], left + right);
        return 1 + Math.max(left, right);
    }
}
