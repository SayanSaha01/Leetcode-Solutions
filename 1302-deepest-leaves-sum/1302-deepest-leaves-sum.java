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
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        if(root==null)
            return 0;
        int depth = maxdepth(root);
        deepestsum(root,1,depth);
        return sum;
    }
    public void deepestsum(TreeNode root,int curr,int depth)
    {
        if(root==null)
            return;
        if(curr==depth)
            sum+=root.val;
        deepestsum(root.left,curr+1,depth);
        deepestsum(root.right,curr+1,depth);
    }
    public int maxdepth(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1 + Math.max(maxdepth(root.left),
                            maxdepth(root.right));
    }
}