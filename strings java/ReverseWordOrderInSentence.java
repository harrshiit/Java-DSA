import java.util.*;
public class ReverseWordOrderInSentence {
 // also remove leading and trailing spaces between words in a sentence 
    public static String reverse1(String str){
        // Approach 1: Using split and StringBuilder (Brute Force)
           // Time Complexity: O(n) - traverses each character once.
         // Space Complexity: O(n) - stores split words and final result.
        String[] ans=str.trim().split("\\s+");//\\s matches any whitespace character (like space ' ', tab '\t', newline '\n', etc.).
       // + means "one or more" of the preceding element together
       StringBuilder sb=new StringBuilder();
       for(int i=ans.length-1;i>=0;i--){
        sb.append(ans[i]).append(" ");// apppend each word and then append space
       }
       return sb.toString().trim();// we use trim because when it generated to string every word generate a space after it and we want only a 
       // space beetween the words thats why 
    }

    public static String reverse2( String str){
      // Approach 2: Split + String concatenation (Slow due to immutable strings)
// Logic: Same as Approach 1 but uses `res +=` instead of StringBuilder.
// Time Complexity: O(n^2) - due to repeated string concatenation.
// Space Complexity: O(n^2) - temporary strings during concatenation.
        String arr[]=str.split(" ");// make arry of words and starting and between spaces not takes end space delemeter
        String ans=""; // craeate a empty string to store a value 
        for(int i=arr.length-1;i>=0;i--){
         if(arr[i].length()==0) continue;// means no word are there 
         if(ans.length()==0) ans+=arr[i];
         else
        ans+=""+arr[i];
         }
         return ans;

    } 

    public static String reverse3( String str){
      // Approach 3: Using split with StringBuilder (Variant of Brute Force)
// Logic: Split string by single space (" "), skip empty strings (due to multiple spaces), append in reverse.
// Compared to Approach 1: No use of trim() or \s+, so must manually ignore empty strings.
// Time Complexity: O(n) - iterates over all words and characters.
// Space Complexity: O(n) - stores array and result.
 String[] arr=str.split(" ");
 StringBuilder ans=new StringBuilder();
 for( int i=arr.length-1;i>=0;i--){
   if(ans.length()==0) continue;
   if(ans.length()>0){
      ans.append(" ");
   }
   ans.append(arr[i]);
}
return ans.toString();
}

public static String  reverse4(String str){
   ArrayList<String> ans = new ArrayList<>();
   int i=str.length()-1;// point to the last index 
   while (i>=0)// start looping from end 
   { while(i>=0&&str.charAt(i)==' '){
      i--;// for skipping last spaces 
   }
   int j =i;// above loop stops up to any character appear apart from empty spaces then assign that index value to the j 

   while(i>=0&&str.charAt(i)!=' '){
      i--;// now point he i pointer gain to towards the empty space skipping the letter 
   }
    ans.add(str.substring(i+1,j+1));// storing the word in arraylist by traversing the first letter of the word up to end+1 because we need to take one extra at end in substring method

   }
   return String.join(" ", ans);// now join the all stored word in an arraylist with spaces as an string 
} 
    
public static String reverse5( String str){
  // Time Complexity: O(n) - traverses each character once.
// Space Complexity: O(n) - uses StringBuilder to store result.
// compare to reverse 4
// - Both use a reverse two-pointer traversal without split()
// - Approach 4 uses a List<String> to collect words, then String.join(), which involves additional memory and post-processing
// - Approach 5 directly builds the result with StringBuilder while traversing — saving an extra traversal and object creation
// - Approach 5 is slightly more space-efficient and direct, avoiding intermediate collections
StringBuilder ans = new StringBuilder();
int i=str.length()-1;// end pointer 
while (i>=0){
   while (i>=0&&str.charAt(i)==' ') i--;
   int j=i;
   if(i<0) break;
   while( i>=0 && str.charAt(i)!=' ') i--;
   if(ans.length()>0) ans.append(" ");
   ans.append(str.substring(i+1, j+1));
}
return ans.toString();
}

public static void main(String[] args) {
   System.out.println(" enter the sentence which you want to reverse its words ");
   Scanner sc= new Scanner(System.in);
   String str=sc.nextLine();
   System.out.println( " the  sentence become :  "+ reverse5(str));
   sc.close();
}

}
