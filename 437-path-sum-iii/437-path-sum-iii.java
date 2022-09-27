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
 *//*
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)
            return 0;
        return path(root,targetSum) +   //solo case where the root node = targetsum
               path(root.left,targetSum) +
               path(root.right,targetSum);
    }
    public int path(TreeNode root,int target)
    {
        if(root==null)
            return 0;
        return (root.val==target?1:0) +
               path(root.left,target-root.val) +
               path(root.right,target-root.val);
    }
}*/
class Solution {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) 
            return 0;
        return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    private int pathSumFrom(TreeNode node, long sum) {
        if (node == null) 
            return 0;
        return (node.val == sum ? 1 : 0) 
            + pathSumFrom(node.left, sum - node.val) 
            + pathSumFrom(node.right,sum - node.val);
    }
}