import java.util.*;

public class Leetcode21 {
    // merge two sorted list with using extra space 
    public static class ListNode{
        int value;
        ListNode next;
        ListNode(){}// create a constructor to create dummy node which doest store any value 
        ListNode( int value){
            this.value=value;
        }
        // here we do not gonna create the constructer for value and and next both because we assign the next manually 
        //nit by passing the  value in constructor 
         }
        public static ListNode MergeLLBrut( ListNode L1 , ListNode L2){
              // l1  nad L2 both are the starting head node of the  linklist 
              // 1. Brute Force Approach (Using ArrayList)
             // Time Complexity: O((m + n) log(m + n)) due to sorting m and n are the respective length of linklist 
              // Space Complexity: O(m + n)
              ArrayList<Integer> list = new ArrayList<>();

              while(L1!=null){
                list.add(L1.value);
                L1=L1.next;
                 }

                 while (L2!=null) {
                    list.add(L2.value);
                    L2=L2.next;
                 }
                 Collections.sort(list);

                 ListNode dummy= new ListNode();
                 // An empty linklist creating to store sorted valur here dummy is head which will contain null value 
                 ListNode temp = dummy ; // creting temp pointer 
                 for( int val : list){
                    temp.next= new ListNode( val );
                temp=temp.next;                 }
                return dummy.next;

        }
       
         public static ListNode MergeLLAvg( ListNode L1 , ListNode L2){
             // 2. Average Approach (Creating New LinkList by Comparing Nodes)
            // Time Complexity: O(m + n)
            // Space Complexity: O(m + n) for new nodes
            ListNode dummy = new ListNode();
            ListNode temp = dummy ;
            while ( L1!=null && L2!=null) {
                if(L1.value<L2.value){
                    // l1 value is smaller so add it in the list 
                    temp.next = new ListNode(L1.value);
                    L1=L1.next; }

                else{
                    temp.next=new ListNode(L2.value);
                    L2=L2.next;}
                       temp=temp.next;
                   }

                   while(L1!=null)//when L2 ended 
                   {
                    temp.next =new ListNode(L1.value);
                    L1=L1.next;
                    temp=temp.next;
                   }

                   while(L2!=null){
                    temp.next = new ListNode(L2.value);
                    L2=L2.next;
                    temp=temp.next;
                   }

                   return dummy.next;
               }

               public static ListNode MergeLLOptimal( ListNode L1 , ListNode L2){
                // 3. Optimal Approach (In-place Merge)
                // Time Complexity: O(m + n)
               // Space Complexity: O(1), modifies and reuses input lists
               ListNode dummy = new ListNode();
               ListNode temp = dummy;
               while(L1!=null&&L2!=null){
                if(L1.value<L2.value){
                    temp.next=L1;// we only assgning pointer to direct path using both list no need to assign any value
                    L1=L1.next;
                }
                else{
                    temp.next=L2;
                    L2=L2.next;
                 }
                 temp=temp.next;
               }

               if(L1==null){
                temp.next=L2;// after L1 become null assign whole chain of L2 as it is already sorted 
               }
               else temp.next=L1;

               return dummy.next;
}

public static void main(String[] args) {

        // Create list1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Create list2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // Call optimal merge function
        ListNode merged = MergeLLOptimal(list1, list2);

        // Print merged list
        System.out.println(" the merged list is ");
        while (merged != null) {
            System.out.print(merged.value + " -> ");
            merged = merged.next;
        }
        System.out.println("null");
}
}