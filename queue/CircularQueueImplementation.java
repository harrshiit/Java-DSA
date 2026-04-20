public class CircularQueueImplementation {
    // implementation of circular queue using array 
  private int front ;
  private int rear ;
  private int [] arr ;
  private int size ;//
  private int capacity ;
  CircularQueueImplementation(int capacity){// constructor 
    this.capacity = capacity;
    arr= new int[capacity];
    front =0 ;// as element add always start from 0th element so front pointer start from 0 will change on removing element
    rear =-1;
 }

 public void add( int value){
  if(size==arr.length) {System.out.println(" queue is full");
    return;
  }
  rear =(rear+1)%capacity;// modulo operator wrap the point from starting if it comes to end after 
  // checking the size queue is ful or not 
  arr[rear]= value;
  size++;
}

public int remove(){
  if(size==0){
    System.out.println("queue is empty ");
    return -1; }
int remove= arr[front]; // in queue remove is from front 
front = (front+1)%capacity;// increasing the front by 1 on removing element also do modulo to comes to first when comes to end 
size-- ;
return remove ;
}

public int peek(){
   if(size==0){
    System.out.println("queue is empty ");
    return -1; }
    return arr[front];
}

public void display(){
  if(size==0) {
    System.out.println(" queue is empty");
    return ;
  }
  for( int i = 0 ; i<size;i++){
    System.out.print(arr[(front+i)%capacity] + " "); // suppose if front at 3 index and have to traverse whole then we need to wrap after end of aray 
  }
  System.out.println();
}

    
}
