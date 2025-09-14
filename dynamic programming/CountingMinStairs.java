import java.util.*;
public class CountingMinStairs {
 //leetcode 746
 // Problem: You are given an integer array cost where cost[i] is the cost of i-th step.
// Once you pay the cost, you can climb one or two steps.
// You can either start from step 0 or step 1.
// Return the minimum cost to reach the top of the floor.

public int recursion( int[] cost ){
    // Time Complexity: O(2^n) (exponential, because we try all paths)
// Space Complexity: O(n) (recursion stack)
 // main function 
    int n = cost.length;// in order to calculate the last step where we have toreach 
    return Math.min(helper(cost,n-1)),helper(cost,n-2));
    //choice for where to start to reach n step we have to either take step from n-1 or n-2 
    // so 0 or 1 step in case of starting 
    }

    private int helper(int[] cost , int i ){
        //helper function 
        // here i denotes the index of current step 
        if(i<0) return 0 ; // base case if step is not start 
        if(i==0|| i==1) return cost[i];// base case return the cost of 1st or 2nd step if they are on it or start from it 
        return cost[i]+Math.min(helper(cost, i-1), helper(cost, i-2));
        //cost of ith step is cost of that step cost[i] and min cost way to reach there 
    }

    public int dpMemoization(  int [] cost){
        int n= cost.length;
        int dp[] = new int[n];//The cost array has n steps, indexed from 0 to n-1.
        // due to help of it we store the value so that we need not to do recursive calls for already find value 
        Arrays.fill(dp,-1);// initize with -1 because by default it inilizde with 0 and may be zero can be the cost of any step
        // so for the safer size we do it 
        return Math.min(helper2(cost, n-1,dp), helper2(cost,n-2,dp));
          }

          private int helper2( int[] cost , int i , int[] dp){
            if(i<0) return 0  ;
            if(i==0|| i==1) return cost[i];
            if(dp[i]!=-1) return dp[i]; // means already computed need not to compute dp[i] in further step 
            dp[i]= cost[i]+Math.min(helper2(cost, i-1,dp), helper2(cost, i-2, dp));
            return dp[i];

          }


        public int dpTabulation( int [] cost ){
            // bottom up approach
            // Time Complexity: O(n)
            // Space Complexity: O(n)
            int n =  cost.length;
            int dp[]= new int[n];
            dp[0]= cost[0];// storing the base case 
            dp[1]= cost[1];

            for( int i=2;i<n;i++){
                dp[i]=cost[i]+Math.min(dp[i-1], dp[i-2]);
            }
            return Math.min(dp[n-1], dp[n-2]);
             }

             public int dpOptimal( int[] cost ){
                // here we use only last two steps cost stored valur to identify min cost to last step 
                int n = cost.length;
                int first =cost[0];// min  cost for first step 
                int second = cost [1];// min cost for second step 
                for ( int i=2 ; i<n;i++){
                  int current =cost[i]+Math.min(first , second );// calculation the cost for current step
                  first = second;
                  second = current; 
                }
                 return Math.min( first , second);

             }



    
}
