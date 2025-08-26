import java.util.*;
public class KthSmallestElement {
    public static int kthsmallestbrut(int[] arr, int k){
        // takes time complexicity O(nlogn) and space complexicity O(1)
        Arrays.sort(arr);
        return arr[k-1];
      }

      public static int kthsmallestavg(int[] arr, int k ){
      // takes n+klogn complexicity n for building heap and klogn for poping k elements sapce O(n) 
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        for(int num: arr){
            minheap.add(num);// elements added and maintained min heap property due to using priority queue
        }
        for(int i=0;i<k-1;i++){
            minheap.poll();// remove the top min element of from the heap 
        }
        return minheap.peek();// return the top element which is the kth smallest number in the heap structure 
      }
    
      public static int kthsmallestoptimal(int [] arr, int k ){
        // takes nlogk complexity space O(k)
        //O(n) Heap operations per element	O(log k) (insert/remove root)
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
            for(int num: arr){
                // by this method we make max heap by adding all  elements
                // now iteratively removing top element top  elements up to k-1 times then the top elements become kth smallest element 
                maxheap.add(num);
                if(maxheap.size()>k)
                maxheap.poll();
            } 
             return maxheap.peek();// return the kth samllest element in  max heap     
         }

         public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter array element seprated byv space ");
            String[] input=sc.nextLine().split(" ");
            int[] arr=new int[input.length];
            for(int i=0;i<input.length;i++){
                arr[i]=Integer.parseInt(input[i]);
            }
            System.out.println("enter the value of k ");
            int k=sc.nextInt();
            if(k<=0||k>arr.length){
                System.out.println("enter valid number must be between 1 and "+arr.length);
            }
            System.out.println(k+"th smalllest number from the number entered "+ kthsmallestoptimal(arr, k));
            sc.close();
         }
}
