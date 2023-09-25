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
    public ListNode partition(ListNode head, int x) {
        LinkedList<ListNode> lesser = new LinkedList<>();
        LinkedList<ListNode> greater = new LinkedList<>();
        while (head != null) {
            if (head.val < x) {
                lesser.add(head);
            } else {
                greater.add(head);
            }
            head = head.next;
        }
        ListNode temp = new ListNode(-1);
        ListNode t = temp;
        while (!lesser.isEmpty()) {
            temp.next = lesser.pollFirst();
            temp = temp.next;
        }
        while (!greater.isEmpty()) {
            temp.next = greater.pollFirst();
            temp = temp.next;
        }
        temp.next = null;
        return t.next;
    }
}