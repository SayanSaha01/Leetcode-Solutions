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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)      
            return true;    //if both the roots are null, then we dont need to proceed any further, we return true
        
        if(p==null || q==null)  //if either of the roots are null, then we return false, as it is not equal to its counterpart
            return false;
        if(p.val==q.val)  //if the values of the roots match, then we go to the left and right subparts
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        return false;
    }
}