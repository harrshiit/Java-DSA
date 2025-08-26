public class LinkLIstImplementation {
    // here we created own linklist data structure without mannual  implementing ny own 
    // as whaterver we pass value to it it assign it as a link list 
    public static class Node// defining node data type 
    {
        int data;
        Node next;
        Node( int data )// creating constructor of it 
        { this.data=data; }
    }
     
    public static class  LinkList {
        // assign head and tail to linklist whose initial value is null 
        Node head= null;
        Node tail=null;
        // now going to create all the function of linklist in this class 
       // all the work we try to do by the temp node in oeder to preserve the authenticity of head and tail node  
        public void inserAtEnd( int value ){
            Node temp = new Node( value);
            if( head==null)// if node  is empty
            {head= temp;
                tail= temp;}
                else{
                    tail.next= temp;
                }
               tail=temp;// pointing out the tail is last node  
        }
      
        public void displayLL(){
            if ( head==null) System.out.println(" link list is empty ");
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data);
                if(temp.next!=null) System.out.print("-->");
                temp=temp.next;
            }
            System.out.println();

        }

        public int  size(){
            Node temp = head;
             int count =0;
             while( temp!= null)
             {count++;
            temp=temp.next;}
            return count ;

        }

          public void inserAtBeginning( int value){
            Node temp = new Node( value);
            if( head == null) head = tail = temp;
            else{
                temp.next= head;// connect the node with head 
                head= temp ; // now make the temp as head 
            }

          }

          // Insert a node with a given value at a specified index (1-based indexing)
    public void insertAtIndex(int index, int value) {
        Node t = new Node(value);  // Create a new node with the given value
         Node temp = head;// creating a refernce node for head like pointer in C++
        if (index == 1) {
            // Special case: inserting at the beginning
            t.next = head;
            head = t;
            return;
        }
      // Traverse to the node just before the desired index in order to do connection work of node 
        for (int i = 1; i < index - 1; i++) {
            if (temp == null) // check of every loop is temp become null or not 
            // like u put at index 10 and only 3 nodes exist 
            {System.out.println("Index out of bounds");
                return; }
            temp = temp.next;// taversing the temp up to just before that node index
        }
       if (temp == null)// after traversing if that temp denotes null 
        {
            System.out.println("Index out of bounds");
            return;
        }
          // Inserting the new node into the list
        t.next = temp.next; // connect the next node of t to temp next 
        temp.next = t;      // now assign the temp next to t to break connection with previos node 
        if(index==size()){
            inserAtEnd(value);
            return;
        }
    }

  public int getElement(int index){
     Node temp = head;
     if(index<0|| index>size() ){
     System.out.println(" wrong index");
     return -1;
     }
     for(int i =1 ; i<index; i++){
     temp=temp.next;}
     return temp.data;
        
    }

    public void deleteAtIndex(int index){
        Node temp= head;
        if(index==1){
            head=head.next;
            return;
        }
        for( int i=1;i<index-1;i++){
            temp=temp.next;
        }
        // If deleting the last node, update tail
    if (temp.next.next == null)
     {
        tail = temp;
    }
        temp.next=temp.next.next;

    }
}
    public static void main(String[] args) {
        LinkList ll= new LinkList();
        ll.displayLL();
        ll.size();
        ll.inserAtEnd(5);
        ll.inserAtEnd(6);
        ll.displayLL();
        ll.inserAtBeginning(10);
        ll.displayLL();
        ll.insertAtIndex(4, 23);
        ll.displayLL();
        System.out.println(ll.tail.data);
        System.out.println(ll.getElement(3));
        ll.deleteAtIndex(4);
        ll.displayLL();
        System.out.println(ll.tail.data);
        
    }
}
