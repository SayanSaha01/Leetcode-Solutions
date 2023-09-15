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
        while(temp!=null){
            st.add(temp);
            temp=temp.next;
        }
        ListNode curr = new ListNode(-1);
        ListNode t=curr;
        while(!st.isEmpty()){
            curr.next=st.pop();
            curr = curr.next;
        }
        curr.next=null;
        return t.next;
    }
}