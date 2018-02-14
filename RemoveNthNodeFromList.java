/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveNthNodeFromList{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode f = dummy;
        ListNode s = dummy;
        
        while(n+1 > 0){
            f = f.next;
            n--;
        }
        
        while(f!=null){
            f = f.next;
            s = s.next;
        }
        
        s.next = s.next.next;
        head = dummy.next;
        
        return head;
    }
}