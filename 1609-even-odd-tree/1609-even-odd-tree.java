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
        while(!q.isEmpty()) {
            int size = q.size();
            //incrementing level at this stage will throw wrong answer as it still hasnt evaluated for the 0th level and level++ wil directly enable it to start evaluating from 1st level
            int prev = level%2==0 ? Integer.MIN_VALUE : Integer.MAX_VALUE; 
            // prev based on level even or odd
			for(int i=0;i<size;i++) 
            { // level by level
                TreeNode node = q.poll();
                if(level%2==0 && (node.val%2 == 0 || node.val <= prev)) 
                    return false; 
        // incase of even level, values should be strictly increasing, and at een levels, prev is initialised to Integer.MIN_VALUES os by comparing with node.val, node.val should be greater than prev but if node.val<=prev then return false
        // false if value at even level is even or not strictly increasing
                if(level%2!=0 && (node.val % 2 != 0 || node.val >= prev)) 
                    return false; 
        // false if value at odd level is odd or not strictly decreasing
                prev = node.val; // update the prev value
                if(node.left != null) 
                    q.add(node.left); // add left child if exist
                if(node.right != null) 
                    q.add(node.right); // add right child if exist
            }
            level++;
        }
        return true;
    }
}