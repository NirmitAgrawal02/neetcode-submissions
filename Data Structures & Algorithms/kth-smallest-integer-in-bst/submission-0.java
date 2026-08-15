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
    public int kthSmallest(TreeNode root, int k) {
        int[] val = new int[2];
        val[0] = k;
        inorder(root, val);
        return val[1];
    }
    public int inorder(TreeNode root, int[] val)
    {
        if(root == null)
        {
            return -1;
        }
        inorder(root.left, val);
        if(--val[0] == 0)
        {
            val[1] = root.val;
        }
        
        inorder(root.right, val);
        return val[1];
    }
}
