/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        //Finding the middle node
        ListNode fast = head; ListNode slow = head;
        while( fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        if(fast!=null){
            //thi indicates odd number of node in the list
            slow = slow.next;
            //to make the right list smaller
        }
        
        slow = reverse(slow);
        
        fast = head;
        
        
        while(slow!=null){
            if(slow.val != fast.val){
                return false;
            }
            
            slow = slow.next;
            fast = fast.next;
        }
        
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev  = curr;
            curr = next;
        }
        
        return prev;
    }
}