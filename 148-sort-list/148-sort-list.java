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
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a,b)->a.val-b.val);
        ListNode node=head;
        while(node!=null){
           pq.add(node);
           node=node.next;
        }
        head = pq.poll();
        node = head;
        while(!pq.isEmpty())
        {
            node.next=pq.poll();
            node = node.next;
        }
        node.next = null;
        return head;
    }
}