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
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)
            return null;
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        return buildtree(list);
    }
    public TreeNode buildtree(ArrayList<Integer> list)
    {
        if(list.size()==0)
            return null;
        TreeNode root = new TreeNode(list.remove(0));
        root.right = buildtree(list);
        return root;
    }
    public void inorder(TreeNode root,ArrayList<Integer> list)
    {
        if(root==null)
            return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}