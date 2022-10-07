/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root==null)     //base case when we reach the null node
            return null;
        else if(root==p || root==q)//if we find the desired node, we return back the node
            return root;
        
        TreeNode left = lowestCommonAncestor(root.left,p,q);  //traversing the left subtree
        TreeNode right = lowestCommonAncestor(root.right,p,q); //traversing the right subtree
        
        if(left!=null && right!=null)      //when we get the lowest common node from both the left and right subtree
            return root;
        
        else if(left==null && right==null)   //when both the left and right subtree are null,then there is no chance of us getting back our desired node
            return null;
        
        else
            return left!=null?left:right;     //when one of the node is null, we return the other node which is not null, to compare with the other node
    }
}