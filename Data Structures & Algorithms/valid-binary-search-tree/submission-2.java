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
    public boolean isValidBST(TreeNode root) {
        if(root == null)
        {
            return true;
        }
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean dfs(TreeNode root, long leftVal, long rightVal)
    {
        if(root == null)
        {
            return true;
        }
        if(!(leftVal < root.val && root.val < rightVal))
        {
            return false;
        }
        return dfs(root.left, leftVal,root.val) && dfs(root.right, root.val, rightVal);
    }
}
