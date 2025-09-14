public class climbingStairs {
    //leetcode 70 

    public int recursion( int n ){
    // Idea: At each step, we can either climb 1 stair or 2 stairs.
     // Time Complexity: O(2^n) (exponential, because we recompute subproblems many times)
    // Space Complexity: O(n) (stack space due to recursion)
    if(n<=2) return n ; // for 1st stair 1 ways for 2nd stairs 2 ways (one plus one step &  direct 2 steps )
    return recursion(n-1)+recursion(n-2);// So, number of ways to reach n = ways(n-1) + ways(n-2).
    }
    

    public int recursionMemo( int n ){
    // Approach 2: Recursion + Memoization (Top-Down DP)
    // Time Complexity: O(n) (each state computed once)
    // Space Complexity: O(2n)~O(n) (for recursion stack + memo array)
    int [] dp = new int[n+1]; // n+1 size because If we create an array of size n, the last valid index will be n-1, so we cannot store the result for step n.
    // in java even when  we dont initilize array  any value it inilize it with 0
   return helper(n,dp);// call helper function which does the recusive process 
}
private int helper ( int n , int[] dp ){
    if(n<=2) return n ;// base case already explained why 
    // check if any value present or not  
    if(dp[n]!=0) return dp[n];
    //in Fibonacci we often initialize with -1: since fib(0) = 0 is a valid answer, using 0 as a “not computed” marker would cause confusion. 
    //But in Climbing Stairs, the result is never 0 for n ≥ 1, so the default 0 works fine as “not computed
   dp[n] = helper(n-1, dp)+helper(n-2, dp);
   return dp[n];
}

public int recursionTab(  int n ){
     // Approach 3: Tabulation (Bottom-Up DP)
     // Time Complexity: O(n) (we compute each dp[i] once)
    // Space Complexity: O(n) (dp array)
    if(n<=2) return n ;
    int [] dp = new int[n+1];
    // define the base cases 
    dp[1] = 1;
    dp[2]=2;
    // now filling the remaining value 
    for(int i =3;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
}

public int recursionTabOptimized( int n ){
    // Idea: To compute dp[i], we only need last two values.
    // So instead of storing full dp array, just keep two variables.
    // ---------------------------------------------------
    // Time Complexity: O(n) (loop from 3 to n)
    // Space Complexity: O(1) (only two variables)

    if(n<=2) return n ;
    int prev1=2;// no of ways for 2nd step 
    int prev2=1;// no of ways for 
    int ans =0 ;
    for( int i=3 ; i<=n;i++){
        ans = prev1 +prev2;
        prev2= ans ;
        prev1 =  prev2;
    }
    return ans ;
}
}