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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<List<Integer>> arr = new ArrayList<List<Integer>>();
        if(root==null)
            return arr;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            List<Integer> sublist = new LinkedList<Integer>();
            int levelnum=queue.size();
            for(int i=0;i<levelnum;i++)
            {
                if(queue.peek().left!=null)
                {
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null)
                {
                    queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().val);
            }
            arr.add(0,sublist);     
        }
        return arr;
    }
}