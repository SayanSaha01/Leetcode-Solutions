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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        preorder(list1,p);
        preorder(list2,q);
        return list1.equals(list2);
    }
    public void preorder(ArrayList<Integer> list,TreeNode root)
    {
        if(root==null)
        {
            list.add(null);
            return;
        }
        list.add(root.val);
        preorder(list,root.left);
        preorder(list,root.right);
    }
}