import java.util.*;
public class AddingElement{
   public static void hashmapmethod(){
    HashMap<String,Integer> map = new HashMap<>();
     // this is the syntax first one is key nad second is value string type is key 
     map.put("Harshit", 20);
     map.put("Vishu", 19);
     map.put("Harsh", 18);
     map.put("Vishesh", 17);
     System.out.println(map.get("Harshit"));//returns value on entering key 
     System.out.println(map.get("Rahul"));// returns null if value for a key does not exist
     map.put("Vishesh",20);//updates the value of Visshesh to 20
     System.out.println(map.remove("Harsh")); //removes the key if its is present and returns its value
     System.out.println(map.remove("Harsh"));// returns null 
     System.out.println(map.get("Harsh")); // returns null
     System.out.println(map.remove("Rahul"));// return null if key does not exist
     System.out.println(map.containsKey("Rahul"));//returns false because key not exist
     System.out.println(map.containsKey("Harsh"));//returns false because key has been removed
     System.out.println(map.containsKey("Vishesh"));//returns True 
    // Adding a new entry only if key does not exist
    if(!map.containsKey("Yash"))//means if  map not contaisns key 
     map.put("Yash", 30);// put value 
     // we can also use method like
     map.putIfAbsent("yashika", 28);// will put value because yashika doses not exist
     map.putIfAbsent("yashika", 28);// will not put any value 
     System.out.println("All the keys present in the map ");
     System.out.println(map.keySet());// follows no order 

     System.out.println("All the values are ");
     System.out.println(map.values());
     System.out.println("all the entries in the map is ");
     System.out.println(map.entrySet());
     //traversing the entries 
     for(String Keyy : map.keySet() ){
        System.out.printf("the age of %s is %d\n" , Keyy, map.get(Keyy));
     }
     System.out.println();
     // can also traverse by 
     for(var Keyy : map.keySet() ){
        System.out.printf("the age of %s is %d\n" , Keyy, map.get(Keyy));
     }
 System.out.println();
     // can also do by 
     for(HashMap.Entry<String, Integer> mp :map.entrySet()){
        System.out.printf("the age of %s is %d\n",mp.getKey(),mp.getValue() );
     }




   }
     public static void main(String[] args ){
        hashmapmethod();
     }
    
}

