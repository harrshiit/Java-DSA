/*

QUEUE USING ARRAY (LINEAR QUEUE)
📌 What is a Queue?
A Queue is a LINEAR DATA STRUCTURE that follows
FIFO principle:
    First In → First Out
Real life example:
    - Line at a ticket counter
    - First person enters first, leaves first

WHY WE NEED TWO POINTERS?

A queue has TWO ENDS:
1️⃣ FRONT → removal happens from here
2️⃣ REAR  → insertion happens from here

If we track only ONE end (like only rear),
we lose the FIFO order.

So BOTH front and rear are mandatory.
*/

public class ArrayImplementation {

    /*
     CUSTOM QUEUE CLASS
    
    We are NOT using Java's built-in Queue.
    This is a CUSTOM DSA IMPLEMENTATION
    using ARRAY.
    */
    class QueueImplemented {

        /*
        -------------------------------------------
        DATA MEMBERS
        -------------------------------------------
        arr   → array to store queue elements
        size  → maximum capacity of queue
        front → index of FIRST element
        rear  → index of LAST element
        */

        int[] arr;
        int size;
        int front = 0;
        int rear = -1;

        /*
        -------------------------------------------
        CONSTRUCTOR
        -------------------------------------------
        - Array size is unknown at compile time
        - So we initialize it in constructor
        */
        QueueImplemented(int size) {
            this.size = size;
            arr = new int[size];
        }

        /*
        -------------------------------------------
        IS EMPTY?
        -------------------------------------------
        Queue is EMPTY when:
            rear < front

        Why?
        - rear starts at -1
        - front starts at 0
        - After removing all elements,
          front moves ahead of rear
        */
        public boolean isEmpty() {
            return rear < front;
        }

        /*
        -------------------------------------------
        IS FULL?
        -------------------------------------------
        Queue is FULL when:
            rear == size - 1

        Why?
        - Array index starts from 0
        - Last valid index = size - 1
        */
        public boolean isFull() {
            return rear == size - 1;
        }

        /*
        -------------------------------------------
        ENQUEUE (ADD)
        -------------------------------------------
        Steps:
        1️⃣ Check overflow (queue full?)
        2️⃣ Move rear forward
        3️⃣ Insert element at rear

        Time Complexity: O(1)
        */
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full (Overflow)");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        /*
        -------------------------------------------
        DEQUEUE (REMOVE)
        -------------------------------------------
        FIFO RULE:
        - Always remove from FRONT

        Steps:
        1️⃣ Check underflow (queue empty?)
        2️⃣ Store front element
        3️⃣ Move front forward

        Time Complexity: O(1)

        ⚠️ NOTE:
        We do NOT shift elements.
        That is why we need front pointer.
        */
        public int remove() {  
            // note here return type is int can either be void nut what if they ask which element has been remove 
            // if they directly call it not problem it will remove but if its return value store it in some variable then 
            // it will gonna tell which element has been removed 
            if (isEmpty()) {
                System.out.println("Queue is empty (Underflow)");
                return -1;
            }
            int removedElement = arr[front];
            front++;
            return removedElement;
        }

        /*
        -------------------------------------------
        PEEK
        -------------------------------------------
        - Returns front element
        - Does NOT remove it
        */
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
}
