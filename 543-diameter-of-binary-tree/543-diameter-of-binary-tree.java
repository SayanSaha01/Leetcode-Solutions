/*
3 cases max diameter occurs in left subtree
max diameter occurs in right subtree
max diameter passes through root
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        int maxleftdia = diameterOfBinaryTree(root.left);
        int maxrightdia = diameterOfBinaryTree(root.right);
        int curr = maxheight(root.left) + maxheight(root.right);
        return Math.max(curr,Math.max(maxleftdia,maxrightdia));
    }
    public int maxheight(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1+Math.max(maxheight(root.left),maxheight(root.right));
    }
}