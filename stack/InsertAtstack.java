package stack;

import java.util.*;

public class InsertAtstack {

    public static void insert1(Stack<Integer> st , int element ,int position ){
      // here we assume 1 based indexing from bottom
        Stack <Integer> temp = new Stack<>(); // creating this to store the elements which is above that particulat position 
        while(position-1<st.size()){
            // this insert the all elements above that inserting postion to  temp  stack 
            // after pop from main stack the size keep decreasing 
            temp.push(st.pop());
         }
         st.push(element);// now push that element at particular postion 

         // now  again push the store elements in temp in main stack 
         while(temp.size()>0){
            st.push(temp.pop());
           }
         }

         public static void insert2(Stack<Integer> st , int postion , int value ){
          // here we insert to assume 0 based indexing from top 
          Stack<Integer>temp = new Stack<>();
          for(  int i = 0 ;i<postion;i++){
            temp.push(st.pop());

          }
          st.push(value );
          while(!temp.isEmpty()){
            st.push(temp.pop());
          }
         }



         public static void insertAtBottomRecursive(Stack<Integer> st ,int value  ){
          if(st.isEmpty()){
            st.push(value);
            return;
          }
          int top = st.pop();
          insertAtBottomRecursive(st, value);
          st.push(top);
         } 
        
         /*In stack problems, indexing is generally considered 0-based from the top of the stack, unless the 
         question clearly specifies otherwise. For example,
          if the stack is 1 2 3 4 (where 4 is the top) and the question says
           “insert 99 at index 2”, it usually means counting from the top, resulting in 1 2 99 3 4. However,
            if the question says “insert 99 at the 3rd position from the bottom”, then bottom-based (1-based) 
         indexing is used, and the same result 1 2 99 3 4 is obtained, but with a different interpretation. */
         
         public static void pushatindex(Stack<Integer> st , int position , int value){
           // Function to insert an element at a given index from TOP (0-based)
          if( position==0){
            st.push(value);
            return;
          }
          int top  = st.pop();
          pushatindex(st, position-1, value);
          st.push(top);
         }
         

         // Function to insert at k-th position from BOTTOM (1-based)
         public static void pushatindex2(Stack<Integer> st ,int position ,int value){
          if(st.isEmpty()) return ;
          int top =  st.pop();
          pushatindex2(st, position, value);
           
          if(st.size()==position-1) st.push(value);

          st.push(top);
         }


         public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println(" enter the size of elements you want to store ");
        int n = sc.nextInt();
        Stack <Integer> st =new Stack<>();
        System.out.println("enter the  elements ");
        // filling the elements in stack 
        for (int i =1 ; i<=n ; i++){
            int x = sc.nextInt();
            st.push(x);
           }
           System.out.println(" the stack is "+st);
           System.out.println("eneter the  postion you want to insert the new element in this stack ");
           int pos= sc.nextInt();
           System.out.println(" enter the value of that element");
           int val =sc.nextInt();
           insert(st, val, pos);
           System.out.println(" NOW the stack becomes "+st);
           sc.close();
         }
    
}
