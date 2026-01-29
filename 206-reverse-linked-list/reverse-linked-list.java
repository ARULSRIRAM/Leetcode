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
        // Brute Force Solution =>
        // ListNode temp=head;
        // List<Integer> li=new ArrayList<>();
        // while(temp!=null){
        //     li.add(temp.val);
        //     temp=temp.next;
        // }
        // temp=head;
        // for(int i=li.size()-1;i>=0;i--){
        //     temp.val=li.get(i);
        //     temp=temp.next;
        // }
        // return head;
        ListNode temp=head,pointer=null;
        while(temp!=null){
            ListNode nextnode=temp.next;
            temp.next=pointer;
            pointer=temp;
            temp=nextnode;
        }
        return pointer;

    }
}