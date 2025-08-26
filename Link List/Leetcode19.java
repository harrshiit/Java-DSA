import java.util.*;

public class Leetcode19 {
    // Remove the nth node from the end of list and we have head node info only 
     public static class ListNode{
        int value ;
        ListNode next;
        ListNode(){} // deafult constructor not not passing any value creating dummy node 
        ListNode( int value)// constructor for passing a vlue for a node 
        { this.value=value;

        }
        ListNode( ListNode next, int value ){
            //Constructor that sets both the value and the next pointer.
            this.value=value;
            this.next=next;

        }

     }
    public static class  solution {

        public static ListNode removefromEndBrutforce( ListNode head, int index){
            // here return type of this functin should be node 
            // require two pass of list one for calculate size and another for to delete the node 
            // take time complexicity of O(2N)
            int size=0;
            ListNode temp= head;
            while( temp!=null){
                size++;
                temp=temp.next;
            }
            temp = head ; // to  restablish temp pointer to head after traversing for size 
            int m= size-index+1;// index from end is m from start 
             for ( int i=0; i<m-1;i++)//traverse up to one before that node to delete that node 
             { temp=temp.next;

             }
             // after stoping that temp pointer before that removable node 
             temp.next=temp.next.next;// uske next wale me next next walle ki value dal do 
             return head;// head node return kr do 
        

        }

        public static ListNode removefromEndOptimal( ListNode head , int index){
            // here we using two pointer approach to do this in one traverse of list only 
            // take time complexicity of O(n) only 
            ListNode dummy = new ListNode();
            dummy.next=head;
            ListNode slow = dummy;
            ListNode fast = dummy ;// here we assign both pointer to dummy node to covver the 
            // corner case of deleting head node 
            for( int i =1 ; i<=index+1;i++)// here we try to iterate the fast pointer n+1 times ahead of slow 
            // as when fast at its null or last the slow pointer just exactly previous of index node 
            { fast= fast.next; }
            // move both pointer 
            while( fast!= null){
                fast=fast.next;
                slow = slow.next;
            }
            // now slow pointer just exactly before from index node from end 
            // for deleting its next node 
            slow.next=slow.next.next;
            return dummy.next;// this should be return in oder to cover edge case like we only one oide and remove 1 from end 



        }
    
        
    }

     public static void main(String[] args) {
        // ✅ Step 1: Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(node5, 4);
        ListNode node3 = new ListNode(node4, 3);
        ListNode node2 = new ListNode(node3, 2);
        ListNode head = new ListNode(node2, 1);
     System.out.println(" enter the index you want to delete from last ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt;

        // ✅ Step 2: Print the original linked list
        System.out.print("Original List: ");
        printList(head);

        // ✅ Step 3: Call brute force approach and print result
        // We use copyList() here to create a separate copy of the original list.
        // This ensures that changes made by the brute force method don't affect the original list,
        // allowing the optimal method to operate on the full list correctly afterward.
        ListNode resultBrute = solution.removefromEndBrutforce(copyList(head), n);
        System.out.print("After Removal (Brute Force): ");
        printList(resultBrute);

        // ✅ Step 4: Call optimal approach and print result
        // Again using copyList to preserve the original structure for comparison
        ListNode resultOptimal = solution.removefromEndOptimal(copyList(head), n);
        System.out.print("After Removal (Optimal): ");
        printList(resultOptimal);
    }

    // ✅ Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // ✅ Helper function to copy a linked list
    public static ListNode copyList(ListNode head) {
        if (head == null) return null;

        ListNode newHead = new ListNode(head.value);
        ListNode currOld = head.next;
        ListNode currNew = newHead;

        while (currOld != null) {
            currNew.next = new ListNode(currOld.value);
            currOld = currOld.next;
            currNew = currNew.next;
        }
        return newHead;
    }
}
