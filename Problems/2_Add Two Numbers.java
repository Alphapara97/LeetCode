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
//add the numbers , keep in check if there is any carry , if carry present , need to add the carry to the next number
// and keep on incrementing until all the node are empty.
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode current = new ListNode();
        current = dummy;


        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            if (l1 != null){
                carry +=l1.val;
                l1 = l1.next;
            }else{
                carry +=0;
            }
            if (l2 != null){
                carry += l2.val;
                l2 = l2.next;
            }else{
                carry +=0;
            }

            current.next = new ListNode(carry%10);
            carry /= 10;
            current = current.next;
        }
        return dummy.next;
    }
}