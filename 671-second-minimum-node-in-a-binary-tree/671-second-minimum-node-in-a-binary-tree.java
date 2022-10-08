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
    public int findSecondMinimumValue(TreeNode root) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Queue<TreeNode> qu = new LinkedList<>();
        
        qu.add(root);
        while(!qu.isEmpty())
        {
            TreeNode node = qu.poll();
            if(!pq.contains(node.val))
            {
                pq.add(node.val);
            }
            if(node.left!=null)
                qu.add(node.left);
            if(node.right!=null)
                qu.add(node.right);
        }
        
        pq.poll();
        return pq.isEmpty()?-1:pq.poll();
    }
}