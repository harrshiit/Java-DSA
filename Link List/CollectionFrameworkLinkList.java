import java.util.*;


public class CollectionFrameworkLinkList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList< String>();
        ll.addFirst("a");
        ll.addFirst("is");
        System.out.println(ll);// show all inside the list
        ll.addFirst("this ");
        ll.add("Link list ");// add in the last 
        System.out.println(ll);
        System.out.println(" the size of link list is "+ll.size());

        // printing of linklist in own way
        for( int i=0;i<ll.size();i++){
        System.out.print(ll.get(i)+"-->");}
        System.out.println("null");
        ll.remove(3);
        System.out.println(ll);
        
    }
    
    
}
