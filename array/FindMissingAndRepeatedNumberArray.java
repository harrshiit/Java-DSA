import java.util.*;

public class FindMissingAndRepeatedNumberArray {
    public static void main(String[] args) {
        System.out.println("enter the number for  array form 1 to n  seprated by spaces ");

        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split(" ");// read entire line of input without using loop
        //split the string and save on the basis of space 
        int[] arr=new int[input.length];
        for(int i=0;i<input.length;i++){
            arr[i]=Integer.parseInt(input[i]);// for converting into string to integer 
        }
         System.out.println("You entered");
         System.out.println(Arrays.toString(arr));
         System.out.println(" the array of reapeating and missing no is ");
         System.out.println(Arrays.toString(Solution.solution3(arr)));



        
    }
 

 }  

 class Solution{
    public static int[] solution1(int[] arr)
    //it takes comxicity of O(n2) two loops are used
    {
        int repeatingno=-1 , missingno=-1;
        for(int i=1;i<=arr.length;i++)
           {
            int count =0;
            for(int j=0;j<arr.length;j++)
               {if(arr[j]==i)
                 count++; }
                 if(count==2)
                  repeatingno=i;
                if(count==0)
                 missingno=i;
                 if(repeatingno!=-1&&missingno!=-1)
                  // to avoid extra comparision of loop  if both  found 
                  break;
             }
             return new int[]{repeatingno,missingno};
    }
    
    public static int[] solution2(int[] arr)
    // this method use hashing approach to solve takes O(n) in worst case takes O(2n) 
    //compxixity but takes extra space due to extra hash aarray so space compl. becomes O(n)
    {  int repeatingno=-1,missingno=-1;
        int n=arr.length;
        int[] hash=new int[n+1];// we create hash arry to store the frequency of element 
        for(int index:arr) // while traversing the arr array increate the frequency of hash index acoording to the element value to that index which was initailly zero  
            hash[index]++;
          for(int i=0; i<n+1;i++)//no need to check for zero index because no element of zero in arr array 
          {
             if(hash[i]==2)// that index store value 2 means repeating no.
              repeatingno=i;
            if(hash[i]==0)
              missingno=i;
            }
            return new int[]{repeatingno,missingno};
    }

public static int[] solution3(int[] arr ){
// this one is optimal approach where it takes complexicity of O(n) and space com. of O(1)
int n=arr.length;
int S=0;//gonna store sum of orginal array element 
long S2=0;//gonna store sum of square of original element 
for(int value:arr)// traversing element of whole array
{ S+=value;// S=S+value
  S2+=(long)value*value;//  long, we ensure that value * value is computed in long precision before multiplication happens.
  }
int Sn=(n*(n+1))/2;// sum of first n natural number 
long  Sn2=(long)(n*(n+1)*(2*n+1))/6;
int diff1=S-Sn;//give x-y where x is repaeting no and y is missing number 
long diff2=S2-Sn2;//gives x2 - y2 which is equal to (x+y) and (x-y)
// to find x+y divide diff2/diff1( which is (x+y)(x-y)/(x-y)  )
long sumxy=diff2/diff1; // gives x+y
int x=(int)((diff1+sumxy)/2);// repeating number
int y=(int)sumxy-x;//missing number
return new int[]{x,y};
 }

 
 public ArrayList<Integer> solution4(final List<Integer> A) {
  // use arraylist to use this method to call from main we need to change the return type of main function call 
        int n = A.size();
        
        // Step 1: Calculate S and S2 from the given array
        long S = 0, S2 = 0;  // Sum and Sum of Squares
        for (int num : A) {
            S += num;
            S2 += (long) num * num;
        }

        // Step 2: Calculate expected Sn and S2n
        long Sn = (long) n * (n + 1) / 2;  // Expected sum of first N natural numbers
        long S2n = (long) n * (n + 1) * (2 * n + 1) / 6;  // Expected sum of squares

        // Step 3: Compute equations
        long diff1 = S - Sn;  // (X - Y) => Difference between sum of elements and expected sum
        long diff2 = S2 - S2n;  // (X^2 - Y^2) => Difference between sum of squares

        // Step 4: Solve for X and Y using equations
        long sumXY = diff2 / diff1; // (X + Y)

        long X = (diff1 + sumXY) / 2;  // Repeating Number
        long Y = sumXY - X;  // Missing Number

        // Step 5: Return result as an ArrayList
        return new ArrayList<>(Arrays.asList((int) X, (int) Y));
    }

public static int[] solution5



}
 
    
 

 
