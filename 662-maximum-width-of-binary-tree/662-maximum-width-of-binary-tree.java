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
    public int widthOfBinaryTree(TreeNode root) {
        ArrayDeque<TreeNode> dq = new ArrayDeque<TreeNode>();
        root.val=0;
        dq.offer(root);
        int maxwidth=1;
        while(!dq.isEmpty())
        {
            int size = dq.size();
            int left = dq.peekFirst().val;
            int right = dq.peekLast().val;
            maxwidth = Math.max(maxwidth,(right-left+1));
            for(int i=0;i<size;i++)
            {
                TreeNode node = dq.poll();
                if(node.left!=null)
                {
                    node.left.val=2*node.val;
                    dq.offer(node.left);
                }
                if(node.right!=null)
                {
                    node.right.val = 2*node.val+1;
                    dq.offer(node.right);
                }
            }
        }
        return maxwidth;
    }
}