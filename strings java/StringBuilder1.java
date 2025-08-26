import java.util.*;
public class StringBuilder1 {
//     Why do we use StringBuilder?
// Strings are immutable in Java.
// ➔ Once a String is created, it cannot be changed.
// ➔ If you modify a String (like adding, deleting, or inserting), Java creates a new String object each time.
// ➔ This is slow and memory-wasting if you are doing a lot of modifications (like inside a loop).
// What is StringBuilder?
// StringBuilder is a mutable (changeable) version of String.
// It allows you to modify the text (append, insert, delete, replace, etc.) without creating a new object every time.
// It is faster and more memory-efficient for heavy text manipulations.
public static void main(String[] args) {
    StringBuilder str = new StringBuilder("hello");
   System.out.println(str);// hello
   str.setCharAt(0,'m'); // mello
   str.append("world");// str+="world is invalid din case of string builder"
   // now prints hello world
   str.append(10);// helloworld10
   str.insert(2,"y");//
   System.out.println(str);
   str.deleteCharAt(2);
   str.reverse();
   System.out.println(str);
   str.delete(2,4);// delete for range delete actually 2 to 4-1
   // to take input from user use 
   Scanner sc = new Scanner(System.in);
   StringBuilder  str2 = new StringBuilder(sc.nextLine());
   System.out.println(str2);
   }
}