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
    
    public int sumRootToLeaf(TreeNode root) {
        if(root==null)
            return 0;
        return dfs(root,0);
    }
    public int dfs(TreeNode root,int s)
    {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return root.val+s*2;
        else
            return dfs(root.left,root.val+s*2)+
                   dfs(root.right,root.val+s*2);
    }
}