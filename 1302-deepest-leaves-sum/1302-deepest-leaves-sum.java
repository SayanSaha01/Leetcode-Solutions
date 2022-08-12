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
    public int deepestLeavesSum(TreeNode root) {
        int maxdepth = maxdepth(root);
        deepestsum(root,1,maxdepth);
        return sum;
    }
    public int maxdepth(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1 + Math.max(maxdepth(root.left),maxdepth(root.right));
    }
    public void deepestsum(TreeNode root,int curr,int maxdepth)
    {
        if(root!=null)
        {
            if(curr==maxdepth)
            {
                sum+=root.val;
            }
            deepestsum(root.left,curr+1,maxdepth);
            deepestsum(root.right,curr+1,maxdepth);
        }
        
    }
}