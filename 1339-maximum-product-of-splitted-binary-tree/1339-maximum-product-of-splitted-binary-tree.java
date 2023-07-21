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
    List<Integer> list = new ArrayList<>();
    public int maxProduct(TreeNode root) {
        long max=0;
        int sum = dfs(root);
        for(long n:list)
        {
            long prod = (sum-n)*n;
            max= Math.max(prod,max);
        }
        return (int)(max%1000000007);
    }
    public int dfs(TreeNode root)
    {
        if(root==null)
            return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int ts = left + root.val + right;
        list.add(ts);
        return ts;
    }
}