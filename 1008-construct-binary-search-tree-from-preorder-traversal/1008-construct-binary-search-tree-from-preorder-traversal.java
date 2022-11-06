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
     public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, 0, preorder.length - 1);
    }
    
    private TreeNode build(int[] preorder, int start, int end) {
        if(start > end) return null;
        int val = preorder[start];
        TreeNode root = new TreeNode(val);
        int p = start+1;
		//find the position to separate left and right children.
        while(p <= end && preorder[p] < val) {
            p++;
        }
        root.left = build(preorder, start+1, p-1);
        root.right = build(preorder, p, end);
        return root;
    }
}