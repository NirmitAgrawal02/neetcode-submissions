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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      HashMap<Integer, Integer> indices = new HashMap<>();
      for(int i = 0; i < inorder.length; i++)
      {
        indices.put(inorder[i], i);
      }
      int[] idx = new int[1];
      return dfs(preorder,0 , inorder.length - 1, indices, idx);
    }
    public TreeNode dfs(int[] preorder, int l, int r, HashMap<Integer, Integer> indices, int[] idx)
    {
      if(l > r)
      {
        return null;
      }
      int root_val = preorder[idx[0]];
      idx[0] = idx[0] + 1;
      TreeNode root = new TreeNode(root_val);
      int mid = indices.get(root.val);
      root.left=dfs(preorder, l, mid - 1, indices, idx);
      root.right=dfs(preorder, mid + 1, r, indices, idx);
      return root;
    }
}
