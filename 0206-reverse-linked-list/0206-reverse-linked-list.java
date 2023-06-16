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
        while(head!=null)
        {
            st.push(head);
            head=head.next;
        }
        
        ListNode l = new ListNode(0);
        ListNode res=l;
        while(!st.isEmpty())
        {
            l.next = st.pop();
            l = l.next;
        }
        l.next=null;
        return res.next;
    }
}