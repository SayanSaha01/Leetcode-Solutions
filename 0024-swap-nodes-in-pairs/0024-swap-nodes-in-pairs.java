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
        Stack<ListNode> st = new Stack<>();
        if(head==null || head.next==null)
            return head;
        while(head!=null)
        {
            st.push(head);
            head=head.next;
        }
        ListNode pop = null;
        if(st.size()%2==1)
            pop = st.pop();
        while(st.size()>0)
        {
            ListNode first = st.pop();
            ListNode second = st.pop();
            second.next=pop;
            first.next = second;
            
            pop=first;
        }
        return pop;
    }
}