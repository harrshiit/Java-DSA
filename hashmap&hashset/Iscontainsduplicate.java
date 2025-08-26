// # Given an integer array nums, return True if any value appears at least twice, else return False.  
// # Example 1: nums = [1,2,3,1] → True (1 appears twice)  
// # Example 2: nums = [1,2,3,4] → False (all distinct)  
// # Example 3: nums = [1,1,1,3,3,4,3,2,4,2] → True (duplicates exist) 

// // optimal approach using hashset takes O(n) 
import java.util.*;
public class Iscontainsduplicate {
    public static boolean containsduplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
             for (int num: nums ){
                if(set.contains(num))
                return true;
                else
                set.add(num);
             }
             return false;
            }
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the number of elements in array you want to create ");
                int size=sc.nextInt();
                int arr[]=new int[size];
                System.out.println("enter the elements in the array ");
                for(int i=0; i<size;i++){
                    arr[i]=sc.nextInt();
                }
                boolean result=containsduplicate(arr);
                System.out.println("Is your arrray contains duplicate "+result);
                sc.close();
            }
        }

   


//brutforce approach by using nested loops takes O(n2)
    // import java.util.*;
    // public class Iscontainsduplicate {
    //     public static boolean containsduplicate(int[] nums ){
    //         for( int i=0;i<nums.length;i++)//outer loop for trverse as well as pick each element
    //         { for(int j=i+1;j<nums.length;j++)// inner loop to compare with forward elements 
    //             {
    //             if(nums[j]==nums[i])
    //             return true;
    //          }
    //         }
    //         return false;
    //     }
    //     public static void main(String[] args) {
    //         Scanner sc=new Scanner(System.in);
    //         Scanner sc=new Scanner(System.in);
    //             System.out.println("enter the number of elements in array you want to create ");
    //             int size=sc.nextInt();
    //             int arr[]=new int[size];
    //             System.out.println("enter the elements in the array ");
    //             for(int i=0; i<size;i++){
    //                 arr[i]=sc.nextInt();
    //             }
    //             boolean result=containsduplicate(arr);
    //             System.out.println("Is your arrray contains duplicate "+result);
    //             sc.close();

    //     }
    
        //}
    

      
      
      
      
      
        // sorting approach using singlr loop takes O(nlogn)

    //     import java.util.*;
    //     public class Iscontainsduplicate{
    //         public static boolean containsduplicate(int[] nums){
    //             Arrays.sort(nums);
    //             for(int i=1; i<nums.length;i++){
    //                 if(nums[i]==nums[i-1])
    //                 return true;
    //             }
    //             return false;

    //         }
    //         public static void main(String[] args) {
    //                     Scanner sc=new Scanner(System.in);
    //                     System.out.println("enter the number of elements in array you want to create ");
    //                         int size=sc.nextInt();
    //                         int arr[]=new int[size];
    //                         System.out.println("enter the elements in the array ");
    //                         for(int i=0; i<size;i++){
    //                             arr[i]=sc.nextInt();
    //                         }
    //                         boolean result=containsduplicate(arr);
    //                         System.out.println("Is your arrray contains duplicate "+result);
    //                         sc.close();
    //     }
    // }



