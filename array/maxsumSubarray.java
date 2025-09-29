package array questions;

public class maxsumSubarray {

    public static int maxsumSubarraybrut( int[] arr){
        /**
     * 1. Brute Force Approach
     * Logic: Try all possible subarrays and calculate their sums.
     * Time Complexity: O(n^3)
     * Space Complexity: O(1)
     */
        int n = arr.length;
        int maxsum=Integer.MIN_VALUE;
        
        for( int i =0 ; i<n;i++){
            for( int j=i;j<n;j++){
                int sum=0;// because we reset it zero with each subarray 
                for( int k=i;k<=j;k++){
                sum= sum+arr[k];// store the value sum of sub string 
                }
                maxsum=Math.max(maxsum,sum);
            }
        }
       return maxsum; 
    }

    public static int maxsumSubarrayAvg( int[] arr){
        // Approach 2: Better (Without Prefix Sum)
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;
         for( int i=0;i<n;i++){
            int sum =0 ;
            for( int j =i ; j<n;j++){
                sum=sum+arr[j];
                maxsum=Math.max(maxsum,sum);
            }
         }
         return maxsum ;
    }

public static int maxsumOptimal1( int [] arr){
    // kadane algo not wworks for array contrains all negative numbers 
    int maxsum = Integer.MIN_VALUE;
    int sum = 0 ;
    for ( int i=0 ; i<arr.length; i++){
        sum = sum + arr[i];
        maxsum = Math.max(sum, maxsum);
        if(sum<0) sum=0;
    }
    return maxsum;
} 

public static int maxsumOptimal2( int [] arr){
    // kadane algo not works for all 
    int maxsum = arr[0];
    int sum = arr[0]; // asigm the sum with the firt element 
    for ( int i=0 ; i<arr.length; i++){
        sum = Math.max(arr[i],  sum+arr[i]);
        maxsum = Math.max(sum, maxsum);
        if(sum<0) sum=0;
    }
    return maxsum;
} 
    
}
