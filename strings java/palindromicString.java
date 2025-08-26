import java.util.*;
public class palindromicString {
    // program to find the number of palindromic string 
    public static int NoOfpalindromicString( String str ){
        int count=0;
        int n=str.length();
        System.out.println("the palindromic substrings are ");
        for (int i=0;i<str.length();i++){
             for(int j=i+1;j<=n;j++){
               String sub =  str.substring(i, j);
               if(ispalindrone(sub)){
                 count++;
                 System.out.printf(" %s",sub);
                 
             }
             
        }
      }
      System.out.println();
        return count;
    }

    public static boolean ispalindrone ( String str){
        int l=0  , r=str.length()-1;
        while (l<r) {
            
        if(str.charAt(l)!=str.charAt(r)) {
       
        return false ;
        }
         l++ ;
         r--;
        }
        return true;
      }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string you want to check the  tatal number of substring exixt ");
       String str = sc.next();
       System.out.println("you entered:"+ str);
       System.out.println(" the total number of plaindromic substrings are "+NoOfpalindromicString(str));
       //System.out.println("And those substrings are ");


        
    }
    
}