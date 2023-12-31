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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
            return null;
        
        ListNode preSlow=new ListNode();
        preSlow.next=head;
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null)
        {
            preSlow=preSlow.next;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        preSlow.next=preSlow.next.next;
        
        return head;
//         fast=head;
//         while(fast.next!=slow)
//         {
//             fast=fast.next;
//         }
        
//         fast.next=fast.next.next;
//         return head;
    }
}