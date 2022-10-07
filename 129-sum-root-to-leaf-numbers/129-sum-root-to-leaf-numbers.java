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
        return sum(root,0);
    }
    private int sum(TreeNode root,int s)
    {
        if(root==null)
            return 0;
        else if(root.left==null && root.right==null)
            return root.val+s*10;
        else
            return sum(root.left,root.val+s*10)+
            sum(root.right,root.val+s*10);
    }
}