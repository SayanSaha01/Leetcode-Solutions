/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        ListNode left = head;
        ListNode right = head;
        int n=0;
        while(curr!=null)
        {
            curr = curr.next;
            n++;
        }
        for(int i=1;i<k;i++)
        {
            left = left.next;
        }
        for(int j=1;j<=n-k;j++)
        {
            right=right.next;
        }
        int temp = left.val;
        left.val = right.val;
        right.val = temp;
        return head;
    }
}