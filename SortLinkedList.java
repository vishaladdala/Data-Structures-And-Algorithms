/*
148. Sort List
DescriptionHintsSubmissionsDiscussSolution
Sort a linked list in O(n log n) time using constant space complexity.
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
    public ListNode sortList(ListNode head) {
        
       if( head == null || head.next == null){
           return head;
       }
        
        ListNode slow = head, fast = head;
        ListNode prevslow = null;
        
        while( fast!=null && fast.next!=null){
            prevslow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prevslow.next = null;
        
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
       return merge(l1,l2);
    }
    
    public ListNode merge(ListNode l1, ListNode l2){
        //create a dummy node
        
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                p.next = l1;
                l1 = l1.next;
            }
            else{
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next; 
        }
        
        
        if(l1!=null){
            p.next = l1;
        }
        
        if(l2!=null){
            p.next = l2;
        }
        
        return dummy.next;
    }
}