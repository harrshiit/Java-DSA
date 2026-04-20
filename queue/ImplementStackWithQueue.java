import java.util.*;
// leetcode 225 
public class ImplementStackWithQueue { // customized data type
    private Queue<Integer> q = new LinkedList<>();
    public void push(int x){
        q.add(x);// sucesfully added now doing the rearrneging process
        // in stack the element we push generally that store at last
        // suppose we already have elements and push anotger element in queue it insert from last 
        // but instack last in first out  so we make that last inserted element comes at front as whenever we poll element that last incomes out first 
        // so we reverse the arrangement 
        for( int i =0 ; i<q.size()-1; i++){
            q.add(q.poll()); // poll remove from first and  add insert at last 
        }
    }

    public int  pop(){  //for polling or removing element in stack we use pop()
   return q.poll(); // queue is already isnerted in  stack manner so its always polls out the  last inserted element 
      }
  
      public int top(){
        return q.peek();
      }

      public boolean empty(){
        return q.isEmpty();
      }


    
}
