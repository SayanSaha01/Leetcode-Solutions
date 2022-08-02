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
    public int maxPathSum(TreeNode root) {
        int[] sum = new int[1];
        sum[0] = Integer.MIN_VALUE;
        maxsum(root,sum);
        return sum[0];
    }
    private int maxsum(TreeNode node,int[] sum)
    {
        if(node==null)
            return 0;
        int lsum = Math.max(0,maxsum(node.left,sum));
        int rsum = Math.max(0,maxsum(node.right,sum));
        sum[0] = Math.max(sum[0],node.val+lsum+rsum);
        return node.val+Math.max(lsum,rsum);
    }
}