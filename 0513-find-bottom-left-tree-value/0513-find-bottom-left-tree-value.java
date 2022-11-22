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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null)
            return 0;
        int maxdepth = depth(root);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth=1;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node = queue.poll();
                if(depth == maxdepth && i==0)
                    return node.val;
                if(node.left!=null)
                    queue.offer(node.left);
                if(node.right!=null)
                    queue.offer(node.right);
            }
            depth++;
        }
        return -1;
    }
    public int depth(TreeNode root)
    {
        if(root==null)
            return 0;
        return Math.max(depth(root.left),depth(root.right))+1;
    }
    
}