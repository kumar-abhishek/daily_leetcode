/*
160. Intersection of Two Linked Lists

Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
*/

//accepted
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
        int la =0, lb =0;
        ListNode tempA=headA, tempB=headB;
        while(tempA !=null){ ++la; tempA = tempA.next;}
        while(tempB !=null){ ++lb; tempB = tempB.next;}
        ListNode node;
        int count = 0;
        if(la > lb) {
            count = la-lb;
            while(count >0) {
                headA = headA.next;
                --count;
            }
        } else if(lb > la){
            count = lb-la;
            while(count > 0) {
                headB = headB.next;
                --count;
            }
        }
        while(headA != null && headB !=null){
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
