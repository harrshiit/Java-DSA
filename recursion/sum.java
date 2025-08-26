import java.util.*; 

public class Sum {

    public static int  sum_loop(int n){
        int sum=0;
        for(int i=1; i<=n ; i++){
            
            sum=sum+i;
        }
        return sum;
    }


    // Parametrised recursion method
    public static int sum_parametrised(int n, int s) {
        if (n == 0) {
            return s;
        }
        return sum_parametrised(n - 1, s + n);
    }

    // Using one parameter only
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println("Enter the number up to which you want the sum:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // Output for parametrised recursion method
        System.out.println("Sum by parametrised recursion method:");
        System.out.println(sum_parametrised(x, 0));

        // Output for single parameter recursion method
        System.out.println("Sum output by using one parameter in recursion only:");
        System.out.println(sum(x));  // Capture and print the result of sum(x)

        // output using loop 
        System.out.println("output using loop method");
        System.out.println(sum_loop(x));
    }
}
