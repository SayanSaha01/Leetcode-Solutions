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
    int sum=0;
    public int sumNumbers(TreeNode root) {
        if(root==null)
            return 0;
        int curr=0;
        dfs(root,curr);
        return sum;
    }
    public void dfs(TreeNode root,int curr)
    {
        if(root==null)
            return;
        curr = curr*10+root.val;
        if(root.left==null && root.right==null)
            sum+=curr;
        dfs(root.left,curr);
        dfs(root.right,curr);
    }
}