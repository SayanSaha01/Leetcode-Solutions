/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr =headA;
        ListNode curr1=headB;
        int lena=0;
        int lenb=0;
        while(curr!=null)
        {
            lena++;
            curr=curr.next;
        }
        while(curr1!=null)
        {
            lenb++;
            curr1=curr1.next;
        }
        if(lena>lenb)         // this is for doing equal both the node headA and headB.
        {
            int dif=lena-lenb; 
            
            while(dif>0){
                headA=headA.next; dif--;}
        }
        else if(lena<lenb)
        {
            int dif=lenb-lena;
            while(dif>0){
                headB=headB.next; dif--;} 
        }
        while(headA != headB)
        {
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}