
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
         int m = left, n = right;
        
        if (head == null || head.next == null || m <= 0 || n <= 0 || m == n) {
            return head;
        }
        
        ListNode preHead = new ListNode(0);  
        preHead.next = head;
         
        ListNode prev = preHead;
        
        for (int i = 0; i <= m-2; i++) {
            prev = prev.next;
        }
        
        ListNode curr = prev.next;
        ListNode temp = null;
        
        ListNode reverseHead = null;
        
        for (int i = 0; i <= n-m; i++) {
            
            temp = curr.next;         
            curr.next = reverseHead;  
            
            reverseHead = curr;       
            curr = temp;              
            
        }
        
        prev.next.next = curr;
        prev.next = reverseHead;
        
     
    return preHead.next;
        
    }
}