import java.util.Scanner;
public class SetIthBit {
    public static int setbit(int N, int i){
        return N|(1<<i);
        //1 << i shifts 1 to the i-th position.
//Using N | (1 << i), we turn the i-th bit ON while keeping others unchanged.
// because or with 1 always gives one or with zero give same number as present before
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number ");
    int n=sc.nextInt();
    System.out.println(" the binary Represetation of the number are "+Integer.toBinaryString(n));
    System.out.println("eneter the postion where you want to set the  bit");
    int i=sc.nextInt();
    int newnumber=setbit(n,i);
    System.out.printf("number after setting the %dth bit in in bianry form are %s",i,Integer.toBinaryString(newnumber));
    System.out.println();
    System.out.println("the number becomes "+newnumber);
     sc.close();
    
  }
    
}
