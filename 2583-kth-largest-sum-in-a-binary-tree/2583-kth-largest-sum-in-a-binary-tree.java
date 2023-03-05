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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            long sum=0;
            for(int i=0;i<size;i++)
            {
                if(q.peek().left!=null)
                    q.add(q.peek().left);
                if(q.peek().right!=null)
                    q.add(q.peek().right);
                
                sum+=(long)q.poll().val;
            }
            list.add(sum);
        }
        Collections.sort(list);
        return k>list.size()?-1:list.get(list.size()-k);
    }
}