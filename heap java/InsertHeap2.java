import java.util.*;

public class InsertHeap2 {
    // this is step down aprroach takes O(n) compexicity 
    //  Step-Up Approach initializes an empty heap and adds elements one by one. takes O(nlogn)
    //✅ Step-Down Approach initializes the heap all at once from an existing array
    //.Step-Down is more efficient for sorting, batch processing, and quick heap initialization.
    
    private static ArrayList<Integer> heap = new ArrayList<>(); // if dont use static here we need to craete the object of class in main to call other statich fxn whre the heap is used

    public static void buildheap(int[] arr) { // giving bulk input of arrya to build heap
        for (int num : arr) {
            heap.add(num);
        }
        int n = heap.size();
        // now start heapify 
        for (int i = n / 2 - 1; i >= 0; i--) // Start heapifying from the last non-leaf node (n/2 - 1) down to the root
        { 
            heapify(i, n);
        }
    }

    private static void heapify(int index, int n) { // Extracted heapify logic into separate method
        while (true) // It means that the loop will keep running indefinitely unless explicitly broken using a break statement.
        { 
            int leftchild = 2 * index + 1;
            int rightchild = 2 * index + 2;
            int largest = index; // assume current node is the larges one 

            // Check if left child exists and is greater than current largest
            if (leftchild < n && heap.get(leftchild) > heap.get(largest)) {
                largest = leftchild;
            }
            // Check if right child exists and is greater than current largest
            if (rightchild < n && heap.get(rightchild) > heap.get(largest)) {
                largest = rightchild;
            }
            if (largest == index) break;
            Collections.swap(heap, index, largest); // inbuilt arraylist fxn to swap 
            index = largest; // Move index to swapped position and continue heapifying
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to built heap seprate by spaces");
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        int[] arr = new int[numbers.length]; // initialize array of integer
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }

        buildheap(arr);
        System.out.println("heap elements are " + heap);

        sc.close(); // Closed Scanner to prevent resource leaks
    }
}
