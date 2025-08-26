import java.util.*;
public class PriorityQueueExample{
    // PriorityQueue is a min-heap by default in Java.
    // That means the smallest element is always at the head (top).
    //no need to write heapify logic no need Do swaps to maintain the heap property after each insert or delete.
    //t uses binary heap (array representation) under the hood.It auto-adjusts when you add/remove elements.It's optimized and production-ready.
   public static PriorityQueue<Integer>buildminheap(int[] arr){
    PriorityQueue<Integer> minheap=new PriorityQueue<>();
    for(int num:arr){
        minheap.add(num);
    }
    return minheap;
  }

  //Java’s PriorityQueue doesn't directly support max-heap, but you can flip the ordering using:
  public static PriorityQueue<Integer>buildmaxheap(int[] arr){
    PriorityQueue <Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
    for(int num:arr){
        maxheap.add(num);
    }
    return maxheap;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number seprated by spaces ");
    String input=sc.nextLine();
    String[] numbers=input.split(" ");
    int[] arr =new int[numbers.length];
    for(int i=0;i<numbers.length;i++){
        arr[i]=Integer.parseInt(numbers[i]);
    }
    System.out.println("min heap by priority queue is");
    System.out.println(buildminheap(arr));
    System.out.println("max heap by priority queue ");
    System.out.println(buildmaxheap(arr));
  sc.close();
  }
}