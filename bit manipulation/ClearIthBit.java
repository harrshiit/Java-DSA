import java.util.Scanner;
public class ClearIthBit {
    public static int clearbit(int n, int i){
        return (n&(~(1<<i)));
        // 1 left shift by ith place then not of it become zero rest become one 
        // now and any no with 0 give zero and with one gives that same number 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("the binary representaftion of the number is "+Integer.toBinaryString(n));
        System.out.println("enter the position whose bit you want to clear");
        int i=sc.nextInt();
        int newnumber=clearbit(n, i);
        System.out.println("the bianry becomes "+Integer.toBinaryString(newnumber));
        System.out.println("the number becomes "+newnumber);

        
    }
    
}
