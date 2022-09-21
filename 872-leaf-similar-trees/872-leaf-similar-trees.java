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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        
        dfs(list1,root1);
        dfs(list2,root2);
        
        return list1.equals(list2);
    }
    public void dfs(List<Integer> leaf,TreeNode root)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            leaf.add(root.val);
        dfs(leaf,root.left);
        dfs(leaf,root.right);
    }
}