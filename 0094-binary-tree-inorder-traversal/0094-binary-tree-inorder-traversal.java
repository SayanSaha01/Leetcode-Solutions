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
    
    ArrayList<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        traversal(root);
        return list;
    }
    public void traversal(TreeNode root)
    {
        if(root==null)
            return;
        traversal(root.left);
        list.add(root.val);
        traversal(root.right);
    }
}