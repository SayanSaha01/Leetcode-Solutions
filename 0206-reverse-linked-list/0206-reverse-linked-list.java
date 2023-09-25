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
        ListNode slow = head;
        while(slow!=null){
            st.add(slow);
            slow=slow.next;
        }
        ListNode fast=new ListNode(-1);
        ListNode temp=fast;
        while(!st.isEmpty()){
            fast.next = st.pop();
            fast = fast.next;
        }
        fast.next=null;
        return temp.next;
    }
}