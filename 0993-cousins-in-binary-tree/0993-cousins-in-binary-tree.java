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
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<size;i++)
            {
                TreeNode curr = queue.poll();
                set.add(curr.val);
                if(curr.left!=null && curr.right!=null && curr.left.val==x && curr.right.val==y)
                    return false;
                if(curr.left!=null && curr.right!=null && curr.left.val==y && curr.right.val==x)
                    return false;
                if(set.contains(x) && set.contains(y))
                    return true;
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);
            }
        }
        return false;
    }
}