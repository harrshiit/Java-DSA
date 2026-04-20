package stack;

import java.util.Stack;

public class ImplementMinStack155 { //customize Data type
    // brutforce 
    Stack <Integer> st =new Stack<>();
    Stack <Integer> min =new Stack<>();// here creating another extra min stack 

    public ImplementMinStack155(){ // constructor // we can also initikize our stack here after declaring outside 

    }
   
    public void push( int value){//  push method 
        if(st.size()==0){ // means both stack are empty
            st.push(value);
            min.push(value);
            }
            else{ //means min stack already have some elemet 
                st.push(value);
                if(min.peek()<value) min.push(min.peek()); // value is alraedy smaller than new one then push same elemeent at top again
                else min.push(value);

            }
        }

  public void pop(){ // pop method 
    st.pop() ;
    min.pop();
    }

  public int top(){ // here we have to return the top elemeof the mai stack 
    return st.peek();
   }

  public int getMin(){ // it is basically aleways at the top of  min stack 
    return min.peek(); 

  }


  class  MinstackAvg{
    
  }


    
}
