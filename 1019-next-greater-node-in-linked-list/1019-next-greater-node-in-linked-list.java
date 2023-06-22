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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while(temp!=null)
        {
            int val=0;
            ListNode curr = temp;
            while(curr!=null)
            {
                if(curr.val>temp.val)
                {
                    val = curr.val;
                    break;
                }
                curr=curr.next;
            }
            list.add(val);
            temp = temp.next;
        }
        
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}