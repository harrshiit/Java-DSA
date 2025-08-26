import java.util.Scanner;
public class stairpath2 {
    // if single double and Triple steps steps are allowed

            public static int stairpath(int n){
                if(n==1) return 1 ;// if at first stair only one way that is single step
                if(n==2)  return 2;// if at second stair two ways two single  step or one double step 
                if(n==3) return 4;// three single , one single one double , one triple ,one double one single 
                return stairpath(n-1)+stairpath(n-2)+stairpath(n-3);
                }
                public static void main(String[] args) {
                    System.out.println("enter the number of stairs are their");
                    Scanner sc=new Scanner (System.in);
                    int x=sc.nextInt();
                    System.out.println("the total no of stairs path ways  for "+x+ " stairs are");
                    System.out.println(stairpath(x));
                }
            
        }
        
    
    
