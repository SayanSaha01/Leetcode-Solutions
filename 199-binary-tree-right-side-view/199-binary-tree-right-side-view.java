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
    public List<Integer> rightSideView(TreeNode root) {
    List<Integer> arr = new ArrayList<Integer>();
    view(root,arr,0);
    return arr;
    }
    public void view(TreeNode root,List<Integer> arr,int d)
    {
        if(root==null)
            return;
        if(d==arr.size())
            arr.add(root.val);
        view(root.right,arr,d+1);
        view(root.left,arr,d+1);
    }
}