import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {
// leetcode problem 26

public static int brut1( int [] arr){
    // Approach 1: Brute Force with ArrayList
// Logic: Keep an ArrayList and check if element exists before adding.
// Time Complexity: O(n^2), Space Complexity: O(n)
    ArrayList<Integer> list = new ArrayList<>();
    for(int num : arr){
        if(!list.contains(num))
        list.add(num);
    }
    for( int i=0 ; i<arr.length;i++){
        arr[i]=list.get(i);// modifying the original array 
    }
    return list.size();
}

public static int avg( int[] arr){
// Approach 2: Using HashSet (Extra Space)
// Logic: Insert all elements into a HashSet to remove duplicates.
// Time Complexity: O(n), Space Complexity: O(n)
HashSet<Integer> set = new HashSet<>();
for( int num : arr){
    set.add(num);// skip adding in set if any value is duplicate 
}
int index=0;
for ( int num : set){
    arr[index]=num;// here we are modifying the array 
    index++;
}
return set.size();
}

public static int optimal1 ( int[] arr){
    // Approach 2: Two-Pointer Optimal Solution
// Time Complexity: O(n)
// Space Complexity: O(1)
    if( arr.length==0) return 0 ;
    int i=0;
    for(int  j=1;j<arr.length;j++){
        if(arr[i]!=arr[j]){
            i++;// increase one point 
            arr[i]=arr[j];// palce that value of j at that point 
        }
    }
    return i+1;// i only increase that muich of time as much we get unique element  
}

    
}
