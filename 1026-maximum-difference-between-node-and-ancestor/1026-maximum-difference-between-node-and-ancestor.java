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
    public int maxAncestorDiff(TreeNode root) {
        return maxdiff(root,root.val,root.val);
    }
    public int maxdiff(TreeNode root,int min,int max)
    {
        if(root==null)
            return max-min;
        
        max = Math.max(root.val,max);
        min = Math.min(root.val,min);
        
        int leftsubtree = maxdiff(root.left,min,max);
        int rightsubtree = maxdiff(root.right,min,max);
        
        return Math.max(leftsubtree,rightsubtree);
    }
}