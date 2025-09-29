public class SerchInRotatedSortedArray2 {
    // LeetCode 81: Search in Rotated Sorted Array II (Duplicates allowed)
// Multiple approaches with detailed comments and complexities

// Approach 1: Brute Force (Linear Search)
 // Time Complexity: O(n) - may need to scan all n elements
    // Space Complexity: O(1) - no extra space used apart from loop variables

public static boolean brut1( int[] arr , int target  ){
    for( int i=0 ; i<arr.length;i++){
        if(arr[i]==target) return true;
    }
    return false  ;
}

public static boolean Optimal( int[] arr , int target ){
    //we applied modified boolean search here 
    int left =0 ; 
    int right=arr.length-1;
    while (left<=right) {
    int mid =(left+right)/2;
    if(arr[mid]== target) return true;

     // Handle duplicates: if left, mid, and right are equal, shrink bounds
     if(arr[left]==arr(mid)&&arr[mid]==arr[right]) {
        // here we are contracting the bounds 
        left++;
        right--;
     }
     else if ( arr[left]<=arr[mid]){
        // means left part is sorted 
        if(arr[left]<=target&&target<arr[right]){
         // means target exist is left part of array so set right pointer to that point
         right = mid -1 ;
        }
        else{
            // serarch in right half 
            left = mid+1;
        }
     }

     else{
        // check if right part is sorted 
        if( arr[mid]< target && target<= arr[right]){
            left = mid +1 ;
        }
        else {
            right =  mid -1 ;
        }

     }
      return false ;

}
}
    
}
