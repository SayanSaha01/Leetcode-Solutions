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
    public String tree2str(TreeNode root) {
        if(root==null)
            return "";
        StringBuilder sb = new StringBuilder();
        preorder(root,sb);
        return sb.toString();
    }
    public void preorder(TreeNode root,StringBuilder sb)
    {
        if(root==null)
            return;
        sb.append(root.val);
        if(root.left!=null)
        {
            sb.append("(");
            preorder(root.left,sb);
            sb.append(")");
        }
        if(root.right!=null)
        {
            //The tricky part is the left subtree. If the left subtree is "" but the right is not, we need to append a empty ().
            if(root.left==null)   
            {
                sb.append("()");
            }
            sb.append("(");
            preorder(root.right,sb);
            sb.append(")");
        }
    }
}