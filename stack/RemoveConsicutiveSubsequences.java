package stack;
import java.util.*;

public class RemoveConsicutiveSubsequences {

    /* There is given a sequence of number remove all
     the consicutive subsequneces of length greater than or euqal  to 2   */


    public static int[] remove( int [] arr){

        int n = arr.length;
        // solve by using stack 
        Stack<Integer> st = new Stack<>();
        for( int i =0 ; i <n ; i++){
            if(st.size()==0 || st.peek()!=arr[i]) st.push(arr[i]);

            
            else if(st.peek()==arr[i]){
                if(i==n-1 || arr[i]!=arr[i+1]){ // i==n-1 is check means there id no i+1 exist 
                     // this is beacuse for checking next element also if there exist more than two consecutive 
                    // and we directly pop it if gets same cause code illogic
                    st.pop();} } 
                }
                    // here we not give for if arr[i] ==arr[i+1] we do nothing either push that in stack or pop from stack 
                    int[] resultarray = new int[st.size()];// creating result array to store the updated stack value 
                     int m = st.size();
                     for( int j=m-1 ; j>=0 ; j--){
                        resultarray[j]=st.pop();
                           }
                           
                           return resultarray;
                        }


    public static void main(String[] args){

        int arr[]= { 1 , 2 , 3 , 10 , 10 ,  5 , 5 ,5 , 9};
        int [] result = remove(arr)  ; //  answer is {1,2,3,9}
        System.out.println(Arrays.toString(result));

    }

                          
                    

                    



            
        



    }
