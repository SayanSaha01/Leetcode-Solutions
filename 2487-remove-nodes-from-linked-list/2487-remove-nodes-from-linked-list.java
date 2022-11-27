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
    public ListNode removeNodes(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode curr = head;
        Stack<ListNode> st = new Stack<>();
        
        while(curr!=null)
        {
            st.push(curr);
            curr=curr.next;
        }
        
        while(!st.isEmpty())
        {
            if(curr==null || st.peek().val >= curr.val)
            {
                st.peek().next = curr;
                curr = st.peek();
            }
            st.pop();
        }
        return curr;
    }
}