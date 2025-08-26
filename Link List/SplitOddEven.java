public class SplitOddEven {
    // split the given link list into two one contain even and one contain odd 
   public static class  ListNode{
    int value ; 
    ListNode next;

    ListNode( int value ){
        this.value= value;
    }
    ListNode(){}
    ListNode( int value, ListNode next){
        this.value=value;
        this.next=next;
    }

    }

    public static ListNode[] splitListBrut( ListNode head){
        // using LishtNode [] return type because we have to return two pointer of ListNOde type 
   // Approach 1: Brute Force (Two new lists using dummy nodes)
    // Logic: Traverse original list and create new odd/even nodes separately
    // Time Complexity: O(n), Space Complexity: O(n) (new nodes created)
ListNode dummyodd = new ListNode();
ListNode dummyeven = new ListNode();
ListNode evenTemp= dummyeven , oddTemp=dummyodd;
while (head!=null){
    if(head.value%2==0){
        evenTemp.next = new ListNode(head.value);// create a new node list
        evenTemp = evenTemp.next;
    }
    else{
        oddTemp.next = new ListNode( head.value);
        oddTemp = new ListNode(head.value);
    }
    head = head.next ;
}
   return new ListNode[]{dummyodd.next , dummyeven.next};
   // here we are creating a fix size of array of two elements only so which refering to pointers takes only takes only O(1) space  
    }

    public static ListNode[] splitListOptimal( ListNode head){
        ListNode odddummy = new ListNode();
        ListNode evemdummy = new ListNode();
        ListNode evenTemp= evemdummy , oddTemp = odddummy;
        while (head!=null){
        ListNode nextNode = head.next ; // preverse the value of head next 
        head.next = null;// assign the next of head to nulll to break its linkage for furthur unwanted link between odd and even list 
       if(head.value%2==0){
        evenTemp.next = head ;
        evenTemp = evenTemp.next ;
       }
       else{
        oddTemp.next = head;
        oddTemp = oddTemp.next;
       }
       head = nextNode;
        }
        oddTemp.next=null;
        evenTemp.next = null; // assigning null to both ends 
        return new ListNode[]{ odddummy.next , evemdummy.next } ;
        }

        public static void printList( ListNode head){
            while( head!=null){
                System.out.print(head.value+"->");
                head= head.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {

            int [] value= { 3 , 4, 5 , 6 , 7, 8}; // creating the Linklist using array 
             ListNode head = new  ListNode(value[0]); // setting the head index at zero 
             ListNode temp = head ; // creating temp to navigate andc fix the head pointer 
               // loop for creating a nodes with values 
             for ( int i =1; i<value.length;i++){// starting with 1 because zero already alloted 
                temp.next = new ListNode(value[i]);// current a new node 
                temp= temp.next;

             }
      ListNode[] result = splitListOptimal(head);
      System.out.println(" odd list is ");
      printList(result[0]);//here we are assigning index of array listnode of odddummy 
        System.out.println(" even list is ");
        printList(result[1]);// index of array listnode of evendummy 

            
        }
    
}
