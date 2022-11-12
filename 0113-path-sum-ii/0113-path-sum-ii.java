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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> ret = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    dfs(root, sum, path, ret);
    return ret;
}

     private void dfs(TreeNode root, int sum, List<Integer> path, List<List<Integer>> ret) {
    if (root != null) {
        path.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            ret.add(path);
        }
        dfs(root.left, sum-root.val, new ArrayList(path), ret);
        dfs(root.right, sum-root.val, new ArrayList(path), ret);
    }
  }
}