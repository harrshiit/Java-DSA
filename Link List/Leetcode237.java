public class Leetcode237 {
    //Delete Node in a Linked List here we have only node as a parameter and we have no data given 
    // means we cannt access sthe other dadta to tracerse list and all 
    
    // creating the node data type 
    public static  class ListNode// need to apply static keyword directly from main to craete any new object otherwise give compilation error 
    {
        int value;// data
        ListNode next;
        ListNode( int x){
            this.value=x;
        }
    }
    public static class solution{
        // creating method 
        public  static void deleteNode(ListNode node)// passing node as a parameter of node type 
        {node.value=node.next.value;
            node.next=node.next.next;
            // here we take the exception that the deleting node is not last node 
        }
    }

    public static void printlist(ListNode head){
        ListNode temp = head;
        while (temp!= null) {
            System.out.print(temp.value+"-->");
            temp=temp.next;
             }
             System.out.print(" null");
             System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next= new ListNode(10);
        head.next.next= new ListNode(11);
        head.next.next.next = new ListNode(12);
        System.out.println(" the original list is ");
        printlist(head);
        solution.deleteNode(head.next.next);
        printlist(head);
    }
    
}
