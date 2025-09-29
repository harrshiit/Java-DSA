 import java.util.*;

public class Twosum {

    public static int[] TwosumBrut( int[] arr , int target ){
        // brutforce approah O(n2) using two loops 
        
         for( int i =0 ; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==target)
                return new int[] {i,j};
            }
         }
         return new int[] {};// otherwise return empty array 
    }
    
    public static int [] TwosumAvg( int [] arr, int target ){
        // time complexicity O(n) and space complexicity O(1) 
        // optimal if we have to return index 
        HashMap<Integer,Integer>map = new HashMap<>();
        for( int i=0;i<arr.length;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[] {} ; // retuern empty array if not found 
    }

    public static int[] TwosumOptimal( int [] arr , int target){
        // here is we are using the two pointer approach 
        int[] sorted = arr.clone();// copy the array into anopther array in orfer the preserve the originsl index 
        Arrays.sort(sorted);// here we sort the array in ascending order 

        int left=0;
        int right=arr.length-1;
        int num1=-1;
        int num2=-1;
        while(left<right){
            int sum = sorted[left]+sorted[right];// we initilize the sum inside the loop because of we dont want to reinilize the sum value with zero after each loop  
            if(sum==target){
                num1=sorted[left];
                num2=sorted[right];
                break;
            }
            else if(sum<target)// means we have to increase the value and array is soted so we increse the left pointer 
            left++;
            else
            right--;
        }

        // now try to print the original indices of num1 and num2 

        int index1=-1;
       int  index2 =-1;
        for( int i=0; i<arr.length;i++){
            if(num1==arr[i]&&index1==-1)// here we compare with index1 becasue we only want to assign the index value one time only 
            index1=i;
            else if (num2==arr[i]&& index2==-1)
            index2=i;
        }
        return new int[]{ index1 , index2};


    }


}
