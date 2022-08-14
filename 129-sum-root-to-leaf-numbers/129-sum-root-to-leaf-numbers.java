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
    public int sumNumbers(TreeNode root) {
        return rootsum(root,0);
    }
    private int rootsum(TreeNode root,int s)
    {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return root.val+s*10;
        return rootsum(root.left,root.val+s*10)+rootsum(root.right,root.val+s*10);
    }
}