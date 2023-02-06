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
    int maxcount=0;
    public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        postorder(root);
        for(int i:map.keySet())
        {
            if(map.get(i)==maxcount)
                list.add(i);
        }
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
    public int postorder(TreeNode root)
    {
        if(root==null)
            return 0;
        int left = postorder(root.left);
        int right = postorder(root.right);
        int sum = left+right+root.val;
        
        int count = map.getOrDefault(sum,0)+1;
        map.put(sum,count);
        maxcount = Math.max(maxcount,count);
        
        return sum;
    }
}