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
    HashSet<Integer> set = new HashSet<Integer>();
    public boolean isUnivalTree(TreeNode root) {
        
        dfs(root);
        if(set.size()>1)
            return false;
        return true;
    }
    public void dfs(TreeNode root)
    {
        if(root==null)
            return;
        set.add(root.val);
        
        dfs(root.left);
        dfs(root.right);
    }
}