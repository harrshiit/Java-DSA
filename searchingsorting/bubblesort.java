import java.util.*;

public class bubblesort {
    public static void display(int[] a) {
        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x] + " ");
        }
        System.out.println();  // Print a newline after the array is displayed
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of elements you want in the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting:");
        display(arr);

        bubbleSort(arr);

        System.out.println("Array after sorting:");
        display(arr);

        sc.close();  // Close the scanner to avoid resource leak
    }
}
