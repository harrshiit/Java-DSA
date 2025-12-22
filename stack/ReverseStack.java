package stack;

import java.util.Stack;

public class ReverseStack {
    public static void reverse(Stack<Integer> st) {
        // let srt = 1234
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop()); //rt=4321
        }
        Stack<Integer>ct = new Stack<>();
        while(rt.size()>0){
            ct.push(rt.pop()); //ct= 1234 
        }
        while(ct.size()>0){
            st.push(ct.pop());
        }

    }   


    public static void ReverseRecursion(Stack<Integer> st){
        if(st.isEmpty()) return; 
        int top  = st.pop();
        ReverseRecursion(st);
        insertAtBotteom(st ,top);

    }

    public  static void insertAtBotteom(Stack<Integer> st ,int value){
        if(st.isEmpty()){
            st.push(value);
            return;
        }
        int top = st.pop();
        insertAtBotteom(st, value);
        st.push(top);


    }
}
