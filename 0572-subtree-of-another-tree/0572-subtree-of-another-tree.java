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
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        if(subroot==null)
            return true;
        if(root==null)
            return false;
        return issame(root,subroot) || 
               isSubtree(root.left,subroot) || 
               isSubtree(root.right,subroot);
    }
    public boolean issame(TreeNode r1, TreeNode r2)
    {
        if(r1==null && r2==null)
            return true;
        if(r1==null || r2==null)
            return false;
        
        if(r1.val!=r2.val)
            return false;
        
        return issame(r1.left,r2.left) && issame(r1.right,r2.right);
    }
}