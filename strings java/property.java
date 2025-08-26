import java.util.Scanner;

public class property {
    public static void main(String[] args) {
        String s = "abc";
        s += "def"; // Concatenates "def" to "abc"
        s += 10 + 20; // 10 + 20 is evaluated first (30), then concatenated to "abcdef"
       System.out.println(s);         // prints "abcdef30" because 10+20=30 is evaluated before concatenation
        System.out.println(s + 10 + 20); 
        // Here, s is a String, so s+10 results in "abcdef301" (string concatenation), 
        // then "abcdef3010"+20 results in "abcdef301020"
         System.out.println(10 + 20 + s); 
        // Here, 10+20 is evaluated first (30), then concatenated with s, so it prints "30abcdef30"
        String a="harshit";
        System.out.println(a.substring(0,3));// print from index 0 to 3-1
        System.out.println(a.substring(1));// print 1 to end 
        System.out.println(a.substring(3));// 3 to end 
    }
}
