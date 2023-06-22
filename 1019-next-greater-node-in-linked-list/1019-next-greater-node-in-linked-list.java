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
        ArrayList<Integer> lst = new ArrayList<>();  
        ListNode temp = head;
        while(temp != null){
            int val = 0;
            ListNode curr = temp;
            
            while(curr != null){
                if(curr.val > temp.val){
                    val = curr.val;
                    break;
                }
                curr = curr.next;
            }
            lst.add(val);
            temp = temp.next;
            
        }

        int[] arr = new int[lst.size()];
        for(int i = 0; i< lst.size(); i++){
            arr[i] = lst.get(i);
        }
        return arr;
    }
}