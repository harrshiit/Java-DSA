import java.util.ArrayList;

public class Leetcode876 {
    // find the middle of linklist if head of linklist is given 
    // if two middle nodes return the second node even number case 
    public static class ListNode{
        int value ;
        ListNode next;
        ListNode(int value , ListNode next){// constructor with two arguments 
            this.value = value ;
            this.next= next;
        }
        ListNode(){}// constructor with no argument 
        ListNode( int value){
            this.value=value;
        }

    }

    public static class Solution{
        public static ListNode findMiddleNodeBrut( ListNode head){
            // here we have to do two passes one for calulating size another for middle 
            // takes O(n)+O(n/2)  time complexicity and O(1) space complexicity 
            int size=0;
            ListNode temp=head;
            while(temp!=null){
                size++;
                temp=temp.next;
              }
              // now reposition the temp pointer 
              temp=head;
              for( int i=1;i<size/2+1;i++)// +1 because we want right most middle in case of even and exact middle in case of odd
              {temp=temp.next;
               }
               return temp;

        }

        public static ListNode middleNodeAvg( ListNode head){
            //store all nodes in arraylist and tjen access the middle node 
            // extra space require O(n) time complexicity and O(N) space complexicity due to extra space 
            ArrayList<ListNode> list= new ArrayList<>();
            while ( head!=null){
                list.add(head);// while adding indexing is from zero 
                head=head.next;
            }
            return list.get(list.size()/2);// zero based indexing so it will give correct answer for even and odd

        }

        public static ListNode mListNodeOptimal( ListNode head){
            ListNode slow= head;
            ListNode fast=head;
            while(fast!=null&&fast.next!=null){
                // here two condition when case of even fast go up to null
                // in sae of odd no of nodes we have to stop when fast.next is null both case have to handle alsong 
                // so that we can do fast.next.next
                 slow=slow.next;
                fast=fast.next.next;
                }
                return slow;
                // at time when the fast approach to null (in even nodes case) or fast at before null 
                // slow pointer at exactly at required middle posotion 
        }
    }

     public static void main(String[] args) {
        // Build sample linked list: 1 → 2 → 3 → 4 → 5 → 6
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        // Run all three methods
        ListNode midBrut = Solution.findMiddleNodeBrut(head);
        ListNode midAvg = Solution.middleNodeAvg(head);
        ListNode midOptimal = Solution.mListNodeOptimal(head);

        // Print results
        System.out.println("Middle (Brute): " + midBrut.value);
        System.out.println("Middle (ArrayList): " + midAvg.value);
        System.out.println("Middle (Optimal): " + midOptimal.value);
    }
}
