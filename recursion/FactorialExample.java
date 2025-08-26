import java.util.Scanner;

public class FactorialExample {

    // Iterative method to calculate factorial
    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive method to calculate factorial
    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;// if n values is 1 or zero then it will return 1 because both factorial are 1
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n1 = scanner.nextInt();
        System.out.println("factorial by iterative method of number "+n1+" is "+factorialIterative(n1));
        System.out.println("enter another number");
        int n2=scanner.nextInt();
        System.out.println("factorial by recursive method by number "+n2+" is "+factorialRecursive(n2));
        scanner.close();
    }
}
      
