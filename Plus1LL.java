/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode plusOne(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode i = dummy;
        ListNode j = dummy;
        
        while(j.next != null){
            j = j.next;
            
            if(j.val != 9){
                i = j;
            }
        }
        
        if( j.val != 9){
            j.val = j.val + 1;
        }
        
        else{
            i.val = i.val + 1;
            
            while(i.next != null){
                i = i.next;
                i.val = 0;
            }
        }
        
        
        if(dummy.val == 0){
            return dummy.next;
        }
        
        return dummy;
                 
        }
        
    }
