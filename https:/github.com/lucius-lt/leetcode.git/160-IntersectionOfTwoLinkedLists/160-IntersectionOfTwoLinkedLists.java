// Last updated: 7/16/2026, 1:10:44 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null) return null;
        int lenA =0;
        int lenB =0;
        ListNode currA = headA;
        ListNode currB = headB;

        while (currA != null){
            lenA++;
            currA = currA.next;
        }

        while (currB != null){
            lenB++;
            currB = currB.next;
        }
        int diff = Math.abs(lenA-lenB);
        currA = headA;
        currB= headB;
        if(lenA > lenB){
            for(int i=0;i<diff;i++){
                currA =currA.next;
            }

        }
        else{
            for(int i =0;i<diff;i++){
                currB =currB.next;
            }
        }

        while(currA!=null){
            if(currA==currB) return currA;
            currA=currA.next;
            currB=currB.next;
        }
      return null;
    }
}