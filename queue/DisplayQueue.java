import java.util.*;

public class DisplayQueue {

    public static void Display(Queue<Integer> q) {
        /*Time Complexity: O(n), as all n elements are traversed for printing.
          Space Complexity: O(1) auxiliary space, but O(n) if output space is considered. */
        System.out.println(q);

    }

    public static void  display2( Queue<Integer> q){

        /* In:C C++ Competitive programming Interviews Exams
        There is NO built-in print queue function. 
        then we need  to  know how to print queue */

        /*
Time Complexity: O(n)
- First loop traverses n elements
- Second loop restores n elements

Space Complexity: O(n)
- Extra helper queue is used to store n elements
*/

        Queue<Integer> qhelper = new ArrayDeque<>();// can also make queby this technique
        while(q.size()>0){
            System.out.print(q.peek()+" "); // printing elements
            qhelper.add(q.poll());
        }
        while(qhelper.size()>0){
            q.add(qhelper.poll()); // pushing element back to original queue 

        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        Display(q);
    }
}
