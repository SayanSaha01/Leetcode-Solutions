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
    List<String> paths = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root!=null)
           func(root,"");
        return paths;
    }
    public void func(TreeNode root,String s)
    {
        if(root.left==null && root.right==null)
            paths.add(s+root.val);
        if(root.left!=null)
            func(root.left,s+root.val+"->");
        if(root.right!=null)
            func(root.right,s+root.val+"->");
            
    }
}