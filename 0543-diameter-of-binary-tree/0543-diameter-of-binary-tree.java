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
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null)
            return 0;
        //max diameter lies in left subtree
        int op1 = diameterOfBinaryTree(root.left);
        
        //max diameter lies in right subtree
        int op2 = diameterOfBinaryTree(root.right);
        
        //max diameter passes through the root
        int op3 = height(root.left) + height(root.right);
        
        return Math.max(op1,Math.max(op2,op3));
    }
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
}