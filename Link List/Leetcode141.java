import java.util.*;
public class Leetcode141 {



    // Node class to represent a linked list node
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Static nested class containing all 3 methods
    public static class Solution {

        // Brute Force O(n^2) time, O(1) space
        public static Boolean hascycleBrut(ListNode head) {
            while (head != null) {
                ListNode temp = head.next;
                while (temp != null) {
                    if (temp == head) return true;
                    temp = temp.next;
                }
                head = head.next;
            }
            return false;
        }

        // HashSet-based method O(n) time, O(n) space
        public static Boolean hascycleAvg(ListNode head) {
            HashSet<ListNode> visited = new HashSet<>();
            while (head != null) {
                if (visited.contains(head)) return true;
                visited.add(head);
                head = head.next;
            }
            return false;
        }

        // Floyd's Cycle Detection - O(n) time, O(1) space
        public static Boolean hascycleOptimal(ListNode head) {
            if (head == null || head.next == null) return false;

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) return true;
            }
            return false;
        }
    }

    // Main method to test all implementations
    public static void main(String[] args) {
        // Create a linked list with a cycle: 1 -> 2 -> 3 -> 4 -> 2
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b; // cycle here

        System.out.println("Cycle Present (Brute Force): " + Solution.hascycleBrut(a)); // true
        System.out.println("Cycle Present (HashSet): " + Solution.hascycleAvg(a));      // true
        System.out.println("Cycle Present (Optimal): " + Solution.hascycleOptimal(a));  // true

        // Create a list without a cycle: 1 -> 2 -> 3 -> 4
        ListNode x = new ListNode(1);
        ListNode y = new ListNode(2);
        ListNode z = new ListNode(3);
        ListNode w = new ListNode(4);

        x.next = y;
        y.next = z;
        z.next = w;

        System.out.println("Cycle Present (Brute Force): " + Solution.hascycleBrut(x)); // false
        System.out.println("Cycle Present (HashSet): " + Solution.hascycleAvg(x));      // false
        System.out.println("Cycle Present (Optimal): " + Solution.hascycleOptimal(x));  // false
    }
}
