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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null)
            return 0;
        int depth = maxdepth(root);
        Queue<TreeNode> queue = new LinkedList<>();
        int sum=0;
        int level=1;
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node = queue.poll();
                if(level==depth)
                    sum+=node.val;
                if(node.left!=null)
                    queue.offer(node.left);
                if(node.right!=null)
                    queue.offer(node.right);
            }
            level++;
        }
        return sum;
    }
    public int maxdepth(TreeNode root)
    {
        if(root==null)
            return 0;
        return Math.max(maxdepth(root.left),maxdepth(root.right))+1;
    }
}