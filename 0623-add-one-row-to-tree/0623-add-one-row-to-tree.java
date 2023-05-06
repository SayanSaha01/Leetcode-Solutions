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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1)
        {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        addrow(root,val,depth,1);
        return root;
    }
    public void addrow(TreeNode node,int val,int depth,int currlevel)
    {
        if(node==null)
            return;
        if(currlevel==depth-1)
        {
            //adding nodes in the left subtree
            TreeNode temp = node.left;
            node.left = new TreeNode(val);
            node.left.left = temp;
            
            temp = node.right;
            node.right = new TreeNode(val);
            node.right.right = temp;
        }
        else
        {
            addrow(node.left,val,depth,currlevel+1);
            addrow(node.right,val,depth,currlevel+1);
        }
    }
}