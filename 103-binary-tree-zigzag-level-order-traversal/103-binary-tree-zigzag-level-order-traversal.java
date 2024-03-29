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
//https://www.digitalocean.com/community/tutorials/java-list-add-addall-methods
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> wrapList = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root==null)
            return wrapList;
        queue.offer(root);
        boolean flag = true;
        while(!queue.isEmpty())
        {
            int levelnum=queue.size();
            List<Integer> sublist = new ArrayList<Integer>(levelnum);
            for(int i=0;i<levelnum;i++)
            {
                TreeNode node = queue.poll();
                if(node.left!=null)
                {
                    queue.offer(node.left);
                }
                if(node.right!=null)
                {
                    queue.offer(node.right);
                }
                if(flag==true)
                    sublist.add(node.val);
                else
                    sublist.add(0,node.val);
            }
            flag=!flag;
            wrapList.add(sublist);
        }
        return wrapList;
    }
}