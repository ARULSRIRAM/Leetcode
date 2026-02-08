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
    public boolean isPalindrome(ListNode head) {
        if(head==null)return false;
        if(head.next==null)return true;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=reverse(slow);
        fast=head;
        while(second!=null){
            if(fast.val!=second.val)return false;
            second=second.next;
            fast=fast.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nextNode;
        }
        return pre;
    } 
}