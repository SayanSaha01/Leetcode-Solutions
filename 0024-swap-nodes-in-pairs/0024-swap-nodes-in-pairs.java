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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) 
            return head;
        Stack<ListNode> stack = new Stack();
        ListNode curr = head;
        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }
        ListNode pop = null;
        if (stack.size() % 2 == 1) pop = stack.pop();
        while (stack.size() > 0) {
            ListNode second = stack.pop();
            ListNode first = stack.pop();
            first.next = pop;
            second.next = first;
            pop = second;
        }
        return pop;
    }
}