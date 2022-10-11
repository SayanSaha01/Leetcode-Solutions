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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        return buildtree(nums,left,right);
    }
    public int findmax(int[] nums,int left,int right)
    {
        int maxindex=0;
        int max = Integer.MIN_VALUE;
        for(int i=left;i<=right;i++)
        {
            if(nums[i] > max)
            {
                max=nums[i];
                maxindex=i;
            }
        }
        return maxindex;
    }
    public TreeNode buildtree(int[] nums,int left,int right)
    {
        if(left>right){
            return null;
        }
        int maxindex = findmax(nums,left,right);
        TreeNode root = new TreeNode(nums[maxindex]);
        
        root.left = buildtree(nums,left,maxindex-1);
        root.right = buildtree(nums,maxindex+1,right);
        
        return root;
    }
}