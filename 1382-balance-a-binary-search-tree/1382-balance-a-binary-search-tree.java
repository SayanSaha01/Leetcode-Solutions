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
    ArrayList<Integer> nums = new ArrayList<Integer>();
    public TreeNode balanceBST(TreeNode root) {
        
        inorder(root);
        return sort(0,nums.size()-1);
    }
    private TreeNode sort(int low,int high)
    {
        if(low>high)
            return null;
        int mid = low+(high-low)/2;
        TreeNode node = new TreeNode(nums.get(mid));
        node.left = sort(low,mid-1);
        node.right = sort(mid+1,high);
        return node;
    }
    private void inorder(TreeNode root)
    {
        if(root==null)
            return;
        inorder(root.left);
        nums.add(root.val);
        inorder(root.right);
    }
    
}