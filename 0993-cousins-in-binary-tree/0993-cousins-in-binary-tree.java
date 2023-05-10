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
            int size = queue.size();
            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<size;i++)
            {
                TreeNode node = queue.poll();
                set.add(node.val);
                if((node.left!=null && node.right!=null && node.left.val==x && node.right.val==y) || 
                 (node.left!=null && node.right!=null && node.left.val==y && node.right.val==x))
                return false;
                if(set.contains(x) && set.contains(y))
                    return true;
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            
        }
        return false;
    }
}