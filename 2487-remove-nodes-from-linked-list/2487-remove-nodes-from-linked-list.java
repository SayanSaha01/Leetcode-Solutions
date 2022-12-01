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
        ListNode ans = new ListNode(-1);
        ListNode temp = head;
        ListNode refer = ans;
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        while(temp!=null)
        {
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null)
        {
            int currval = temp.val;
            Integer nextval = map.ceilingKey(currval+1);
            if(nextval==null)
            {
                refer.next = temp;
                refer = refer.next;
            }
            temp = temp.next;
            map.put(currval,map.getOrDefault(currval,0)-1);
            if(map.get(currval)==0)
                map.remove(currval);
        }
        refer.next=null;
        return ans.next;
    }
}