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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode curr = head;
        if(curr==null || curr.next==null)
            return null;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        if(count==n) 
            return head.next;
        int idx=count-n-1;
        curr=head;
        while(idx-->0)
        {
            curr=curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}