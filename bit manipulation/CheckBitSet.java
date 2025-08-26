import java.util.Scanner; // Corrected import statement

public class CheckBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number and bit position
        System.out.print("Enter a number (N): ");
        int N = sc.nextInt();
        System.out.print("Enter the bit position (i): ");
        int i = sc.nextInt();
        
        // Method 1: Using Left Shift
        if ((N & (1 << i)) != 0) {
            System.out.println("Bit at position " + i + " is SET (1)");
        } else {
            System.out.println("Bit at position " + i + " is NOT SET (0)");
        }
        
        // Method 2: Using Right Shift
        if (((N >> i) & 1) == 1) {
            System.out.println("Bit at position " + i + " is SET (1) (Using Right Shift)");
        } else {
            System.out.println("Bit at position " + i + " is NOT SET (0) (Using Right Shift)");
        }
        
        sc.close();
    }
}
