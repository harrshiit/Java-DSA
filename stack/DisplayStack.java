package stack;

import java.util.Stack;

public class DisplayStack {

     public static void displayUsingStack(Stack<Integer> stack){
        Stack <Integer> rt = new Stack<>();
        while(stack.size()>0){
            rt.push(stack.pop());
        }
        while(rt.size()>0){
            int x = rt.pop();
            System.out.println(x+" ");
            stack.push(x); // push back element to original stack 
        }
     }

     public static void displayUsingArray( Stack<Integer> st){
        int n = st.size();
         int [] arr =new int[n];
         for ( int i = n-1 ; i>=0 ; i-- ){
            // here we start filling value in array as the top element of stack stores at last index in array 
            arr[i]=st.pop();
             }

             for( int i =0 ; i<n ; i++){
                System.out.println(arr[i]+" ");
                st.push(arr[i]);  // push back element to  original stack 
             }
     }
      
     public static void displayUsingRecursionReverse(Stack<Integer> st){
        // it will display reverse stack 
        if(st.size()==0) return;
        int top = st.pop();
        System.out.println(top+" ");
        displayUsingRecursionReverse(st); // recursive call 
        st.push(top);// to maintain the originality of stack 
     }

     public static void displayUsingRecursion(Stack<Integer> st){
        // will  display original stack  
        if(st.size()==0) return ;
        int top = st.pop();
        displayUsingRecursion(st);
        System.out.println(top+" ");
        st.push(top);
     }

     
    
}
