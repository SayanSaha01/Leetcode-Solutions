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
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        int lh = maxdepth(root.left);   //max height of left subtree
        int rh = maxdepth(root.right);  //max height of right subtree
        return (Math.abs(lh-rh)<=1 && 
           isBalanced(root.left) &&       //checking if the left and right subtree are balanced or not, if the left subtree contains another subtree which isnt balanced that is whose lh-rh>1 then it will return false, for a binary tree to be balanced both its left and right subtree's should be balanced as well as the subtree's of the left and right subtree
           isBalanced(root.right));
    }
    public int maxdepth(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1 + Math.max(maxdepth(root.left),maxdepth(root.right));
    }
}