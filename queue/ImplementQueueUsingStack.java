import java.util.Stack;

public class ImplementQueueUsingStack {
    

}
class Myqueue1{
    // craeting peek efficing means peek takes O(1) but push takes O(n)
    // here we create  the queue using two stack  
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public void push( int x){
        while(!st1.isEmpty()){ // st1 have alraedy elemnt push to helper stack thst is st2 first or make st1 empty 
            
            st2.push(st1.pop());
        }
        // now push at st1 as element push at last like queue
        st1.push(x);
        // then refill that elements again 
        while(!st2.isEmpty()){
            st1.push(st2.pop());

        }
        //  so whenever we peek it  gives the fisrtly inserted element
    }

    public int peek(){
      return  st1.peek();
    }

    public int poll(){
        return st1.pop();
    }

}




class Myqueue2 {

    // creating push efficient queue means push takes O(1)
    // but peek and poll can take O(n)
    // here we create the queue using two stacks

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    // push operation → O(1)
    public void push(int x) {
        // directly push into st1
        // because we are making push efficient
        st1.push(x);
    }

    // peek operation → may take O(n)
    public int peek() {

        // if st2 is empty then transfer all elements from st1 to st2
        // so that oldest element comes on top of st2
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }

        // now top of st2 is the first inserted element (queue front)
        return st2.peek();
    }

    // poll operation → may take O(n)
    public int poll() {

        // same logic as peek
        // move elements only when st2 is empty
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }

        // remove and return the front element
        return st2.pop();
    }
}

class MyqueueAmortized  {
    // this is the amortized way 
    // push -  O(1)
    // peek O(1) also O(n) only in worst case
     Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public void push( int x){
        st1.push(x);
    }

    public int peek(){
        // check is st2 contain element or not if contaain the top elemt of st2 is the peek means the first elemrnt of so called queue 
        // if not we have to full all elements of st1 to st2 and the last pushed element or the top of st2 elemnet id dthe required peek element 
        if(st2.isEmpty()){
            while(!st1.isEmpty())
                {
            st2.push(st1.pop());}
        }
         return st2.peek();
    }

    public int pop(){
        
        // same logic as peek
        // move elements only when st2 is empty
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        return st2.pop();
    }

    public boolean empty(){
        return st1.isEmpty()&&st2.isEmpty();
    }

    
}