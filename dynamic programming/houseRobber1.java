public class houseRobber1 {

    public int recursive( int [] nums ){
     // Approach 1: Recursion (Brute Force)
    // Time Complexity: O(2^n) -> because we branch into 2 choices at every step
    // Space Complexity: O(n) -> recursion stack
        int n = nums.length;
        return helper1( nums , n-1);// n-1 because its is zero based indexing and last house is at n-1 
    }

    private int helper1( int [] nums , int n ){
       if( n<0) return 0 ;// base case no house left traverseing from back 
        return Math.max(nums[n]+helper1(nums,n-2),helper(nums, n-1));
        // here if they rob that house money of that house num[i] and next to adjaacent i-2
        // they they skip then next to i that is i-1 
    }
    
    public int dpMemoization( int [] nums){
     // Approach 2: Recursion + Memoization (Top-Down DP)
    // Time Complexity: O(n) -> each state is computed once
    // Space Complexity: O(n) -> recursion stack + memo array
    int n = nums.length;
    Integer[] dp  = new Integer[n];// this inilize the  array with null 
    return helper2( nums , n-1 , dp ); // passing that array that index and array to store value 
    }
    private int helper2( int [] nums , int n , Integer[]  dp ){
        if( n < 0) return 0 ;// base case 
        if(dp[n]!= null ) return dp[n]; // if already have value  return it 
        // now saving result 
        dp[n]= Math.max( nums[n]+helper2(nums, n-2, dp), helper2(nums, n-1, dp));
        return dp[n];
    }
    
    public int dpTabulation( int[] nums ){
     // Approach 3: Dynamic Programming (Bottom-Up)
    // Time Complexity: O(n)
    // Space Complexity: O(n)
     int n = nums.length;
     if(n==0) return 0 ;// no house remain to rob 
     if(n==1) return nums[0];// first house rob amount 
     int [] dp = new int[n];
     for( int i =2 ; i < n;i++){
         // Either rob current + dp[n-2], or skip current and take dp[n-1]
         dp[i]=Math.max( nums[i]+dp[n-2], dp[n-1]);
     }
     return dp[n-1];// max amout can rob up to last house 
      }

      public int dpOptimized( int[] nums ){
         // Approach 4: Space Optimized DP
         // Time Complexity: O(n)
        // Space Complexity: O(1)
     int n = nums.length;
     if(n==0) return 0 ;// no house remain to rob 
     if(n==1) return nums[0];// first house rob amount 
       int prev2 = nums[0];// best loot till previous house 
       int prev1 = Math.max( nums[0] , nums[1]);// best loot till house before previous
       for (int i =2 ;i<n;i++){
        int curr= Math.max(num[i]+prev2, prev1);// crr represent best loot till curent house 
        prev2 =prev1;
        prev1=curr;
        //If we rob house i, we add its money to prev2 (since last robbed house must be i-2).→ nums[i] + prev2
       //If we skip house i, then the best loot is just prev1
       //prev2 = best answer if we robbed till i-2 (needed if we want to rob current house)
       //prev1 = best answer if we robbed till i-1 (needed if we skip current house).
       }
       return prev1;
       //At the end of the loop, prev1 is holding the last computed dp[i], i.e., dp[n-1].
       //That’s exactly the maximum loot after considering all houses.
        
      }

}
