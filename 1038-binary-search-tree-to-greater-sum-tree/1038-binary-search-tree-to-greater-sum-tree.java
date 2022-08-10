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
    public TreeNode bstToGst(TreeNode root) {
        gst(root);
        return root;
    }
    private void gst(TreeNode root)
    {
        if(root==null)
            return;
        gst(root.right);
        root.val+=sum;
        sum=root.val;
        gst(root.left);
    }
}