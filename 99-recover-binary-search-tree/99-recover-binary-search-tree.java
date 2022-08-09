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
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        ArrayList<TreeNode> tree = new ArrayList<TreeNode>();
        inorder(root,values,tree);
        Collections.sort(values);//obtaining the correct order
        for(int i=0;i<values.size();i++)
        {
            tree.get(i).val = values.get(i);
        }
     //storing the correct values in the nodes which earlier contained incorrect values
    }
    private void inorder(TreeNode root,ArrayList<Integer> values,ArrayList<TreeNode> tree)
    {
        if(root==null)
            return;
        inorder(root.left,values,tree);
        values.add(root.val); 
//for storing the incorrect values, to be sorted to obtain the correct order
        tree.add(root);    //for storing address of the nodes which have incorrect values
        inorder(root.right,values,tree);
    }
}