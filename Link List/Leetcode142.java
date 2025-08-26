import java.util.*;

public class Leetcode142 {
     // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
           this.val = x;
            this.next = null; }
            ListNode(int val, ListNode next){
                this.val=val;
                this.next=next;
            }
        }
        public static ListNode findCycleBrut( ListNode head){
              // Approach 1: Brute Force (using HashSet)
             // Time Complexity: O(N)
             // Space Complexity: O(N)
            HashSet<ListNode> visit = new HashSet<>();
            while(head!=null){
                 if(visit.contains(head)) return head;
                visit.add(head);
                head=head.next;
            }
            return  null;
            }

            public static ListNode findCycleOptimal( ListNode head){
         // 1. Use slow and fast pointers to detect a cycle.
        // 2. Once cycle is detected, place one pointer at head and move both one step at a time.
        // 3. Their meeting point is the start of the cycle
        ListNode fast=head;
        ListNode slow= head;
        while(fast!=null&&fast.next!=null){
            //Because we don't know in advance whether the list has a cycle or not.
            // We are trying to detect it. That null-check is necessary to avoid a crash in case the list has no cycle
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                // cycle found now find the satrting node 
                // we can create another pointer or reinitilize the fast pointer 
                fast=head;
                while(fast!=slow){
                    slow=slow.next;
                    fast=fast.next;                }
                   }
                   return slow;
        }
        return null;
            }

            public static void main(String[] args) {
        // Manually creating a linked list: 3 -> 2 -> 0 -> -4
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creating cycle at node with value 2

        ListNode head = node1;

        // Test Brute Force Approach
        ListNode result1 = findCycleBrut(head);
        System.out.println("Brute Force Detected Cycle At Node Value: " + (result1 != null ? result1.val : "null"));

        // Test Optimal Approach
        ListNode result2 = findCycleOptimal(head);
        System.out.println("Optimal Detected Cycle At Node Value: " + (result2 != null ? result2.val : "null"));
    }
}