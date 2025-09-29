import java.util.*;

public class MajorityElement {

    public static int brut( int[] arr){
         // 1. Brute Force Approach
        // Time Complexity: O(n^2), Space Complexity: O(1)
        int n = arr.length;
        for(int i=0 ; i<arr.length ; i++){
            int freq=0;
            for( int j=0 ; j<arr.length;j++){
                if(arr[j]==arr[i])
                 freq++;
               }
               if(freq>n/2) return arr[i];
        }
        return -1 ;// if no element of frequency greater than n/2 is found 
    }

    public static int avg( int [] arr ){
         // 2. HashMap / Frequency Count Approach
    // Time Complexity: O(n), Space Complexity: O(n)

        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for( int num : arr){
            if(map.containsKey(num))
            map.put(num,map.get(num)+1);// if num already exists, increment its count
            else
            map.put(num,1);// first time occur 
            if(map.get(num)>n/2) return num ;
        }
        return -1 ;

    }

      // 3. Sorting Approach
    // Time Complexity: O(n log n), Space Complexity: O(1)
    public static int majorityBySorting(int[] nums) {
        Arrays.sort(nums); // sort the array
        return nums[nums.length / 2]; // middle element is majority if exists
    }

    public static int optimal( int[] arr){
        int count =0;
        int ans =-1 ;
        int n = arr.length;
       
        for(int num : arr){
            if (count==0){ 
              ans=num ;
              count =1;}
              else if (num==ans)
              count++;
              else count--;
           }
  // now verify if mention in question it exist then do only above code 
  //let suppose if all element distinct element it treat the last element as most frequency so need to do this step 

  count =0 ; // reinitilize the count variable  
  for (int num : arr){
    if( num==ans) count ++;

  }
  return count>n/2 ? ans : -1;

    }
     
}
