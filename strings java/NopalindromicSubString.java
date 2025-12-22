import java.util.*;
public class NopalindromicSubString {
    // program to find the number of palindromic substring 
    public static int NoOfpalindromicsubStringBRUTE( String str ){
 //brutforce 
//  Generate every substring of the string → O(n²) Check if each substring is a palindrome → O(n)
// // Total = O(n³)

        int count=0;
        int n=str.length();
        for (int i=0;i<str.length();i++){ //O(n)
             for(int j=i+1;j<=n;j++){ //O(n)
               String sub =  str.substring(i, j+1);
               if(ispalindrone(sub)){ //O(n)
                 count++;}
             }  }
      System.out.println();
        return count;
    }
     public static boolean ispalindrone ( String str){
        int l=0  , r=str.length()-1;
        while (l<r) {
            
        if(str.charAt(l)!=str.charAt(r)) return false ;
         l++ ;
         r--;
        }
        return true;
      }
  public static int NoOfpalindromicsubStringOptimal( String str){
    //Takes O(n2) 
    int count = 0 ;
    for( int i=0 ; i<str.length();i++){
      //chck for odd length palindrome 
     count += palindromecheck( str , i , i); // passing string left pointer and right pointer centre is i only 
      // check for even length 
     count += palindromecheck( str , i , i+1); // centre is both for even length i and i+1 
      }
   return count ;

  }

  public static int palindromecheck( String s , int left , int right ){
    int count=0 ;
    while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
      count ++  ; 
      // expand left right to check bigger string 
      left-- ; 
      right++;
    }
    return count ; 

  }




    }