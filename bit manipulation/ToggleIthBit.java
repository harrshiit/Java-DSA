import java.util.Scanner;

public class ToggleIthBit {
    public static int togglebit(int n , int i){
        return (n^(1<<i));
        // 1 xor with 1 gives zero and with 0 gives 1 
        // zero xor with zero give zero with 1 gives 1
    }
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("the binary representaftion of the number is "+Integer.toBinaryString(n));
        System.out.println("enter the position whose position you want  to toggle");
        int i=sc.nextInt();
        int newnumber=togglebit(n, i);
        System.out.println("the binry becomes "+Integer.toBinaryString(newnumber));
        System.out.println("the number becomes "+newnumber);
        sc.close();

}
    
}
