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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null || root.left==null && root.right==null)
            return 0;
            
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int sum=0;
        queue.add(root);
        while(!queue.isEmpty())
        {
            TreeNode node = queue.poll();
            
            if(node.left!=null && node.left.left==null && node.left.right==null)
                sum+=node.left.val;
            if(node.left!=null)
                queue.offer(node.left);
            if(node.right!=null)
                queue.offer(node.right);
        }
        return sum;
    }
}