import java.util.*;
public class power {
    public static int pow_recursive(int a , int b){
        if (b==0)
        return 1;
        int result = a*pow_recursive(a,b-1);
        return result;
    }
    public static int  pow_itterative(int a , int b){
        int result =1;
        for(int i=0;i<b;i++){
            result=result*a;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("enterthe number");
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        System.out.println("enter the power you want the number raised of");
        int y=sc.nextInt();
        System.out.println("anser suing recursive function");
       System.out.println(pow_recursive(x, y));
        System.out.println("here is the answer using ittirative function");
        System.out.println(pow_itterative(x, y));
    }
    
}
