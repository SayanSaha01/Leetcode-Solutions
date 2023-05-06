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
    public int findSecondMinimumValue(TreeNode root) {
        HashSet<Integer> res=new HashSet();
        inord(root,res);
        List<Integer> tmp=new ArrayList(res);
        Collections.sort(tmp);
        if(tmp.size()<2)
          return -1;
        return tmp.get(1);
    }
    public void inord(TreeNode root,HashSet res)
    {
        if(root==null)
           return;
        inord(root.left,res);
        res.add(root.val);
        inord(root.right,res);
    }
}