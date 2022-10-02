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
        if(head==null) 
            return null;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        ListNode node = head;
        while(node != null)
        {
            pq.add(node.val);
            node= node.next;
        }
        node = head;
        while(node != null)
        {
            node.val = pq.poll();
            node = node.next;
        }
        return head;
    }
}