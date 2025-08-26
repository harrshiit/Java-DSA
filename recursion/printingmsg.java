import java.util.*;
class printingmsg{
    public static void byloop(int n){
        for(int i=0;i<=n;i++){
      System.out.println("goodmorning by loop");
        }
    }
    public static void byrecursion(int n){
        if(n==0) // base  case have to prove in the recursion
        return;
        System.out.println("good morning by recuarsion");
        byrecursion(n-1);
    }
    public static void main(String[] args) {
        System.out.println("enter the number of messages you want to print by both");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        byloop(x);
        System.out.println();
        byrecursion(x);
        sc.close();
    }
}