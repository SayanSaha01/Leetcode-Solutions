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
    public int goodNodes(TreeNode root) {
        return 1+count(root.left,root.val)+count(root.right,root.val);
    }
    public int count(TreeNode root,int currmax)
    {
        int amount=0;
        if(root==null)
            return 0;
        if(root.val>=currmax)
        {
            amount++;
            currmax=root.val;
        }
        return amount+count(root.left,currmax)+count(root.right,currmax);
    }
}