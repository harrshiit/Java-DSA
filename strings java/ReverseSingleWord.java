import java.util.*;
public class ReverseSingleWord {

    public static String reverse1(String str){
    //Using for loop (Brute Force)
    // Time: O(n^2), Space: O(n)
    // Time: String concatenation creates new string every time (O(n) per iteration)
    // Space: Final reversed string (n characters)
    String ans="";// initialize with empty string to hold reversed characters 
    for(int i=str.length()-1;i>=0;i--){
         ans += str.charAt(i);
    }
    return ans;
    }

    public static String reverse2( String str){
    //  Using StringBuilder (Optimal)
    // Time: O(n), Space: O(n)
    // Time: Each character is appended once in reverse order (linear iteration)
    // Space: New StringBuilder object is created (n characters)
     StringBuilder ans = new StringBuilder(str);
     ans.reverse();
     return ans.toString();
     //(in one line )return new StringBuilder(str).reverse().toString();

    }

    public static String reverse3( String  str){
    //Fixed Version of reverse using StringBuilder and in-place swapping (Optimal)
    // Time: O(n), Space: O(n)
    // Time: Swaps n/2 characters once
    // Space: StringBuilder copy of the original string
        StringBuilder ans = new StringBuilder();
        int n=str.length();
        for(int i=0; i<n/2-1;i++){
            char leftchar=ans.charAt(i);
            char rightchar= ans.charAt(n-i-1);
            ans.setCharAt(i, rightchar);
            ans.setCharAt(n-i-1, leftchar);
            }
            return ans.toString() ; 
        }
     
        public static String reverse4( String str){
     // Using char array and two-pointer swap (Optimal)
    // Time: O(n), Space: O(n)
    // Time: Single pass swapping from both ends
    // Space: Extra array of size n to hold characters
     char[] chars=str.toCharArray();
     int l=0;
     int r=chars.length-1;
      while(l<r){// loop unit half as pointer meet at middle to swap left and right elements 
    char temp=chars[l];
    chars[l]=chars[r];
    chars[r]=temp;
    l++;
    r--;
     }
     String result = new String(chars); // Convert the char array to a String
     return result;
     // alternative way to write it is
     //return new String(chars); // More concise form
     //return chars; here Java does not automatically convert a char[] to a String when you return it. If you return chars like this:
     //
  
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the string word you want to reverse ");
            String str=sc.next();
            System.out.println("the reverse of the word is ");
            System.out.println(reverse1(str));
            sc.close();
            
        }
}

