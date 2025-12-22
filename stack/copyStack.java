package stack;

import java.util.*;
public class copyStack {
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
           System.out.println(" the original stack are : " +st);
    

    // now doing steps to copy the same stack 
 // 1. store in another stack that will be in reverse order 
 Stack<Integer> rt = new Stack<>();
 while(st.size()>0){
    int x = st.peek();// peek first elemt and store in x can  also use pop()operation 
    rt.push(x);
    st.pop();// remove top element 
    // can also done  by 
   // rt.push(st.pop()); all above 3 lines work in one line 
 }
 System.out.println(" the new reverse stack  will be "+rt);

 // now copy this stack rt  to another stack 
 Stack<Integer> ct =new Stack<>();
    while (rt.size()>0) {
        ct.push(rt.pop());
       }
       System.out.println(" the new copy  stackis "+ct);

    sc.close();

    /* here time compelxicity it takes O(3n)= O(n) , n for store in main stack n for store in revese stack and n 
    for store in copy stack operation 
      and space complixicity is o(3n)= O(n) , n space for main stack n spce for revese stack n space for copy stack */
    
    }
}
