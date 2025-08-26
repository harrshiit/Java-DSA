import java.util.*;
public class increasing_to_decreasing
{public static void printIncreasingDecreasing(int n, int current) 
    {
    if (current > n) {
        return;
    }

    // Print current number (increasing part)
    System.out.println(current);

    // Recursive call to print next number
    printIncreasingDecreasing(n, current + 1);

    // Print current number again (decreasing part)
    // No condition here; print all numbers in decreasing phase
    System.out.println(current);
}

    // Recursive function to print increasing and decreasing numbers having only one numbetr in between
    public static void printIncreasingDecreasing1(int n, int current)// fxn will print only one 5
     {
        if (current > n) {
            return;
        }

        // Print current number (increasing part)
        System.out.println(current);

        // Recursive call to print next number
        printIncreasingDecreasing1(n, current + 1);

        // Print current number again (decreasing part)
        if (current != n) {
            System.out.println(current);
        }
    }

    // Main function
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("function 1");
        printIncreasingDecreasing(x,1);
        System.out.println("output from using function 2");
        printIncreasingDecreasing1(x, 1);
    }
}

