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
            ListNode pop = s2.pop();
            pop.next=head;
            head=pop;
        }
        while(!s1.isEmpty())
        {
            ListNode pop = s1.pop();
            pop.next=head;
            head=pop; 
        }
        return head;
    }
}