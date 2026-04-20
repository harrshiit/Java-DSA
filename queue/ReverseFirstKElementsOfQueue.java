import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsOfQueue {

    public static void reverseFirstK(Queue<Integer> q , int k){
        // make a stack
        Stack <Integer> st = new Stack<>();

        // now pushing fisrt k  elements to stack stack automatically store it and make arrange in revesrse order
        //as removal of queue from front and insertionfrom rear 
        while(q.isEmpty()||k>q.size()||k<=0) return;
       for(int i = 0 ; i<k ;i++){
        st.push(q.remove());

       }

       // now replace the reverse order element back to queue but insertion is from the rear side 
       while(st.size()>0){
        q.add(st.pop());
       }
       //  now remaining elements shifted in front now place it in rear by removing and adding again
       for( int i = 0 ; i<q.size()-k ; i++){
        q.add(q.remove());
       }


    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        reverseFirstK(q, 3);
        System.out.println(q); // [3, 2, 1, 4, 5]
    }
        
    }
