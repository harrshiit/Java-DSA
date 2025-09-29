import java.util.*;
public class BuyandSellstock {
 
    public static int  maxprofitbrutforce( int prices[])
    // It takes time complexicy of O(n2) and space complexicity of o(1)
    
    {
         int maxdiff=0;
         for(int i=0;i<prices.length;i++){
            for( int j=i+1;j<prices.length;j++)//traverse whole  price array for each value of i and find find the 
            //max diffrence for preceding value to previous i value 
            {
           int diff=prices[j]-prices[i];
           maxdiff=Math.max(maxdiff,diff);
         }
      }
      return maxdiff;
    }
 
    public static int maxprofitintermediate(int[] prices){
    // it takes time complexity of O(n) and space complexicity of O(n)
    int n=prices.length;
    if(n==0) return 0;
    int [] premin = new int[n];// another array which goona store min cost value of an stock up to that array index
    premin[0]=prices[0];// because at zero min value of cp is that value only
    for(int i=1;i<n;i++){
        premin[i]=Math.min(premin[i-1],prices[i]);// updating premin array 
      }
  int maxprofit=0;
     for(int i=1;i<n;i++){
        int profit=prices[i]-premin[i-1];
        maxprofit=Math.max(maxprofit,profit);
     }
     return maxprofit;
    }

    
    
    public static int maxprofitoptimal(int[] prices ){
      // takes complexicity O(n) and space complexicity of O(1) because no extra space for new array
      int minprice=Integer.MAX_VALUE; // initialize the max value no idea about min value 
      int maxprofit=0;
      for(int temp:prices){
         minprice=Math.min(temp,minprice);
         int profit=temp-minprice;
         maxprofit=Math.max(maxprofit,profit);
      } 
      return maxprofit; 
    }

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of days  ");
      int n=sc.nextInt();
      int [] prices=new int[n];
      for(int i=0;i<n;i++){
         System.out.println("enter the prices of "+(i+1)+"  day  ");
         prices[i]=sc.nextInt();
      }
      System.out.println("fine your array will look like ");
      System.out.println(Arrays.toString(prices));
     // here we call the optimal function
      System.out.println("the max profit we can generate is  "+maxprofitoptimal(prices));
      sc.close();

    }
   }