public class Memory {
    public static void main(String[] args) {
        // String literals are stored in the String pool (part of heap memory)
        String s = "hello";
        String x = "hello"; 
        // 's' and 'x' both point to the same "hello" object in the String pool
        x = "mello"; 
        // Now 'x' points to a new String "mello" in the String pool.
        // 's' still points to "hello". Strings are immutable, so "hello" remains unchanged.
        String str = "a";
        str += "b";
        // A new String "ab" is created.
        // 'str' now points to "ab". The original "a" remains unchanged because Strings are immutable.
        // s.charAt(0) = 'm';
        // This is NOT allowed in Java.
        // Strings are immutable; you cannot change characters inside a String.
        // Example of creating new string using methods
        String original = "world";
        String upper = original.toUpperCase();
        // 'toUpperCase()' does not modify the original string.
        // It creates a new String "WORLD".
       
      // Example of comparing strings
        String p = "hello";
        String q = new String("hello");
        System.out.println(p == q);       // false, because 'q' refers to a different object
        System.out.println(p.equals(q));  // true, because their values are the same
  
        // there is a mehtod to modify the string 
       s= s.substring(0,2)+"y"+s.substring(3);
       // now s  start pointing heylo
       

    }
}
