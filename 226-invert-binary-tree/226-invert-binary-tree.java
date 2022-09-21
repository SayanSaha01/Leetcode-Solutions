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
/*
//Top Down Approach

public void invertHelper(TreeNode root)
    {
        if(root==null)
            return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
		
      // once done at root level, keep doing it at child nodes
        
		invertHelper(root.left);
        invertHelper(root.right);
    }
	
	//Bottom Up Approach

	public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }
}
*/
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}