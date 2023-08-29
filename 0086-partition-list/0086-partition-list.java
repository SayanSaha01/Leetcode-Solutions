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
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        while(head!=null)
        {
            if(head.val<x)
            {
                s1.push(head);
            }
            else
            {
                s2.push(head);
            }
            head=head.next;
        }
        head=null;
        while(!s2.isEmpty())
        {
            ListNode temp = s2.pop();
            temp.next=head;
            head=temp;
        }
        while(!s1.isEmpty())
        {
            ListNode temp = s1.pop();
            temp.next=head;
            head=temp;
        }
        return head;
    }
}