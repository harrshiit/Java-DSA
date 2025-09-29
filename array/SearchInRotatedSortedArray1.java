public class SearchInRotatedSortedArray1 {
    // leetcode 33 
    // find the index of target element in rotated sorted  array

    public static int brut(int [] arr ,  int target ){
        // iterate over every element of array and find the target elemet 
        // Basic liner Search 
        // Time Complexity: O(n) - may need to scan all n elements
    // Space Complexity: O(1) - no extra space used apart from loop variable
        for( int i =0 ; i<arr.length;i++){
            if(arr[i]==target) return i;// return statement stops the loops 
        }
        return -1 ; // ifnot found 

    }

    public static int Optimal(  int[] arr , int target){
         // Time Complexity: O(log n) - array size halves each iteration
    // Space Complexity: O(1) - only a few variables used
     int left = 0 ;
     int right = arr.length-1;
     while(left<=right){
        int mid=(left+right)/2;
        if(arr[mid]== target) return mid ;
 // now doing this part for the elimination of part of array for furthur checking 
 // in rotated sorted array one part is fully sorted 

// check if left  half is sorted 
if(arr[left]<=arr[mid]){
    // check target lies in between or not 
    if( arr[left]<=target&&target<arr[mid]){
        // then here is the space we saerch for move right pointer before the mid 
        right=mid-1;// then we do the same step for checking 
    }
    else{// then move the left pointer for next zone checking 
        left = mid=1    ;
              }
}

// checkif right part is sorted 
else{
    // same check for target exist in this domain or not 
    if(arr[mid]<target&& target<=arr[right]) 
    //then specify only this domain to check by moving our left pointer 
  {  left = mid+1;}
  else{// change the domain for check 
    right=mid-1;  }

}
     }
 return -1 ;// if not found that target inedx 
    }
    
}
