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
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    public int[] findMode(TreeNode root) {
        dfs(root);
        int max=0;
        for(int i:map.values())
        {
            max = Math.max(i,max);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int key:map.keySet())
        {
            if(map.get(key)==max)
            {
                list.add(key);
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
    public void dfs(TreeNode root)
    {
        if(root==null)
            return;
        
        map.put(root.val,map.getOrDefault(root.val,0)+1);
           
        dfs(root.left);
        dfs(root.right);
    }
}