import java.util.*
;public class decreasing_to_increasing {
    public static void print(int n) // this will print two 1 in series
    {
        if(n==0) return;
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    } 

    // in order to print only one 1 we do come changes in base case conditioin
    public static void print1(int n)
    {if(n==1)// when reaches to base case print 1 once
        { System.out.println(1);
            return;} 
            System.out.println(n);
            print1(n-1);
            System.out.println(n); // // After coming back from recursion, print in increasing order, but skip printing 1
        }
    public static void main(String[] args) {
        System.out.println("enter the number which you want to print the decreasing to increasing");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println();
        print(x);
        System.out.println();
        System.out.println("this will bprint only one 1");
       print1(x);

    }
    
}
