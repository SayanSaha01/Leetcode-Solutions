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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        for(int i=0;i<b;i++)
        {
            curr=curr.next;
        }
        curr=curr.next;
        ListNode l2 = list2;
        ListNode t = l2;
        while(l2.next!=null)
        {
            l2 = l2.next;
        }
        l2.next=curr;
        
        ListNode l1 = list1;
        ListNode res = l1;
        for(int i=0;i<a-1;i++)
        {
            l1 = l1.next;
        }
        l1.next=t;
        return res;
    }
}