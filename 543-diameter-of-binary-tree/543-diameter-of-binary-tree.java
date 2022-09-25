class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        int leftd = diameterOfBinaryTree(root.left);    //the maximum diameter lies in left sub tree entirely
        
        int rightd = diameterOfBinaryTree(root.right); //the maximum diameter lies in right sub tree entirely
        
        int curr = height(root.left)+height(root.right);  //the maximum diameter passes through the root node
        return Math.max(curr,Math.max(leftd,rightd));
    }
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
}