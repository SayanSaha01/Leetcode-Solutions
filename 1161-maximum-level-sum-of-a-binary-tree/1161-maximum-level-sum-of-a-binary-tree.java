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
    public int maxLevelSum(TreeNode root) {
        if(root==null)
            return 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int level=0;
        int minlevel=Integer.MAX_VALUE;
        int maxsum=Integer.MIN_VALUE;
        while(!q.isEmpty())
        {
            int size=q.size();
            int levelsum=0;
            level++;
            for(int i=0;i<size;i++)
            {
                TreeNode node = q.poll();
                levelsum += node.val;
                if(node.left!=null)
                    q.offer(node.left);
                if(node.right!=null)
                    q.offer(node.right);
            }
            if(levelsum>maxsum)
            {
                maxsum=levelsum;
                minlevel=level;
            }
        }
        return minlevel;
    }
}