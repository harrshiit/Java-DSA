public class LinkedListImplementation {
 // in linkedlist implementation of stack eeverything can be possible with head pointer alone because it follows LIFO
// but in queue we need FIFO so we need to make tail pointer 
/*LinkedList implementation of queue allows insertion at the rear and deletion from the front in O(1) time.
Stack implementation using LinkedList performs push and pop operations at the head.
Compared to arrays, LinkedList provides dynamic size and efficient insertion and deletion without shifting, making it suitable for stack and queue implementations. */
public static class Node {
    int value;
    Node next;
     Node( int data){
        this.value =data;
        this.next= null ;

     }

   
}
    

public static class LLQueue{
    Node head = null  ;
    Node tail =null ;
    int size = 0 ;

    public void add (int x){
        Node temp= new Node(x);
        if(size==0){
            head =tail =temp ;
        }
        else { // already node present
            tail.next=temp;
            tail = temp ; // or tail = tail.next
          }
          size++; }

          public int remove(){
            if(size==0) return -1 ;
            int x = head.value; 
            head = head.next ; 
            size-- ;
            return x ;
          }

          public void display(){
            Node temp = head ;
            if(head==null) System.out.println(" queue is empty ");
            while(temp!=null){
                System.out.print(temp.value+" ");
                temp = temp.next;
            }
            System.out.println();
          }

          public boolean isEmpty(){
            if(size==0) return true ;
            else return false;
          }

          public int peek(){
            return head.value;
          }

          }   
          
          public static void main(String[] args) {
           LLQueue q = new LLQueue(); //creating object 
           q.display();
           q.add(1);
           q.add(2);
           q.add(3);
           q.add(4);
           q.display();
           q.peek();
           q.remove();
           q.display();


          }

}
