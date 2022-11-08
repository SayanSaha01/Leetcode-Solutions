/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) 
    {
        List<Integer> list = new ArrayList<>();
        HashMap<TreeNode,TreeNode> parentmap = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();
        
        buildparent(root,root,parentmap);
        queue.add(target);
        visited.add(target);
        
        int distance=0;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            if(distance==k)
                return buildListfromqueue(queue);
            
            for(int i=0;i<size;i++)
            {
                TreeNode node = queue.poll();
                if(node.left!=null && !visited.contains(node.left))
                {
                    queue.add(node.left);
                    visited.add(node.left);
                }
                if(node.right!=null && !visited.contains(node.right))
                {
                    queue.add(node.right);
                    visited.add(node.right);
                }
                TreeNode parent = parentmap.get(node);
                if(!visited.contains(parent))
                {
                    queue.add(parent);
                    visited.add(parent);
                }
            }
            distance++;
        }
        return list;
    }
    public List<Integer> buildListfromqueue(Queue<TreeNode> queue)
    {
        List<Integer> res = new ArrayList<>();
        while(!queue.isEmpty())
        {
            res.add(queue.poll().val);
        }
        return res;
    }
    public void buildparent(TreeNode root,TreeNode parent,HashMap<TreeNode,TreeNode> parentmap)
    {
        if(root==null)
            return;
        parentmap.put(root,parent);
        buildparent(root.left,root,parentmap);
        buildparent(root.right,root,parentmap);
    }
}