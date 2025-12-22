package stack;

import java.util.Stack;

public class ReamoveAtStack {

    public static void removefrombottom(Stack<Integer> st){
        Stack<Integer>temp = new Stack<>();
        while(st.size()>1){
            //loop u top 2nd last 
            temp.push(st.pop());
        }
        st.pop(); // removing last

    while (!temp.isEmpty()){
        st.push(temp.pop());
    }
    }

    public static void removefrombottomRecursive(Stack<Integer> st){
        if(st.size()==1) {
            st.pop();
            return;
        }
        int top = st.pop();
        removefrombottomRecursive(st);
        st.push(top);
    }

    public static void removeKthElementFromBottom(Stack<Integer> st , int postion){
        
    }
    
}
