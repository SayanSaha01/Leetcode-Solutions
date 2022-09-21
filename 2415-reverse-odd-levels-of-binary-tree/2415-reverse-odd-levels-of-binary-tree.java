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
    public TreeNode reverseOddLevels(TreeNode root) {
        revodd(root.left,root.right,1);
        return root;
    }
    public void revodd(TreeNode left,TreeNode right,int lvl)
    {
        if(left==null || right==null)
            return;
        
        if(lvl%2==1)
        {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        
        revodd(left.left,right.right,lvl+1); //swapping starting from the extreme left and right values and then we move inwards
        revodd(left.right,right.left,lvl+1);

    }
}