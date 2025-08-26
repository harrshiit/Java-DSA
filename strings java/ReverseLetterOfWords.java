import java.util.*;
public class ReverseLetterOfWords {
// for reverse only letters of words while preserving spaces and all in a sentence 
public static String reverse1( String str){
     // Approach 1: Iterative Two-pointer per word (Efficient and readable)
// Time: O(n) — we visit each character exactly once.
// Space: O(n) — for the result StringBuilder and substring operations.
    StringBuilder ans= new StringBuilder();
    int i=0;
    while (i<str.length()){
        if (str.charAt(i)==' '){
        ans.append(" ");
        i++;
        continue;
    }
    int j = i; // this line reach when the index at i is not a space reach at character then we assign that index to j 
    while ( i<str.length()&&str.charAt(i)!=' '){
        i++;// this loop stops when i did not get the  space and traverse the all leter words reach next space 
    }
    StringBuilder res= new StringBuilder(str.substring(j,i ));
    ans.append(res.reverse());
    }
    return ans.toString();
}

public static String reverse2(String str){
   // Approach 2: Split by space, reverse each word, then join
// Time: O(n) — each character is visited once during split and again during reversal.
// Space: O(n) — for array from split, reversed strings, and final join result.

    String[] words=str.split(" ",-1);//  -1 because split all spces also after the end word
    // this splits and makes array of words and spaces 
    for(int i=0;i<words.length;i++)
    { StringBuilder temp = new StringBuilder();
        words[i]=temp.reverse().toString();

    }
    return String.join(" ", words);

}

public static String reverse4(String s) {
    // Approach 3: In-place reverse using character array
// Time: O(n) — each character is visited once; reversals are linear in each word length.
// Space: O(n) — due to character array copy of the original string (result is new string).
// Extra Space: O(1) — since reversal is done in-place on the character array.
    char[] chars = s.toCharArray(); // Convert string to char array for in-place manipulation
    int i = 0;
    while (i < chars.length) {
        if (chars[i] == ' ') { // Skip spaces
            i++;
            continue;
        }
        int start = i; // Start index of word
        while (i < chars.length && chars[i] != ' ') { // Move i to end of word
            i++;
        }
        reverseCharArray(chars, start, i - 1); // Reverse the word in place (O(k))
    }
    return new String(chars); // Convert char array back to string (O(n))
}

// Helper function to reverse a section of a character array
private static void reverseCharArray(char[] arr, int start, int end) {
    while (start < end) {
        char temp = arr[start]; // Swap characters
        arr[start++] = arr[end];
        arr[end--] = temp;
    }
}


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your string ");
    String str=sc.nextLine();
    System.out.println("your string is \""+str+"\"");
    System.out.print(" the output is :");
    System.out.println(reverse1(str));
    sc.close();
    
}
}