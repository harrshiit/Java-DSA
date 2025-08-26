import java.util.Scanner;

public class ReverseAllSentence {
    public static String  reverse1( String str)
    {StringBuilder ans = new StringBuilder();
     for ( int i=str.length()-1;i>=0;i--)
        { ans.append(str.charAt(i));

        }
      return ans.toString();
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



