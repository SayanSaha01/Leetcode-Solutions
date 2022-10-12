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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)      //root cannot be null, as if the root is null and the subroot has some address then how can the subroot be a subtree of root
            return false;
        if(subRoot==null)
            return true;     //subroot can be null and still be a subtree as null is a subtree of every tree
        return check(root,subRoot) ||    
               isSubtree(root.left,subRoot) || 
               isSubtree(root.right,subRoot); //either of the three function calls need to be true, in that case we can say that there exists a subroot
    }
    public boolean check(TreeNode root,TreeNode subroot)
    {
        if(root==null && subroot==null)   
            return true;
        if(root==null || subroot==null)
            return false;
        return root.val==subroot.val && 
               check(root.left,subroot.left) && 
               check(root.right,subroot.right);
    }
}