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
    public boolean isEvenOddTree(TreeNode root) {
        if(root == null) 
            return true;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        int level=0;
        while(q.size() > 0) {
            int size = q.size();
            
            int prev = level%2==0 ? Integer.MIN_VALUE : Integer.MAX_VALUE; // init preVal based on level even or odd
			while(size-- > 0) 
            { // level by level
                root = q.poll();
                if(level%2==0 && (root.val % 2 == 0 || root.val <= prev)) 
                    return false; // invalid case on even level
                if(level%2!=0 && (root.val % 2 == 1 || root.val >= prev)) 
                    return false; // invalid case on odd level
                prev = root.val; // update the prev value
                if(root.left != null) q.add(root.left); // add left child if exist
                if(root.right != null) q.add(root.right); // add right child if exist
            }
            level++;
        }
        return true;
    }
}