import java.util.ArrayList;

public class Leetcode2095 {
    // delete midlle of node 
     public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val)
       { this.val = val; }
     ListNode(int val, ListNode next) 
     {  this.val = val; this.next = next;}
   }
 
   public static class solution {
    
    public static ListNode deleteMnodebrut( ListNode head){
        // two Passes of list 
        if(head==null||head.next==null) return null;// edge case if node or only one node exist 
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        for( int i=0;i<size/2-1;i++){
            // here we take temp variable one before the midlle to delete the target 
            temp=temp.next;} 
            temp.next=temp.next.next;//fill the data of that node to the next node 
            return head;
      }

      public static ListNode deleteMNodeAvg( ListNode head){
        // takes extra space 
        if(head==null||head.next==null) return null;
        ArrayList <ListNode> list = new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
        }
        int mid=list.size()/2;
        list.get(mid-1).next=list.get(mid).next;
        // here list has zero based indexing so for one before middle node is mid-1  ka next oneafter middle is mid.next 
      return head;
      }

      public static ListNode deleteNoptimal1(ListNode head){
        // here we use only two pointers 
         ListNode fast= head;
        ListNode slow= head;
        if( head==null|| head.next==null) return null;
        while(fast.next.next!=null&&fast.next.next.next!=null){
            // to slow slow at just one before the middle node 
            //temp.nrxt.next for even and temp.net.next.next for odd this will 
            slow =slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;

      }

      public static ListNode deleteNoptimal2(ListNode head){
        // here we use only two pointers 
        ListNode fast= head;
        ListNode slow= head;
        ListNode prev=null;

        if( head==null|| head.next==null) return null;
        while(fast!=null&&fast.next!=null){
            // this condition stops slow exactly at middle and fast one befire the slow node 
            prev=slow;
            slow =slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;

      }

} 
public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

public static void main(String[] args) {

    ListNode node5 = new ListNode(14);
ListNode node4 = new ListNode(13, node5);
ListNode node3 = new ListNode(12, node4);
ListNode node2 = new ListNode(11, node3);
ListNode head = new ListNode(10, node2);


    System.out.println(" the original list is :");
    printList(head);

    System.out.println(" updated list is ");
    ListNode updated=solution.deleteNoptimal1(head);
    printList(head);
}
}