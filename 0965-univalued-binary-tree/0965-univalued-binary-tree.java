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
    HashSet<Integer> set = new HashSet<>();
    public boolean isUnivalTree(TreeNode root) {
        inorder(root);
        return set.size()==1?true:false;
    }
    public void inorder(TreeNode root)
    {
        if(root==null)
            return;
        inorder(root.left);
        set.add(root.val);
        inorder(root.right);
    }
}