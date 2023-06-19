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
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while(temp!=null)
        {
            st.push(temp);
            temp=temp.next;
        }
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;
        while(!st.isEmpty())
        {
            res.next=st.pop();
            res=res.next;
        }
        res.next=null;
        return dummy.next;
    }
}