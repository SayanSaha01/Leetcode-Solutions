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
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        dfs1(root1);
        dfs2(root2);
        return list1.equals(list2);
    }
    public void dfs1(TreeNode root)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            list1.add(root.val);
        dfs1(root.left);
        dfs1(root.right);
    }
    public void dfs2(TreeNode root)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            list2.add(root.val);
        dfs2(root.left);
        dfs2(root.right);
    }
}