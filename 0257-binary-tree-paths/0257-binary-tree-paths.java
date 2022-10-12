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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<String>();
        if(root!=null)
            paths(root,"",list);
        return list;
    }
    public void paths(TreeNode root,String s,ArrayList<String> list)
    {
        if(root.left==null && root.right==null)
            list.add(s + root.val);
        if(root.left!=null)
            paths(root.left,s + root.val + "->",list);
        if(root.right!=null)
            paths(root.right,s + root.val + "->",list);
    }
}