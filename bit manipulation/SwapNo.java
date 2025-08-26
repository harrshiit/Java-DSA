import java.util.Scanner;

public class SwapNo {
    public static void swap(int a,int b){
        a=a^b;
        b=a^b;//=a^b^b=a
        a=a^b;//=a^b^b=a^b^a=b
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the value for a :");
        int a=sc.nextInt();
        System.out.println("enter the value for b :");
        int b=sc.nextInt();
        System.out.printf("the value of a = %d and b = %d before swapping",a,b);
        swap(a,b);
        System.out.println();
        System.out.printf("the value of a =%d and b = %d after swapping",a,b);
        sc.close();

    }
    
}
