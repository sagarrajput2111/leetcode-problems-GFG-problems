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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode l1=list1,l2=list2,head=null,tail=null;
        if(l1.val<=l2.val)
        {
            head=l1;
            tail=l1;
            l1=l1.next;
        }
        
        else if(l1.val>l2.val){
            
            head=l2;
            tail=l2;
            l2=l2.next;
            
        }
        
        while(l1!=null&&l2!=null)
        {
            if(l1.val<=l2.val)
            {
               tail.next=l1;
                tail=tail.next;
                l1=l1.next;
                
            }
            
            else
            {
                tail.next=l2;
                tail=tail.next;
                l2=l2.next;
            }
        }
        
        if(l1!=null)
            tail.next=l1;
         else
             tail.next=l2;
        
        return head;
    }
}