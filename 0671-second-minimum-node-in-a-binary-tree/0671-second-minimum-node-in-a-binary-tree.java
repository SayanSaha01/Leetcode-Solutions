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
        for(int i=0;i<tmp.size();i++)
        {
            System.out.println(tmp.get(i));
        }
        Collections.sort(tmp);
        return tmp.size()<2?-1:tmp.get(1);
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