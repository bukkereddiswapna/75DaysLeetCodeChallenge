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
    public ListNode swapPairs(ListNode head) {
      ListNode dummy=new ListNode(0);
      dummy.next=head;
      ListNode cur=dummy;
      while(cur.next!=null && cur.next.next!=null){
      ListNode first=cur.next;
      ListNode sec=cur.next.next;
      first.next=sec.next;
      sec.next=first;
      cur.next=sec;
      cur=first;

      }       
      return dummy.next;
    }
}