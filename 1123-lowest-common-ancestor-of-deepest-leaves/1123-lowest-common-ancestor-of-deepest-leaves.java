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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null)
            return root;
        int left = maxdepth(root.left);
        int right = maxdepth(root.right);
        
        if(left==right)
            return root;
        if(right>left)
            return lcaDeepestLeaves(root.right);
        else
            return lcaDeepestLeaves(root.left);
    }
    public int maxdepth(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1 + Math.max(maxdepth(root.left),maxdepth(root.right));
    }
}