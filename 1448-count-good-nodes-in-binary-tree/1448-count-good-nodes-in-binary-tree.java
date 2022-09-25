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
/*3 cases arriving
root to root = 1 way
finding good nodes in left subtree 
finding good nodes in right subtree*/
class Solution {
    public int goodNodes(TreeNode root) {
        int c=1;
        if(root==null)
            return 0;
        c+=count(root.left,root.val);
        c+=count(root.right,root.val);
        return c;
    }
    public int count(TreeNode root,int curmax)
    {
        int amount = 0;
        if(root==null)
            return 0;
        if(root.val>=curmax)
        {
            amount++;
            curmax=root.val;
        }
        amount+=count(root.left,curmax);
        amount+=count(root.right,curmax);
        return amount;
    }
}