// Last updated: 7/16/2026, 1:11:41 AM
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null) return head;


        //copy of  head
        ListNode dummy = new ListNode(0);
        dummy.next= head;
        ListNode prev= dummy;


        for(int i =1;i<left;i++) prev = prev.next;

        //copy of sublist
        ListNode Current = prev.next;
        ListNode next;
       // ListNode reversed = Current;


        for(int i =0;i<right-left;i++){
            next= Current.next;
            Current.next= next.next;
            next.next= prev.next;
            prev.next= next;
        }
        return dummy.next;
    }
}