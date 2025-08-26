import java.util.Scanner;

public class RemoveLastSetbit {
    public static int remove(int n){
        return n&(n-1);
        //last set bit means the rightmost bit whose value is 1 
        //it works on concept any number like 17(10001) if become 16 (10000) see from last set bit number gets reverse
        // like for 40(101000) if ut becomes 39(100111) see from the rightmost est bit number gets reverse 
        //& with zero to one  gives zero this concept works here 
    }
    

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("the binary representaftion of the number is "+Integer.toBinaryString(n));
        int newnumber=remove(n);
        System.out.println("after removing last set bit or right most set bit binry becomes "+Integer.toBinaryString(newnumber));
        System.out.println("the number becomes "+newnumber);
        sc.close();

}
}
