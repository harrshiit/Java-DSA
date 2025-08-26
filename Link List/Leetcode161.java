public class Leetcode161 {
    // we have to find common or intersectioin node when two linked joined or become common after a node 
    // premium question of leetcode 
    public static class ListNode{
        int data;
        ListNode next;
        ListNode( int x ){
            this.data=x;
            this.next=null;
        }
    }

     public class solution {
        public static ListNode getIntersectionNode( ListNode headA, ListNode headB){
            ListNode tempA= headA;// assigning both temp pointer for both linklist 
            ListNode tempB= headB;
            int sizeA=0;
            while (tempA!=null){
                sizeA++;
                tempA=tempA.next;
            }
            tempA=headA;// after calcualating the size reassign the temp pointer at head
            // now calculate the size of 2nd linklist 
            int sizeB=0;
            while( tempB!=null){
                sizeB++;
                tempB=tempB.next;
            }
            tempB=headB;
             
            if(sizeA>sizeB){
                int diff = sizeA-sizeB;
                for( int i=1;i<=diff;i++) tempA=tempA.next;// forward the temp A ahead to equate the length up to end with b 
                 }
                 else{
                    int diff=sizeB-sizeA;
                    for( int i=1;i<=diff;i++) tempB=tempB.next; }

                    // now both pointer tempa and tempb is at equal distance from the end of lisnklistnode
                    // now we have to find that common node where they intersect and follow the common node up to end 
                    while(tempA!=tempB){
                        tempA=tempA.next;
                        tempB=tempB.next;
                    } 
                    return tempA;// return any out of tempA or tempB both contain the same intersection node 
        }
     
        
     }
      public static void main(String[] args) {
        // Create first list: 1 -> 2 -> 3
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);

        // Create second list: 9 -> 6
        ListNode headB = new ListNode(9);
        headB.next = new ListNode(6);

        // Create common part: 7 -> 8 -> 10
        ListNode common = new ListNode(7);
        common.next = new ListNode(8);
        common.next.next = new ListNode(10);

        // Attach common part to both lists
        headA.next.next.next = common; // List A: 1 -> 2 -> 3 -> 7 -> 8 -> 10
        headB.next.next = common;     // List B: 9 -> 6 -> 7 -> 8 -> 10

        // Find intersection node
        ListNode result = solution.getIntersectionNode(headA, headB);

        // Print result
        if (result != null) {
            System.out.println("Intersection Node Data: " + result.data);
        } else {
            System.out.println("No intersection node found.");
        }
    }
    
}
