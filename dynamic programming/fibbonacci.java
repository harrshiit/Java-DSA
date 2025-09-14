
public class fibbonacci {

    public int fibRecursion(int n){
        // Time Complexity: O(2^n) -> exponential because it recomputes many values
        // Space Complexity: O(n) -> recursion stack depth
        if(n<=1) return n ;
        return fibRecursion(n-1)+fibRecursion(n-2);
    }


    public int fibMemo(int n ){
   // 2. Recursion + Memoization (Top-Down DP)
// Logic: Use an array (dp) to store already computed Fibonacci numbers.
// Time Complexity: O(n) -> each state computed once
// Space Complexity: O(n) -> recursion stack + memoization array
 int [] dp = new int[n+1];//need n+1 size of array to store value because we also have top store the data of 0 
 for( int i=0;i<=n;i++) {
    dp[i]=-1;// initially initilize array store value with -1 to keep track which have some value or which have not 
 }
 return fibHelper(n,dp);// call recursive helper function for memoization 

    }
    private int fibHelper(int n , int dp[]){
         if(n<=1) return n ;
         if(dp[n]!=-1) return dp[n];// if already computed then return that value
         dp[n]=fibHelper(n-1, dp)+fibHelper(n-2, dp);// if not present that value then find it 
         return dp[n];// return computed value of dp[n]

    }

    public int fibtabulation(int n){
     // 3. Tabulation (Bottom-Up DP)
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    if(n<=1) return n;
    int[] dp = new int[n+1];
    dp[0]=0;
    dp[1]=1;
    for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];

    }
    
    public int fibOptimized(  int n){
     // 4. Space Optimized DP
    // Time Complexity: O(n)
    // Space Complexity: O(1)
        int greaterfib=1;
        int smallerfib=0;
        int ans =0;
        for ( int i =2; i<=n;i++){
            ans=greaterfib+smallerfib;
            smallerfib=greaterfib;
            greaterfib=ans;
        }
        return ans ;
    }

}
