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
        ListNode l1=headA;
        ListNode l2=headB;
        int l1c=0;
        int l2c=0;
        while(l1!=null){
            l1=l1.next;
            l1c++;
        }
        while(l2!=null){
            l2=l2.next;
            l2c++;
        }
        int pos=Math.abs(l2c-l1c);
        ListNode p1=null,p2=null;
        if(l2c>l1c)     p1=headB;
        if(l1c>l2c)     p1=headA;
        if(l1c == l2c){
            p1=headA;
            p2=headB;
        }
        if (p1==headA) p2=headB;
        if(p1==headB) p2=headA;
        while(pos-- > 0){
          p1=p1.next;
        }
        while(p1!=null && p2!=null){
            if(p1==p2) return p1;
            p1=p1.next;
            p2=p2.next;
        }

    return null;
    }
}