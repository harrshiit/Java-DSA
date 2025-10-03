import java.util.ArrayList;

class RemoveDuplicateFromSortedLL{
    // Leetcode 83 

    public static class ListNode{
        int value ; 
        ListNode next;
        ListNode(){}
        ListNode( int value){
            this.value = value;
        }
        ListNode ( int value ){
            this.value= value;
        }
        ListNode( int value , ListNode next){
            this.value = value;
            this.next= next;
        }
    }

    public static ListNode Brute( ListNode head){
         // Time: O(N^2) [because contains() is O(N) inside loop]
        // Space: O(N) for ArrayList
        if( head==null|| head.next==null) return head;
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head ; 
        while(temp!=null){
            if(!arr.contains(temp.value))// if arraylist not contain that value 
            // it also take O(n) complexicity because it is liner search fpr that element takes O(list size ) in worst case
            { arr.add(temp.value);// then add that value in arraylist 
            }
            temp =temp.next;
        }

        // now rebuilding thelinklist using the array list unique elements 
        ListNode dummy = new ListNode();// this default store value 0 at that place 
       // here if we  initilize as  ListNode dummy = null;
// ListNode curr = dummy;
// Now dummy is null, so curr is also null.
// When you try
// curr.next = new ListNode(val);
// 👉 This will throw a NullPointerException (because curr is null and you can’t set next on null).
 ListNode curr = dummy;
 for (  int val : arr){
    curr.next= new ListNode(val);// attaching the new nodes 
    curr=curr.next;
 }
 return dummy.next; // this is basically the head of the list 

 // if we craete this new LL without use the dummy node code look messy like :

// ListNode head = null, curr = null;
// for (int val : arr) {
//     if (head == null) {
//         head = new ListNode(val);
//         curr = head;
//     } else {
//         curr.next = new ListNode(val);
//         curr = curr.next;
//     }
// }
// return head;

 }

 public static ListNode Avg( ListNode head){
    // Logic: Since list is sorted, only check last inserted element before adding
        // Time: O(N)
        // Space: O(N) for ArrayList
    if( head==null || head.next==null) return head;
    ArrayList<Integer> arr = new ArrayList<>();
    ListNode temp = head;
    arr.add(temp.value);// add first element to the list 

      while( temp!=null){
        if(temp.next.value!=arr.get(arr.size()-1)){
            //here we check the next value of the LInklist is equal to the current store value in arrlist or not 
            arr.add(temp.next.value);
        }
         temp=temp.next;
      }
     
    

    // now rebulding that new  Lnklist 
     ListNode  dummy = new ListNode();
     ListNode curr = dummy ;
     for( int num : arr){
        curr.next= new ListNode(num);
        curr = curr.next;
     }
     return dummy.next;// retuen the head
}
  
public static ListNode optimal  ( ListNode head){
     // Logic: Since list is sorted, duplicates are adjacent. 
        // Compare curr and curr.next -> if equal, skip curr.next
        // Time: O(N) 
        // Space: O(1) [no extra space, modifies in-place]
      if(head==null|| head.next==null) return head  ;
        ListNode curr = head;
         while(curr!=null&&curr.next!=null){
            if(curr.value==curr.next.value){
             curr.next=curr.next.next;
            }
            else{
                curr = curr.next;
            }
           }
           return head ; 

         }


   
 }