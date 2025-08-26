import java.util.*;
public class printing_increasing_decreasing {
    public static void decreasing(int n){
        if(n==0) return;//base condition print up to 1
        System.out.println(n); // code
        decreasing(n-1);// recursive call
    }
     
    public static void increasing(int x , int n)// passing two parameters
    {
        if(x>n) return;// base case
        System.out.println(x); //code
        increasing (x+1,n);//recursion call
    }

    public static void increasing2(int n) // by pasiing one parameter only here we do final  code after recursive call line
    { if(n==0) return;
        increasing2(n-1);
        System.out.println(n);

    }
        
    
    public static void main(String[] args) {
        System.out.println("enter the number from which you want to decrease up to zero ");
        Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    System.out.println();
    decreasing(x);
    System.out.println();
    System.out.println("increasing pattern will using two parameter");
    increasing(1,x);
      System.out.println("increasing pattern by using increasing2 fxn");
      increasing2(x);
    

    sc.close();
}
    
}
