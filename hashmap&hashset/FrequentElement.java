import java.util.*;
public class FrequentElement {
    public static void main(String[] args) {
        
    
    int[] arr={1,2,3,1,1,2,4,4,6,7,5,4,3,2,4,1,9};
    HashMap<Integer,Integer>freq=new HashMap<>();
    for(int el: arr){
        if(!freq.containsKey(el))// means if we see the key first time
        freq.put(el,1);//update the value of that elemrnt by 1 as its frequency
       else
    {
     freq.put( el, freq.get(el)+1);// if not the first time update its value as frequency by +1 
    }
}
    System.out.println("the frequency map values created is ");
    System.out.println(freq.entrySet());
    int maxfreq=0,anskey=-1;
    for(var e:freq.entrySet())
     {
        if(maxfreq<e.getValue())
          {
          maxfreq=e.getValue();
          anskey=e.getKey();
          }
     }
     System.out.printf("the key  %d is occuring %d times ",anskey,maxfreq);

     // can also done by the method
     System.out.println();
     for(var e:freq.keySet())
     {
        if(maxfreq<freq.get(e))
          {
          maxfreq=freq.get(e);
          anskey=e;
          }
     }
     System.out.printf("the key  %d is occuring %d times ",anskey,maxfreq);




    }
    
}
