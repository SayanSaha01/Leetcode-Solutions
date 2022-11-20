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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        List<List<Integer>> list = new ArrayList<>();
        
        sorted(root,tmap);
        for(int i:queries)
        {
            List<Integer> sublist = new ArrayList<>();
            Integer lowerkey = tmap.containsKey(i) ? Integer.valueOf(i) : tmap.lowerKey(i);
            Integer higherkey = tmap.containsKey(i) ? Integer.valueOf(i) : tmap.higherKey(i);
            
            //why cant we store values in int lowerkey/higherkey-> because if tmap doesnt contain a lesservalue then it returns null, but int which is a primitive type cannot store null values hence we use Integer lowerkey/higherkey
            
            sublist.add(lowerkey==null ? -1:lowerkey);
            sublist.add(higherkey==null ? -1:higherkey);
            
            list.add(sublist);
        }
        return list;
    }
    public void sorted(TreeNode root,TreeMap<Integer,Integer> tmap)
    {
        if(root==null)
            return;
        sorted(root.left,tmap);
        tmap.put(root.val,1);
        sorted(root.right,tmap);
    }
}