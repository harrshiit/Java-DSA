
import java.util.*;
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of array seprated by space  ");
        String input=sc.nextLine();
        String[] numbers =input.trim().split(" ");
        int[] arr =new int[numbers.length];
        for(int i=0;i<numbers.length;i++)
        arr[i]=Integer.parseInt(numbers[i]);
        System.out.println("the product of the array except self is ");
        System.out.println(Arrays.toString(solutionoptimal2(arr)));
        sc.close();


        
    }
    

    public static int[] solutionbrut(int arr[]){
        // Time Complexity: O(n^2)
    // Space Complexity: O(1) excluding output array
        int result[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int product=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j)
                product*=arr[j];
            }
            result[i]=product;
        }
        return result;
    }
   
    public static int[] solutionavg(int[] arr){
        // Time Complexity: O(n) - one pass to calculate product and zero count, one to build result
    // Space Complexity: O(1) excluding output array
        // this method will gonna use divion technique which is also gives true  values while zeros in array 
        int product=1;
        int zerocount=0;
        int result[] =new int[arr.length];
        for (int nums : arr){
            // using this loop we find out the total product of element in the array with handling of zero exception 
             if(nums==0){
                zerocount++;
                continue;//  used here to skip the multiplication of zero in the product can also used else here 
            }
            product*=nums;
        }
       
        for(int i =0;i<arr.length;i++){
            if(zerocount>1)
            result[i]=0;// more than one zero means all the product is zero 
            else if(zerocount==1)
            result[i]=arr[i]==0?product:0;
            // this indicates Only the position where the zero  can hold the product of other elements
            //All other positions will be 0, because multiplying by the one zero in the array will make their product zero
            else// no zero just divide the product with that element 
            result[i]=product/arr[i];
          }
      return result;
    }
   
    public static int[] solutionoptimal1(int [] arr){
         // Approach 3: Prefix and Suffix Products (Optimal Approach)
    // Time Complexity: O(n) - three separate linear loops
    // Space Complexity: O(n) for prefix and suffix arrays
    int [] prefix=new int[arr.length];
    int[] suffix=new int[arr.length];
    int result[]=new int[arr.length];
    prefix[0]=1;
    for(int i=0;i<arr.length;i++)
    prefix[i]=prefix[i-1]*arr[i-1];
    suffix[arr.length-1]=1;// because nothing to the right of last index
    for(int i=arr.length-2;i>=0;i--)
    suffix[i]=suffix[i+1]*arr[i+1];

    //applying loop for multiplying prefix and suffix array 
     for (int i=0;i<arr.length;i++)
     result[i]=suffix[i]*prefix[i];

     return result ;
    }

    public static int[] solutionoptimal2(int[] arr ){
        //Approach 4: Optimized Prefix and Suffix in One Pass
        // Time Complexity: O(n) - two single loops
        // Space Complexity: O(1) (excluding output array)
        int[] result=new int[arr.length];
        // here we take result array only and try to multify both prefix and suffix value in the same array 
        result[0]=1;// because nothing in the left of zero index
        for(int i=1; i<arr.length;i++)
        result[i]=result[i-1]*arr[i-1];// now this holds the result of all left elements 
        int right =1;
        for(int i=arr.length-1;i>=0;i--)
       { result[i]*=right;
        right*=arr[i]; }
        
        return result;


    }
}
