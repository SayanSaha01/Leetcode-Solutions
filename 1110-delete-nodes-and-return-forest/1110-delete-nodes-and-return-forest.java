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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        ArrayList<TreeNode> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i:to_delete)
        {
            set.add(i);
        }
        postorder(root,list,set);
        if(!set.contains(root.val))
            list.add(root);
        return list;
    }
    public TreeNode postorder(TreeNode root,ArrayList<TreeNode> list,HashSet<Integer> set)
    {
        if(root==null)
            return null;
        root.left = postorder(root.left,list,set);
        root.right = postorder(root.right,list,set);
        if(set.contains(root.val))
        {
            if(root.left!=null)
                list.add(root.left);
            if(root.right!=null)
                list.add(root.right);
            return null;
        }
        return root;
    }
}