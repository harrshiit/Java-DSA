import java.util.*;
public class HeapSort {
    private static ArrayList<Integer> heap = new ArrayList<>();

    // functio to build max heap by suing step down approach 
    public static void maxheap(int[] arr) {
        heap.clear(); // Clears the heap before inserting new elements to prevent duplication
        for (int num : arr) {
            heap.add(num);
        }
        int n = heap.size();
        
        //now start heapify from last non leaf node down root that is n/2-1
        for (int i = n / 2 - 1; i >= 0; i--) { // Fixed: changed i <= 0 to i >= 0
            heapify(i, n);
        }
    }

    // now building heapify fxn to build max heap property 
    private static void heapify(int index, int n) {
        while (true) { 
            int leftchild = 2 * index + 1;
            int rightchild = 2 * index + 2;
            int largest = index; // Assume current node is largest

            // Check if left child exists and is greater than current largest
            if (leftchild < n && heap.get(leftchild) > heap.get(largest)) {
                largest = leftchild;
            }
            // Check if right child exists and is greater than current largest
            if (rightchild < n && heap.get(rightchild) > heap.get(largest)) {
                largest = rightchild;
            }
            if (largest == index) break; // If no swaps needed, exit
            Collections.swap(heap, index, largest); // Swap largest with current index
            index = largest; // Move index to swapped position and continue heapifying
        }
    }

    public static void heapsortbrut() // it sort in decending order because it used max  heapify 
    {
        ArrayList<Integer> sortedlist = new ArrayList<>(); // new list to store sorted element we can also define array here 
        // but i have to store it dynamically thats also easy manupulation in heap like adding and removing 
        while (!heap.isEmpty()) // up to when the heap not gets empty 
        {
            sortedlist.add(heap.get(0)); //  another arraylist whhich store top index element which is in max size 
            heap.set(0, heap.get(heap.size() - 1)); // Replace top  root with last element
            heap.remove(heap.size() - 1); // now remove that element which pushed at the last 
            heapify(0, heap.size()); // restore heap properted because ut voileted from zero index
        }
        System.out.println("the heap sorted list in descending order is bacuse it uses brufforce approach  " + sortedlist);
    }

    // this will do in place heap sort 
    // Optimal in-place heap sort (modifies the original array)
    public static void heapsortOptimal(int[] arr) {
        maxheap(arr); // Ensures heap is rebuilt before sorting (fix for empty heap issue)
        int n = heap.size();
        
        for (int i = n - 1; i > 0; i--) { 
            Collections.swap(heap, 0, i); // Move max element (root) to the end position
            heapify(0, i); // Restore max heap property for the reduced heap
        }
        
        System.out.println("Sorted elements (Optimal Heap Sort): " + heap);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to build heap, separated by spaces:");
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        int[] arr = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }

        maxheap(arr); // Build max heap
        System.out.println("Heap elements: " + heap);
        
        heapsortbrut(); // Perform brute-force heap sort
        
        maxheap(arr); // Rebuild heap for optimal heap sort beacue heapsort fxn claers the heap 
        heapsortOptimal(arr); // Perform in-place heap sort
        
        sc.close();
    }
}
