public class Leetcode328 {
   
    public static class ListNode{
        int value ;
        ListNode next ;

        ListNode( int value , ListNode next ){
            this.value=value ;
            this.next = next ;
        }
        ListNode(){}
        
        ListNode ( int value ){
            this.value=value;
        }
    }

    public static ListNode RearrangeListBrut( ListNode head){
 // BRUTE FORCE APPROACH (O(n) Time, O(n) Space)
// Use two separate lists to store odd and even indexed nodes and then join them 
  if(head==null||head.next==null) return head;// contains no or only single node 
  ListNode odddummy = new ListNode();// for creaing a new list assigning the fist node 
  ListNode evendummy = new ListNode(); // dumy head created for even and odd  list 
  // Now assigning a pointer to both of them which will gonna traverse 
  ListNode oddtemp = odddummy;
  ListNode evenTemp = evendummy;
  int index = 1 ; // consider 1 based indexing because we have to rearrange the even and odd indexs nodes 
  ListNode temp = head ; // craeting this pointer to preserve the original head
  while(temp!=null){
    if(index%2==1){
        oddtemp.next= temp ;// connet the next of oddtemp pointer to odd index place node 
        oddtemp = oddtemp.next ; // now increing the position of oddtemp pointer to up to end node 
    }
    else{
        evenTemp.next = temp ; 
        evenTemp = evenTemp.next;
    }
    temp = temp.next ;
    index++;

  }
  evenTemp.next = null ; // terminate the eveen list because it have to position at last after whole loop ends 
  oddtemp.next= evendummy.next; // connect the last node of odd list with first node of even list 
return odddummy.next;

    } 

    public static ListNode RearrangeListOpt( ListNode head){
        // OPTIMAL APPROACH (O(n) Time, O(1) Space)
    // Cleanest and fastest in-place modification no new node and list is created
   if( head==null|| head.next==null||head.next.next==null) return head ; 
   // here we are using the head.next.next null condition for being safer from the 
   // The list has exactly two nodes. Since there's only one odd and one even node, there's nothing to rearrange.
   // already satisfies the requirement (odd node followed by even node).
   
   ListNode oddtemp = head ; // first odd palce assign to pointer  here pointer are only using to connect and reaarange of list nodes 
   // no new nodes are created here 
   ListNode evenTemp = head.next ; // second place is of even 
   ListNode evenhead = evenTemp; // to keep track of the head of the even 

   while(evenTemp!=null&&evenTemp.next!=null){
    //The loop relies on even and even.next being safe to access first.
    //odd is updated after even, and its safety is indirectly ensured by checking even.next

    oddtemp.next =evenTemp.next; // next odd index after even link the next of odd
    oddtemp=oddtemp.next;// traverse the pointer forward 
    evenTemp.next=oddtemp.next;// now the next of even is after odd index
    evenTemp=evenTemp.next ; // traverse the even pointer 
   }
   oddtemp.next=evenhead;// connecting list 
   return head;

    }
     public static void printList( ListNode head){
            while( head!=null){
                System.out.print(head.value+"->");
                head= head.next;
            }
            System.out.println("null");
        }

    public static void main(String[] args) {
         // Create sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        RearrangeListOpt(head);
        printList(head);

    }
    
}
