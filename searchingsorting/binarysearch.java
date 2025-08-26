import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array you want to create:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Corrected here
        }
        
        System.out.println("Enter the element you want to search:");
        int key = sc.nextInt();
        
        int start = 0, end = n - 1;
        boolean found = false;  // Flag to check if the element is found
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (key == arr[mid]) {  // Compare with arr[mid]
                System.out.println("Element found at index " + mid);
                found = true;  // Mark as found
                break;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        if (!found) {  // If not found, print the message
            System.out.println("Element not found in the array");
        }
    }
}
