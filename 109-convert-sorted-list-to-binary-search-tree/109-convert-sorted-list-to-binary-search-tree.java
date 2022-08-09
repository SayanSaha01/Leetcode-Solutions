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
//converting the list into inordered list and creating a bst from inordered list
class Solution {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public TreeNode sortedListToBST(ListNode head) {
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        return buildBST(list,0,list.size()-1);
    }
    private TreeNode buildBST(ArrayList<Integer> list,int low,int high)
    {
        if(low>high)
            return null;
        int mid = low+(high-low)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = buildBST(list,low,mid-1);
        root.right = buildBST(list,mid+1,high);
        return root;
    }
}