package stack;

public class SlidingWindowMaximum239 {
    public static int[]  brut(int[] nums ,int k){
        // time - n*k  ,  spacee - n
        int n = nums.length ; 
        int[] ans = new int[n-(k-1)]; // it only holds n-(k-1) =n-k+1 element
        // all because it starts with 0 index and last window index is n-k 
        int index=0 ;
        for ( int i = 0 ; i<n-k+1 ; i++){
            int max = Integer.MIN_VALUE;
            for( int j= i ; j<i+k;j++){// traverse k elements 
                max= Math.max(max , nums[j]);
               }
               ans[index]= max;
               index++;
        }
        return ans;

    }

    public static vois mainpsus strig  pu
    
}
