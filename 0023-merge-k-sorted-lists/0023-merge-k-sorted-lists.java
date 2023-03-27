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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a,b)->a.val-b.val);
        if(lists==null || lists.length==0)
            return null;
        for(ListNode l:lists)
        {
            if(l!=null)
                pq.add(l);
        }
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        while(!pq.isEmpty())
        {
            curr.next = pq.poll();
            curr = curr.next;
            // System.out.println(pq.poll().val);
            if(curr.next!=null)
                pq.add(curr.next);
        }
        return head.next;
    }
}