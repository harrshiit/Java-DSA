class MannualImplementation{

  public static void  displayLL( Node head){
    while (head!=null){
        System.out.print(head.data);
        if(head.next!=null) System.out.print("-->");
        head=head.next;
       }

  }

  public static void  displayrecursive(Node head ){
    if(head==null) return ;
    System.out.print(head.data);
    if(head.next!=null) System.out.print("-->");
    displayrecursive(head.next);
  }

  public static void  displayReverseRecursive( Node head){
    if( head==null) return ;
    displayReverseRecursive(head.next);
    System.out.print(head.data);
     if (head!= null ) 
        System.out.print(" --> ");// extra arrow at end 
         }

         public static int  lengthLL( Node head){
          int count = 0 ;
          while (head!=null){
            count++;
            head=head.next;
          }
          return count;
         }

    public static class Node// user define data type 
  { int data;
    Node next;
    Node(int data){// making constructor of user define data type
     this.data=data;
     this.next=null;// next will be null uptill whenevr we did not assign any value 
    }

    }

     public static void main(String[] args) {
        Node a = new Node(5);
        Node b= new Node (6);
        Node c = new Node (8);
        Node d = new Node (10);
        a.next=b;
        b.next=c;
        c.next=d;
       // Now displaying data 
       System.out.print(a.data);
       System.out.print(b.data);
       System.out.print(c.data);
       System.out.print(d.data);
       System.out.println();

       // for display it by iterativtly we have to create head node which is pointing to starting node 
       Node head=a;// here no node is craeted because we dont use Node head = new Node () ; statement 
    
       displayLL(a);// display by using loop
       System.out.println();
       displayrecursive(a);// display it by using recursion  
        System.out.println();
        displayReverseRecursive(a);
        System.out.println();
        System.out.println(" the length of LL ");
        System.out.println(lengthLL(a));

     }
    
}