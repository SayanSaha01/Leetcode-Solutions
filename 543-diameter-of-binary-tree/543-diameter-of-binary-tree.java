
class Solution {
    public int getHeight(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(getHeight(root.left),getHeight(root.right));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int d1 = getHeight(root.left) + getHeight(root.right);
        int d2 = diameterOfBinaryTree(root.left);
        int d3 = diameterOfBinaryTree(root.right);
        return Math.max(d1, Math.max(d2, d3));
    }
}