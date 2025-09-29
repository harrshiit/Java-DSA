import java.util.*;

class chocolatedistribution{
    public static int findmindiff(int[] arr , int n , int m){
        if(m==0||n==0) return 0;
        if(m>n) return -1;
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
        int diff = (arr[i+m-1]-arr[i]);
        mindiff=Math.min(mindiff, diff);
        }
        return mindiff;
    }
    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3; // Number of students
        int n = arr.length;
        System.out.println("Minimum difference: " +findmindiff(arr, n, m));
        
    }
}



// more optimized solution using two pointers method but both method takes O(nlogn) complexicity in worst case 
//method 2nd eliminates the extra loops during iteration 

// import java.util.Arrays;

// public class ChocolateTwoPointers {
//     static int findMinDifference(int arr[], int n, int m) {
//         if (m == 0 || n == 0) return 0;
//         if (m > n) return -1;  // Not enough packets

//         Arrays.sort(arr);

//         int minDiff = Integer.MAX_VALUE;
//         int i = 0, j = m - 1;

//         while (j < n) {
//             minDiff = Math.min(minDiff, arr[j] - arr[i]);
//             i++;
//             j++;
//         }

//         return minDiff;
//     }

//     public static void main(String[] args) {
//         int arr[] = {7, 3, 2, 4, 9, 12, 56};
//         int m = 3;
//         int n = arr.length;
//         System.out.println("Minimum difference: " + findMinDifference(arr, n, m));
//     }
// }



