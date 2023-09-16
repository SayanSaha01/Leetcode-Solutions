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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = new ListNode(-1);
        ListNode curr = temp;
        int sum=0;
        head=head.next;
        while(head!=null){
            if(head.val!=0)
            {
                sum+=head.val;
            }
            else
            {
                temp.next = new ListNode(sum);
                sum=0;
                temp=temp.next;
            }
            head=head.next;
        }
        return curr.next;
    }
}