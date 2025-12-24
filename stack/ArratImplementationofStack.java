package stack;

/*
This program demonstrates the internal working of a stack using an array, showing how elements are manually pushed and popped using a top index.
It is not using Java’s inbuilt stack (java.util.Stack), which already provides ready-made methods and handles memory internally.
Overflow occurs here because the array has a fixed size, so inserting more elements than its capacity is not allowed.
Underflow occurs here because the program must manually check whether the stack is empty before removing an element.
In an inbuilt stack, overflow and underflow are not possible in the same way because it resizes dynamically and 
throws exceptions instead of failing silently, making it safer and easier to use. */

class StackOwn // make our customize data type 
{
    private int[] stack ; 
    private int top ; 
    private int capacity;

     // Constructor to initialize stack with a given size

     StackOwn(int size ){
        capacity = size ;
        stack = new int[capacity];
        top=-1 ;
     }

     public void push(int value ){
        if(top==capacity-1){
            // the index of top is full
            System.out.println("Stack overflow cant push any value ");
            return;
        }
        // Increment top and insert the value at new top position
        top++ ;
        stack[top]= value ;
     }

     public int pop(){
      if(top==-1){
         System.out.println(" stack underflow no element is in the stack");
         return -1 ;
      }
      return stack[top--]; 
      // note if we write the top-- later the code become unreachble because the function already returned something the line before it  
      
         }

         public int peek(){
            if(top==-1){
               System.out.println(" stack is empty");
            }
            return stack[top];
         }

         public boolean isEmpty(){
            return top==-1; // it returns true if top is at -1 
         }

         public void display(){
            if(top==-1) {
                System.out.println(" stack is empty ");
                return; }
                for( int i = 0 ; i<=top ; i++){
                  System.out.print(stack[i]+" ");
                }
                System.out.println();
}
}

public class ArratImplementationofStack {
   public static void main(String[] args) {
      StackOwn st = new StackOwn(5);
      st.push(5);
      st.push(9);
      st.push(7);
      st.push(6);
      st.push(4);
      st.display();
      
      st.pop();
      /* Note here the return type of pop is not void like it return the int but need not to store that in variable and 
      print it we also cant make it void becuse we can lost that pop valued forever if in case needed somewhere  */
      System.out.println(" stack after pop");
      st.display();
      System.out.println(" now the top element is "+ st.peek());
   }
    
}
