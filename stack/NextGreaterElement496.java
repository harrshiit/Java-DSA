package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement496 {

    public static int[] brutArray( int[] nums1 , int[] nums2){
        /*Time	O(n × m)
            Space	O(1) */
        int[] result = new int[nums1.length]; // nums 1 is subsetof nums2 we have to return updated nums1 
         
        for(int i=0 ; i<nums1.length;i++){
            int value = nums1[i];
            int index = -1; // this showsindex not found yet -1 will not be any valid index also we we lonely declare it it takes default value zero 
        // also we cant directly initilze and put some value becuse we want it global
           for( int j=0 ; j<nums2.length;j++ ){ // now finding the  value of nums1 in nums2 look for its index in nums2
             if(value==nums2[j]){
                index=j ; // update index value 
                break ; // if we finded break that loop not traversing after that 
             }
           }

            int nextgraeter = -1 ; // now looking for next graeter in next loop 
            // we initialize with -1 because if no such number  exist which is graeter than that element  we place -1 in updated array 
            for( int j= index+1 ; j<nums2.length ; j++){ // here loop for check next graeter number to that number which is at indexin nums2 array 
              if(num2[j]>value){
                nextgraeter=nums2[j];
                break; // next checking for next becuse  of only want to store adjacent greater only 
              }
            }
            result[i] = nextgraeter;
       }
       return result ;
            }

            public static int[] avgHashmap( int [] num1 , int[] num2){

                /*Time	O(n + m²) worst  
                       Space	O(m) */

                int[] result = new int[num1.length];
                Map<Integer,Integer> indexmap = new HashMap<>();
                for( int i =0 ;i<num2.length ; i++){
                    indexmap.put(num2[i] , i);
                }
                for(int i = 0 ; i<num1.length ; i++){
                
                    int startindex =  indexmap.get(num1[i]);
                    int nextgreater = -1 ; 
                     for( int j  = startindex+1 ; j<num2.length ;j++){
                        if(num1[i]<num2[j]){ nextgreater = num2[j];
                            break;
                        }
                     }

                     result[i] = nextgreater ; // now storing in new array 
                }
                return result ;

           }

           public static int[] optimal(int num1[] , int num2[]){
 /*Time Complexity:O(n + m) = O(n)
Space Complexity: O(n)
Each element is pushed and popped from the stack only once
, and HashMap provides O(1) lookup for nums1, making the overall solution linear.

 */

            /*The stack helps compute the next greater element efficiently, but a HashMap is required to store the
             result so that we can answer queries for nums1 in O(1) time by value, without rescanning nums2 */
             HashMap<Integer , Integer> map = new HashMap<>();
             Stack<Integer> st = new Stack<>();
             // now traversing the num 2 
             for(  int num : num2){
                 // While stack is not empty and current number
            // is greater than stack top
            while (!st.isEmpty()&&num>st.peek()) {
                map.put(st.pop(), num) ; // if the top element of stack is smaller then num then pop it and map the elemnt with its next greater element 
            }
              st.push(num);
             }
             //  for Remaining elements have no next greater element
         
        while(!st.isEmpty()){
            map.put(st.pop() , -1 ) ; // if no such next greater element exist for a element then map it with -1 
        }
    // now build the result array 
      int[] result =new int[num1.length] ;
      for(int i = 0 ;  i<num1.length  ; i++){
        result[i] = map.get(num1[i]);
        }

        return result ; 
           }



    
}
