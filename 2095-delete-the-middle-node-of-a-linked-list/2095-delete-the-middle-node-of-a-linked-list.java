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

        //My Approach -

        // if(head == null) return head;
        // ListNode temp = head;
        // int len = 0;
        // while(temp != null){
        //     len++;
        //     temp = temp.next;
        // }
        // if(len == 1){
        //     return null;
        // }
        // temp = head;
        // int ind = (int)Math.floor(len/2);
        // for(int i = 1; i<ind; i++){
        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;
        // return head;


//  Turtoise and hare approach -
//  Since  hare always moves 2x steps it will cover the LL when turtoise will be at middle of LL.
    if (head.next == null||head==null)
        return null;
    ListNode slow = head;
    ListNode fast = head.next.next;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    slow.next = slow.next.next;
    return head;
    }
}