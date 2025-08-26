import java.util.Scanner;

// Fibonacci series :- 0, 1, 1, 2, 3, 5, 8, 13, .........
public class fibconacci{

    // Iterative function to find the nth Fibonacci number
    public static int fibIterative(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        int first = 0;
        int current = 1;
        int prev;
        
        // Loop to calculate the Fibonacci series iteratively
        for (int i = 2; i < n; i++) {
            prev = first;
            first = current;
            current = prev + first;
        }
        return current;
    }

    // Recursive function to find the nth Fibonacci number
    public static int fibRecursive(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        // Recursive call to calculate nth Fibonacci number
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Corrected prompt
        System.out.println("Enter the nth value for which you want to print: ");
        int x = sc.nextInt();

        // Iterative method result
        System.out.println("The value of nth Fibonacci number by iterative method is: " + fibIterative(x));

        // Recursive method result
        System.out.println("The value of nth Fibonacci number by recursive method is: " + fibRecursive(x));

        sc.close();
    }
}
