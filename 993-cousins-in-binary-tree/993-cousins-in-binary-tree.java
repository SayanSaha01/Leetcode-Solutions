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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null)
            return false;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        HashSet<Integer> set = new HashSet<Integer>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr = q.poll();
                set.add(curr.val);
                if(curr.left!=null && curr.right!=null && curr.left.val==x && curr.right.val==y)
                    return false;
                if(curr.left!=null && curr.right!=null && curr.left.val==y && curr.right.val==x)
                    return false;
                if(set.contains(x) && set.contains(y))
                    return true;
                if(curr.left!=null)
                    q.offer(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            set = new HashSet<>();
        }
        return false;
    }
}