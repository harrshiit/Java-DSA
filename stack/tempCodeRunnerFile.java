package stack;

import java.util.*;

public class InsertAtstack {

    public static void insert(Stack<Integer> st , int element ,int position ){
        if(position<0|| position>st.size()){
        System.out.println(" invalid position ");
        return ;
        }
        Stack <Integer> temp = new Stack<>(); // creating this to store the elements which is above that particulat position 
        while(position<st.size()){
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
