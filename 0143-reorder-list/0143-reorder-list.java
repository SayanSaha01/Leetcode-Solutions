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
    public void reorderList(ListNode head) {
        if (head == null)
            return;
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;
        int len = 0;
        while(curr!=null){
            stack.push(curr);
            len++;
            curr = curr.next;
        }
        curr = head;
        for (int i = 1; i<=len/2; i++){
            ListNode temp = curr.next;
            ListNode endNode = stack.pop();
            curr.next = endNode;
            endNode.next =temp;
            curr = temp;
        }
        curr.next = null;
    }
}