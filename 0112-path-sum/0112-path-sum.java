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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        /*if(root.val==targetSum)
            return true;  
this doesnt work, as it maybe the first node itself, it may satisfy the condition but it may have some left and right leaf nodes. 
Consider the cases root = 5, sum=5 it will satisfy the condition but if
[5,2,3] and sum=5 then it wont satisfy as 5-2 & 5-3 is a path, we cant just break and take a node out of the root-to-leaf path and call it a path, for the condition to satisfy the node should have the left and right nodes as null then only we can say it satisfies the condition root-to-leaf.*/ 
        if(root.left==null && root.right==null && root.val==targetSum)
            return true;
        return hasPathSum(root.left,targetSum-root.val) || 
               hasPathSum(root.right,targetSum-root.val);
    }
}