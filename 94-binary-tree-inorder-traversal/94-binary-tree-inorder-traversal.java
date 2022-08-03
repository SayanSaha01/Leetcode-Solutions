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
    ArrayList<Integer> arr = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {   
        inorder(root);
        return arr;
    }
    private void inorder(TreeNode root)
    {
        if(root==null)
            return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
        return;
    }
}