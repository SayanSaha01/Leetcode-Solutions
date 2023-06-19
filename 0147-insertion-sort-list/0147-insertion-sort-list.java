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
    public ListNode insertionSortList(ListNode head) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(head!=null)
        {
            pq.add(head.val);
            head = head.next;
        }
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;
        while(!pq.isEmpty())
        {
            dummy.next = new ListNode(pq.poll());
            dummy = dummy.next;
        }
        return res.next;
    }
}