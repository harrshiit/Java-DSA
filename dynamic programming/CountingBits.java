public class CountingBits {
    //leetcode 338 

    public int[] brut( int n ){
        // Approach 1: Brute Force using built-in bit count
    // For each number from 0 to n, we count bits one by one.
    // Time Complexity: O(n * log(n)) because counting bits for each number takes log(num).
    // Space Complexity: O(1) extra, but O(n) for the result array.
    int [] ans = new int[n+1];
    for( int i=0 ; i<=n;i++){
        ans[i]=countSetBits(i);// call another function to count the set bits  
    }
    return ans;// return ans array 
         
    }
    private int countSetBits(int i){
        int count=0;
        while(i>0)// performing it i bececome zero thats how we can count the no of ones or set bit in binary representation of ecah number 
        { count= count+(i&1);// and of last bit if 1 its gives one 
            i=i>>1;// now doing right shift of bits of 1 by 1 also =i/2;

        }
        return count;// now this returns total no of ones in the bits of i 
    }

    public int[] countbitsdp(int n ){
        // here a logic works if a number n is even then its binary set bits equal to n/2
        // if that number is odd then no of set bits are equal to n/2+1 
        int [] dp  = new int[n+1];// aray created to store the setbita of number whicbh will utilize furthur 
        dp[0]=0;// base case for zero setbits value 
        for(int i=1 ; i<=n;i++){
            dp[i]= dp[i>>1]+i&1;// here i>>1 denotes i/2 and i&1 values 1if i is odd and values 0 if i is even 
        }
        return dp;
        
    }


    public int[] countbitsdp2( int n){
      // Approach 3: DP using Last Set Bit (Brian Kernighan’s idea)
     // Time Complexity: O(n)
    // Space Complexity: O(n)

    int [] dp = new int[n+1];
    dp[0] = 0;
    for( int i =0 ; i<=n;i++){
        dp[i] = dp[i&(i-1)]+1;// here logic works here in order to remove the last set bit from n we do n&n-1 it remove the last set bit from n 
        // so no of set bits in n is equal no of set bits of  ---> n&n-1 + 1 
    }
    return dp ;
    }

    public int[] countsetbits3( int n ){
    // Approach 4: DP using Even/Odd Pattern same logic of approach 2 
      // Time Complexity: O(n)
      // Space Complexity: O(n)
      int[] dp = new int[n+1];
       dp[0] = 0 ;
       for( int i=0 ;i<n+1;i++){
        if(i%2==0){// check if it is even 
            dp[i] =dp[i/2]; // or i>>1
        }
        else{
            dp[i]=dp[i/2]+1;//or dp[i-1]+1
        }
       }
       return dp;
    } 
    
}
