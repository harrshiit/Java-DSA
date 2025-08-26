import java.util.*;
public class oddoreven{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number you want to check ");
        int n=sc.nextInt();
        if((n&1)==1)// if any number and with 1 it gives same number and & with zero gives zero        
        System.out.println("number is odd ");
        else 
        System.out.println("number is even ");
    }
}