import java.util.*;
public class ReverseLinkList {

    public static class ListNode {
        int value;
        ListNode next ;
        ListNode(){}
        ListNode( int value){
            this.value=value;
        }
        ListNode(int value , ListNode next){
            this.value=value;
            this.next=next;
        }
        
    }

    public static ListNode brut( ListNode head){
// 1. Traverse the linked list and store all node values in an ArrayList.
// 2. Traverse the list again and assign values in reverse order.
// Time Complexity: O(2N) ≈ O(N)
// Space Complexity: O(N) (extra space for ArrayList)
 if(head==null) return  null ;
 ArrayList<Integer> arr = new ArrayList<>();
 ListNode temp = head;
  while( temp!=null){
    arr.add(temp.value);
    temp=temp.next ;
  }
  temp = head ; // now take back the temp pointer back  to head of linklist 
  for ( int i=arr.size()-1 ;i>=0; i--){
    // start storing value in linklist from last index of array list inoder to make it reverse 
    temp.value = arr.get(i);// assign the last index value of arraylist 
    temp = temp.next;
  }
  return head ;
  
    }

    public static ListNode avg( ListNode head ){
        // recursive approach 
        // Time Complexity: O(N)
        // Space Complexity: O(N) (stack space due to recursion)
        if(head==null || head.next==null) return head ;
        // head == null case for empty node to cover edge case 
        // head.next== null is base case like we head is last node then return that node for the fxn 
        ListNode temp = avg(head.next);// for traversing and go up to the end 
        head.next.next=head ;// point  the next of next pointer back to current
        head.next=null;
         // to break the old forward link and prevent a cycle (loop) in the reversed linked list.
        // Without this line, your reversed list will never end — it’ll keep looping infinitely.
         return temp ;// because go up to the last thats the new head of the linklist 
  }
    
  public static ListNode optimal( ListNode head){
    // use three pointers here 
    ListNode prev= null ; // initilze with null 
    ListNode curr = head ; 
    ListNode after = null ;
    while(curr!=null){
        after = curr.next;
        curr.next=prev;
        prev= curr;
        curr = after ; 
    }
    return prev;
    //     Imagine you’re flipping a chain link by link.
   // At the end, your “previous” hand (holding the last flipped link) is at the front of the new chain — that’s why you return prev.
  }



        

     
    
}
