import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    
     public static void Reversequeue(Queue<Integer> q){
        // here we are reversing the queue with the help of stack 
        Stack<Integer> st = new Stack<>();
        while(q.size()>0){ // adding into stack 
            st.push(q.remove());
        }
        while (st.size()>0) {
            q.add(st.pop());
            
        }
     }

     public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        /*Queue<Integer> q = new LinkedList<>(); alternate way 
        q.add(1);
        q.add(2);
         q.add(3);
        q.add(4);
         q.add(5); */
         Reversequeue(q);
         System.out.println(q);
     }
}
