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
        int start = 0;
        int end = nums.length-1;
        return buildtree(nums,start,end);
    }
    public int findmax(int[] nums,int start,int end)
    {
        int max = Integer.MIN_VALUE;
        int maxindex = 0;
        for(int i=start;i<=end;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                maxindex=i;
            }
        }
        return maxindex;
    }
    public TreeNode buildtree(int[] nums,int start,int end)
    {
        if(start>end)
            return null;
        int index = findmax(nums,start,end);
        
        TreeNode node = new TreeNode(nums[index]);
        node.left = buildtree(nums,start,index-1);
        node.right = buildtree(nums,index+1,end);
        
        return node;
    }
}