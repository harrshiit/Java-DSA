 import java.util.Scanner;
// number of ways for n  stairs if single and double steps are allowed
// problem can be solve by combination concept in mathematics

public class stairpath1 {
    public static int stairpath(int n){
        if(n==1) return 1 ;// if at first stair only one way that is single step
        if(n==2)  return 2;// if at second stair two ways two single  step or one double step 
        return stairpath(n-1)+stairpath(n-2);
        }
        public static void main(String[] args) {
            System.out.println("enter the number of stairs are their");
            Scanner sc=new Scanner (System.in);
            int x=sc.nextInt();
            System.out.println("the total no of stairs path ways  for "+x+ " stairs are");
            System.out.println(stairpath(x));
        }
    
}
