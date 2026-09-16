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
        List<List<Integer>> result = new ArrayList<>();

        if(root == null)
        {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int total = 1, sub = 0;
        List<Integer> solution = new ArrayList<>();
        while(!queue.isEmpty())
        {
            TreeNode temp = queue.poll();
            solution.add(temp.val);
            total--;
            if(temp.left != null)
            {
                queue.add(temp.left);
                sub++;
            }
            if(temp.right != null)
            {
                queue.add(temp.right);
                sub++;
            }
            if(total == 0)
            {
                total = sub;
                sub = 0;
                result.add(solution);
                solution = new ArrayList<>();
            }
        }
        return result;
    }
}
