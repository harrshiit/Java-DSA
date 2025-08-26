import java.util.Scanner;

public class DecimalToBinary {
    public static String convert2Binary(int n) {
        String res = "";

        while (n != 1) { // Keep dividing until n becomes 1
            if (n % 2 == 1)
                res += '1';
            else 
                res += '0';

            n = n / 2;
        }

        res += '1'; // Add the last '1' manually

        // Use predefined reverse function
        res = new StringBuilder(res).reverse().toString();

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert to binary:");
        int n = sc.nextInt();
        
        System.out.println("Binary equivalent: " + convert2Binary(n));
        
        sc.close();
    }
}
