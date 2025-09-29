import java.util.*;
public class searchInRotatedSortedArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target , n;
        System.out.println("enter the no of element of array u want to create");
        n=sc.nextInt();
        int[] arr = new  int[n];

        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            System.out.println("enter the" +i+"th element" );
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("here the array are ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

      System.out.println("enter the search target element");
      target=sc.nextInt();
      System.out.println("the target element present in this Rotated sorted array at the index is ");
      System.out.println(Solution.search(arr,target));
        
    }
}

class Solution
    {
       public static int search(int[] arr, int target){
        int start=0 , end=arr.length-1;
       
       while(start<=end){
        int  mid=(start+end)/2;
        if(target==arr[mid])
             return mid;
          if(arr[start]<=arr[mid])
          {//means left side of element is sorted because rotated sorted element have property 
            //that its one  side of element is sorted we start do binary search in left segment of array 
             if(arr[start]<=target && arr[mid]>=target)
               end = mid-1;
               else
               start=mid+1; 
            
               }

            else // right segment of array is sorted
          { if(arr[mid]<target&&target<=arr[end])
            start=mid+1;
            else
            end=mid-1;}
        }
    
    return -1; // while condition not fulfill target not found after all checks and conditions 
}
}


