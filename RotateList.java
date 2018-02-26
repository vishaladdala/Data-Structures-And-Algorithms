/*
61. Rotate List
Given a list, rotate the list to the right by k places, where k is non-negative.
Example:

Given 1->2->3->4->5->NULL and k = 2,

return 4->5->1->2->3->NULL.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
       if (head == null)
		return head;
	
	   ListNode copyHead = head;
	
	   int len = 1;
	   while (copyHead.next != null) {
		copyHead = copyHead.next;
		len++;
       }
	
	    copyHead.next = head;
	
	    for (int i = len - k % len; i > 1; i--)
		    head = head.next;

	    copyHead = head.next;
	    head.next = null;

	    return copyHead;
 
    }
    
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = head;
        
        while(cur != null ){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        
        return prev;
        
        
    }
}