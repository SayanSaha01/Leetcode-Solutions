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
        if(root == null)
        {
            return true;
        }
        int lh = height(root.left);  //will return the max possible height of left subtree
        int rh = height(root.right);  // will return the max possible height of right subtree
        return Math.abs(lh - rh) <= 1 && 
            isBalanced(root.left) && //checking for the left and right subtree whether they are balanced or not, if the left subtree which might consist of another subtree is not balanced then it will return false
            isBalanced(root.right);  
        
    }
    
    public int height(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        return Math.max(height(root.left) , height(root.right)) + 1;
    }
}