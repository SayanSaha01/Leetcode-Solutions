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
    public ListNode mergeNodes(ListNode head) {
    ListNode cur;
    ListNode res = new ListNode(-1);
    cur = res;
    int sum = 0;

    while (head != null) {
        if (head.val != 0) {
            sum += head.val;
        } else {
            cur.next = new ListNode(sum);
            cur = cur.next;
            sum = 0;
        }
        head = head.next;
    }
    return res.next.next;
  }
}