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

//My Approach-

class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         if(head == null) return head;

//         int len = 0;
//         ListNode temp = head;
//         while(temp != null){
//             len++;
//             temp = temp.next;
//         }
//         if(len == n){
//             return head.next;
//         }
//         int ind = (len-n-1);
        
//         temp = head;
//         while(ind > 0){
//             temp = temp.next;
//             ind--;
//         }
//         temp.next = temp.next.next;
//         return head;
//     }


//Optimized approach in one go-
public static ListNode DeleteNthNodefromEnd(ListNode head, int N) {
        // Create two pointers, fastp and slowp
        ListNode fastp = head;
        ListNode slowp = head;

        // Move the fastp pointer N nodes ahead
        for (int i = 0; i < N; i++)
            fastp = fastp.next;

        // If fastp becomes null, the Nth node from the end is the head
        if (fastp == null)
            return head.next;

        // Move both pointers until fastp reaches the end
        while (fastp.next != null) {
            fastp = fastp.next;
            slowp = slowp.next;
        }

        // Delete the Nth node from the end
        slowp.next = slowp.next.next;
        return head;
    }
}