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
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> s=new Stack<>();
        if(head==null || head.next==null)
        return head;
       ListNode temp=head;
        while(head!=null)
        {
          s.push(head);
          head=head.next;
        }
        ListNode newhead=s.pop();
        ListNode newtemp=newhead;

         while (!s.isEmpty()) {
            newtemp.next= s.pop();
            newtemp = newtemp.next;
        } 
        newtemp.next = null;

        return newhead;

            }
}