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
    public TreeNode bstFromPreorder(int[] preorder) {
        return construct(preorder,0,preorder.length-1);
    }
    public TreeNode construct(int[] preorder,int start,int end)
    {
        if(start>end)
            return null;
        
        int data = preorder[start];    //why not preorder[0] instead of start -> as we are using recursion we will initialise root in case of subtree with preorder[start] val, then we cant use 0
        TreeNode root = new TreeNode(data);
        
        int index;        //global variable as we need to figure out where there exists a value bigger than preorder[start] for the right subtree
        for(index=start;index<=end;index++)
        {
            if(preorder[index]>data)
                break;
        }
        
        root.left = construct(preorder,start+1,index-1);
        root.right = construct(preorder,index,end);
        
        return root;
    }
}