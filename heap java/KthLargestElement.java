import java.util.*;

public class KthLargestElement {

    // 🔸 Approach 1: Brute Force using Sorting
    public static int kthLargestBrute(int[] arr, int k) {
        // Time Complexity: O(n log n) - due to sorting
        // Space Complexity: O(1) - in-place sorting for primitive array
        // NOTE: This method modifies the original array by sorting it.
        // That's why we pass arr.clone() when calling this method.
        // ❗ If you are calling this method first and not using the array later, you can avoid cloning.
        Arrays.sort(arr); // O(n log n)
        return arr[arr.length - k];
    }

    // 🔸 Approach 2: Max Heap storing all elements (Full Heap)
    public static int kthLargestHeapFull(int[] arr, int k) {
        // Time Complexity: O(n log n) - n insertions in heap of size n
        // Space Complexity: O(n) - all n elements stored in heap
        // NOTE: This method does NOT modify the input array.
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            maxHeap.add(num); // O(log n) for each add
        }

        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll(); // O(log n)
        }

        return maxHeap.peek();
    }

    // 🔸 Approach 3: Optimal Min Heap of size k
    public static int kthLargestOptimal(int[] arr, int k) {
        // Time Complexity: O(n log k) - maintaining a heap of size k
        // Space Complexity: O(k) - only k elements in heap at a time
        // NOTE: This method also does NOT modify the input array.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num); // O(log k)
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove smallest among k+1 elements
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements separated by space:");
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        if (k <= 0 || k > arr.length) {
            System.out.println("❌ Invalid k! Must be between 1 and " + arr.length);
        } else {
            // ✅ We use arr.clone() to prevent modifying the original array.
            // Especially important for the brute-force method which sorts the array in-place.
            // ❗ If you call brute method first and don't need the original later, you can avoid arr.clone().
            System.out.println(" Kth Largest using Sorting: " + kthLargestBrute(arr.clone(), k));
            System.out.println("Kth Largest using Max Heap (Full Heap): " + kthLargestHeapFull(arr.clone(), k));
            System.out.println("Kth Largest using Min Heap (Optimal): " + kthLargestOptimal(arr.clone(), k));
        }

        sc.close();  
    }
}
