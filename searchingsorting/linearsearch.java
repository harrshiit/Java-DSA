import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of elements you want in the array:");
        Scanner sc = new Scanner(System.in);  // Create the Scanner object
        n = sc.nextInt();
        
        int[] a = new int[n];
        System.out.println("Enter the " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to search:");
        int key = sc.nextInt();

        boolean found = false; // To track if the key is found
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break; // Return only the first element if duplicates exist
            }
        }

        if (!found) {
            System.out.println("-1");
        }

        sc.close(); // Close the Scanner to prevent the "sc never close" error
    }
}
