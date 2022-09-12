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
    public ListNode middleNode(ListNode head) {
        ListNode ptr = head;
        int count=0;
        while(ptr!=null)
        {
            ptr = ptr.next;
            count++;
        }
        int middle = (int)Math.ceil(count/2);
        while(middle-->0)
        {
            head=head.next;
        }
        return head;
    }
}