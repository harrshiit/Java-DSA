import java.util.*;
public class SecondMax {

    public static int SecondMaxBrut( int[] arr){
         // Brute Force Approach
    // Time: O(n log n), Space: O(1) for sort O(nlogn) + for linear scan O(n)
        Arrays.sort(arr);
        int n = arr.length;
        for( int i=n-1-1;i>=0;i--){
         if(arr[i]!=arr[n-1]) // can also use here i+1;
         return arr[i];
         // here we are comparing the large last largest element with just before it in sorted array 
        }
        return -1 ;
    }

    public static int SecondMaxAvg( int[] arr){
          // Better Approach
    // Time: O(n), Space: O(1) need two loop pass O(n)+O(n)~ O(n)
        int firstmax=Integer.MIN_VALUE;
        for( int i=0; i<arr.length;i++){
            if(arr[i]>firstmax)
            firstmax=arr[i];// it skip also for equal condition because already stored largest value 
            //we finally get the first max with this loop
        }

        int SecondMax=Integer.MIN_VALUE;
        for( int num : arr)// same work as above loop 
        {
            if(num!=firstmax)//  skip the first max then compare 
            SecondMax=Math.max(num, SecondMax);
        }
        return (SecondMax == Integer.MIN_VALUE) ? -1 : SecondMax;

    }

    public static int SecondMaxOptimal( int[] arr){
        int firstmax= Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;
        for( int num : arr){
           if(num>firstmax){
            SecondMax= firstmax;
            firstmax=num; }
            else if (num>SecondMax&&num<firstmax){
                SecondMax = num;

            }
        }
        return (SecondMax == Integer.MIN_VALUE)?-1:SecondMax;
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println(" enter the no of elemnts you want to enter in array ");
    int n= sc.nextInt();
    
    System.out.println(" enter an arry elements ");
    int [] arr =new int [n];
    for( int i=0 ; i<n;i++){
        arr[i]= sc.nextInt();
    }
    int result = SecondMaxOptimal(arr);
    if(result==-1) System.out.println(" second max not found");
    else
    System.out.println(" the second max element is "+ result);
    sc.close();
    
 }

    
}
