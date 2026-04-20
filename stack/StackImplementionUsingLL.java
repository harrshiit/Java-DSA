package stack;

 class Node  {
    // user define datatype 
    int value; 
    Node next;
    Node(int value)//constructor
    {
        this.value=value;
        this.next=null;
    }

}

  public  class StackImplementionUsingLL {
    // using define Data structure
    private Node top;


    public void push( int value){
        Node newnode = new Node(value);
        newnode.next=top; //here first we are linking with  the list if we directly assign the top value  we new node  the list link will break 
        top= newnode;
        System.out.println(value+" pushed into stack");
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("  stack is empty ");
            return -1 ;
        }

        int poped = top.value;
        top=top.next;
        return poped; }

        public  int peek(){
            if(isEmpty()){
                System.out.println(" stack is empty ");
                return -1;
            }
            return top.value;
          }

          public boolean isEmpty(){
            return top == null ;
          }

          // no is full  function because no limitation on linklist size

          public void displayStack(){ // reverse display wrt to ll 
            // display stack top to bottom 
            // or display LL in reverse order
            if(isEmpty()){
                System.out.println("stack is empty");
            }
            Node temp =  top ;  // here we using temp  pointer only for traversal if we directly print and modify the topor head pointer 
            // the linklist structure gets distroyed 
            while (temp!=null) {
                System.out.print(temp.value+" " );
                temp=temp.next;
                
            }
            System.out.println(); }


            public void displayLL()
            {// will display stack bottom to top 
                if(isEmpty()){
                    System.out.println(" list is empty ");
                    return;
                }
                displayRecursion(top);
                System.out.println(); //to shift the curser tonext line 
              }

              public void displayRecursion(Node node){
                if(node== null) return ;
                displayRecursion(node.next);
                System.out.print(node.value+" ");

              }

            } 
    
            class Main {
                public static void main(String[] args) {
                    StackImplementionUsingLL stack  =new StackImplementionUsingLL(); // object creation 
                    stack.push(10);
                    stack.push(20);
                    stack.push(40);
                    stack.push(100);

                    stack.displayStack();
                    System.out.println();
                    stack.displayLL();

                    stack.pop();
                    stack.displayLL();

    




                }
            
                
            }