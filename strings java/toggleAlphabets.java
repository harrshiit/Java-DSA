import java.util.*;
public class toggleAlphabets {
    public static String  togglecase1(String str) {
         // 1. Brute Force with ASCII Comparison
    // Time Complexity: O(n), Space Complexity: O(n)
    // Fastest in most cases due to low-level ASCII operations (no function calls)
       StringBuilder str1 = new StringBuilder();
         // now for toggling 
         // we kow that for small letters ascaii value are 97 to 122 
         // for capital letters its is from 65 to 90 so we need to add 32 for capital letter to change it into small 
         // for small  we need to subtract 32 to chnage into capital 
         for(int i=0;i<str.length();i++){
            int ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=65&&ascii<=90)// capital to small
           { str1.append((char)(ascii+32));}
            else if(ascii<=122&&ascii>=97) // small to capital con
            {str1.append((char)(ascii-32)); }
            else
            str1.append((char)ascii);
            }
             return str1.toString();
          }
   
          public static String togglecase2(String str){
          StringBuilder str1= new StringBuilder();
            for(int i=0;i<str.length();i++){
                 char ch=str.charAt(i);
                 if(Character.isUpperCase(ch)){
                 Character.toLowerCase(ch);
                 str1.append(ch);
                }
                else if(Character.isLowerCase(ch)){
                    Character.toUpperCase(ch);
                    str1.append(ch); }
                    else{
                        str1.append(ch);
                    }
            }
            return str1.toString();
          }

        //   public static String togglecasebitwise( String str){
        //    // Optimal using Bitwise XOR
        //     // Time Complexity: O(n), Space Complexity: O(n)
        //     // Fast and elegant; faster than character class but slightly less readable


        //   }
        
           public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("eneter the words or sentence  you want to toggle its case ");
            String str=sc.nextLine();
            System.out.println("you entered -->"+str);
             System.out.println("the toggkle cased are "+togglecase1(str));
             sc.close();
        



        
    }

    
}
