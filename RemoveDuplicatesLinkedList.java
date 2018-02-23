/*83. Remove Duplicates from Sorted List
DescriptionHintsSubmissionsDiscussSolution
Pick One
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.

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
    public ListNode deleteDuplicates(ListNode head) {
        if( head == null || head.next == null){
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        ListNode prev = dummy;
        
        while(cur != null){
            while( cur.next!= null && cur.val == cur.next.val){
                cur = cur.next;
            }
            if(prev.next != cur){
                prev.next = cur; 
                prev = prev.next;
            }
            else {
                prev = prev.next;
            }
            
            cur = cur.next;
        } 
        return dummy.next;
    }
}