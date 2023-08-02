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
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode curr =head;
        while(curr!=null)
        {
            pq.add(curr.val);
            curr=curr.next;
        }
        curr = head;
        while(!pq.isEmpty())
        {
            curr.val = pq.poll();
            curr = curr.next;
        }
        return head;
    }
}