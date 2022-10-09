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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> inordermap = new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++)
        {
            inordermap.put(inorder[i],i);
        }
        TreeNode root = buildtree(preorder,0,preorder.length-1,
                                  inorder,0,inorder.length-1,
                                  inordermap);
        return root;   
    }
    public TreeNode buildtree(int[] preorder,int prestart,int preend,
                              int[] inorder,int instart,int inend,
                              HashMap<Integer,Integer> inmap)
    {
        if(prestart > preend || instart > inend)
            return null;
        
        TreeNode root = new TreeNode(preorder[prestart]);
        
        int rootindex = inmap.get(root.val);  //getting the index of root in order
        
        int numleft = rootindex-instart;       //figuring out the number of elements to the left of the root in inorder array
            
        root.left = buildtree(preorder,prestart+1,prestart+numleft,
                              inorder,instart,rootindex-1,inmap);
        
        root.right = buildtree(preorder,prestart+numleft+1,preend,
                              inorder,rootindex+1,inend,inmap);
        return root;
    }
}