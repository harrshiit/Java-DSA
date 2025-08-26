import java.util.*;
public class CountSetBit {
    public static int solbrut(int n){
        // time complexicity of logn because we keep diving it by two 
        // space complexicity is O(1) becaus we use the constant extra space 
        int count=0;
        while(n>0){
            if(n%2==1)// last significant bit of every odd number is 1 
            count++;
            n=n/2; // this means n>>1 shift right effectively removing the last bit
            // this loop is repeat until n becomes zero
        }
         return count;
    }

public static int solaverage(int n){
    // same complexicity but faster than brutforce because bit operator are used here 
    int count=0;
    while(n>0){
        // if last bit is one then and with 1 gives 1 
        count=count+(n&1);
        n=n>>1;// right shift the last bit 
    }
    return count;
}

public static int soloptimal ( int n){
    int count =0;
    while(n>0){
        n=n&(n-1);// n-1 contains the opposite number from the last set bit up to the last bit so this loop is runs 
        // only up to that times according to the number of set bits present
        count++;
    }
    return count;

}

public static void main(String[] args) {
    System.out.println("enter the number you want to check its set bit");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("okk the binary representation of the number are " +Integer.toBinaryString(n));
    System.out.println("the no the set bit contain  by this number "+soloptimal(n));
    sc.close();
    
}


    
}
