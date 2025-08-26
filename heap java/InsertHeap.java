import java.util.*;
public class InsertHeap {
 private ArrayList<Integer> heap;// make heap public beacsue of creating flexibility of heap 
public InsertHeap()// here we are creating a constructor it is same of the class name 
{
    heap=new ArrayList<>();
}

public void insert(int value){
    heap.add(value);//method to add value in arraylist 
    int index=heap.size()-1;//heap.size fxn gives length of arraylist and index is starting with zero 
    int parent=(index-1)/2;//parent of any node is (indexno-1/2)
    while(index>0&&heap.get(parent)<heap.get(index)){
        // now we swap the index with parent because it is greater than parent value
        int temp=heap.get(parent);
        heap.set(parent,heap.get(index));//set the parent value as of index value
        heap.set(index,temp);// set the index value as of temp value 
        index=parent;// now set the index as as parent to check it also 
        parent= (index-1)/2;// set the new parent of new index 
    }
}
    public void remove(){
        // here we generally talking about to remove the top node in case of removing node of heap  
        if(heap.isEmpty()){
        System.out.println("contains null");
        return;}
        if(heap.size()==1)
         heap.remove(0);
        int maxvalue=heap.get(0);//store the max value in a variable which is at the top of heap
        heap.set(0,heap.get(heap.size()-1));// here we swap the top node with last node then remove the last node 
         heap.remove(heap.size()-1);
         // now its tym to fix the top node to its correct place so 
         // this process is called heapify down 
         int index=0;
         int size=heap.size();
           while(true){
            int leftchild=2*index+1;
            int rightchild=2*index+2;
            int largest=index;
            if(leftchild<size&&heap.get(leftchild)>heap.get(largest))
            largest=leftchild;
            //generally largest should be on top so firstly that top node compare
            //compare it with its both child and palce according to its right position 
            if(rightchild<size&&heap.get(rightchild)>heap.get(largest))
            largest=rightchild;
            if(largest==index)
            break;// means here it will not perform below swap operation 
         // after getting the largest value we will positon it on the top index 

         // now performing swap operation 
         int temp=heap.get(index);//store index value at any variable 
         heap.set(index,heap.get(largest));//replace the index with the largest number which we got inn above procedure
         heap.set(largest,temp);//add temp value to the largest
         index=largest;// now point the index to that temp value to comapare same for this node also 
                  }
         System.out.println(maxvalue+" sucessfully removed ");
                }
    public void print(){
        System.out.println("heap elements are "+ heap);
        }

public static void main(String[] args) {
    InsertHeap hp=new InsertHeap();// we have to create it object we doset define the heap funnction staticly because of we can create multiple heap 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number seprate by spaces and press enter ");
    String input =sc.nextLine();//take full line as input 
    String[] numbers=input.split(" ");//take input seprate by spaces 
    for(String num:numbers){
        try{
            int value=Integer.parseInt(num);// coverting each number string to integer format 
            hp.insert(value);
        }
        catch(NumberFormatException e){
            System.out.println("invalid input "+num+" skipping");
        }
    }
    hp.print();
    // now performing the remove function 
    System.out.println("do you want to remove the top element ");
    String response=sc.nextLine().trim().toLowerCase();// to trim is used to trim extra space while entering extra space 
    // to lowerase to conver the input in lowercase 
    if(response.equals("yes")){
        hp.remove();
        hp.print();
    }
    else if (response.equals("no"))
    System.out.println("ok no element were removed ");
    else
    System.out.println("invalid input");
   
    System.out.println("the final state of heap is ");
    hp.print();
    sc.close();
}
     

}