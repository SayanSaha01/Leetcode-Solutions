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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> large = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root==null)
            return large;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            int max = Integer.MIN_VALUE;
            for(int i=0;i<size;i++)
            {
                TreeNode curr = queue.poll();
                max= Math.max(curr.val,max);
                if(curr.left!=null)
                    queue.offer(curr.left);
                if(curr.right!=null)
                    queue.offer(curr.right);
            }
            large.add(max);
        }
        return large;
    }
}