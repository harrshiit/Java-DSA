import java.util.Arrays;

public class ReverseArray {

    public static  void ReverseArrayOpt( int[] arr){
        // using the two pointer method optimal approah 
        //In-place swapping using two pointers  Time: O(n), Space: O(1)
        int start = 0 ; 
        int end= arr.length-1;
        
        while(start<end){
         int   temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp ;
            start++;
            end--;  }
        }

        public static int[] ReverseArrayBrut( int [] arr){
            // Brutforce approach using extra space to store result
            // Time: O(n), Space: O(n)
            int n= arr.length;
            int[] result = new int[n];
            for( int i =0 ; i<n-1;i++){
                result[i] = arr[n-1-i];
            }
            return result;
        }

        public static void  ReverseArrayavg( int[] arr, int start , int end){
            // also do in place swaping but use extra space due to recursion stack 
             // Time: O(n), Space: O(n)
             if ( start> end)
              return ;
             int temp = arr[ start];
             arr[start] = arr[end];
             arr[end] = temp ;
            ReverseArrayavg(arr, start++, end--);
           }

           public static void main(String[] args) {
            int [] arr= { 1, 2, 3 , 4, 5 ,6 };
            ReverseArrayOpt(arr);
            System.out.println(Arrays.toString(arr));// using this function because we cant directly call an array 

           }
    
}
