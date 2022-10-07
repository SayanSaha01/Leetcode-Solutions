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
        ArrayList<Integer> list = new ArrayList<Integer>();
        view(root,list,0);
        return list;
    }
    public void view(TreeNode root,ArrayList<Integer> list,int level)
    {
        if(root==null)
            return; //return nothing
        else if(list.size()==level)
            list.add(root.val);
        view(root.right,list,level+1);
        view(root.left,list,level+1);
    }
}