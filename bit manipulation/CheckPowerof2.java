import java.util.Scanner; 
public class CheckPowerof2 {
public static boolean checkpower1(int n ){
     // comes under brutforce 
    // takes logN complexicity as The loop runs until value reaches N`.
    // Since we are multiplying by 2 in each step, it takes log₂(N) steps.So, Time Complexity = O(log N).
  int value=1; // 2^0 equals 1
  while(value<n){
    value*=2;
  }
 return n==value;// returns true if n contains power of 2 number or equals to value otherwise  false
}
public static boolean checkpower2(int n){
    //Since the loop runs until N becomes 0, and we divide N by 2 in each step, the number of iterate = logbase2 N= logN
    int count =0;
    while(n>0){// works on idea number having exactly 2 power has only one set bit or only one 1 in its binary form
        if((n&1)==1) //number 1 & with ! gives 1 nad zero with 1 gives zero
        count++;
        n=n>>1;// means n divided by 2 or shift binary bits on left side to compare 1 with another bit 
    }
    return count==1;// gives true if count exactly equals 1
}

public static boolean checkpoweroptimal(int n){
    return (n&(n-1))==0; // return true if this condition satisfies 
    //power of 2 number contain only 1 setbit and n-1 is the reverse of number of n upto setbit so doing and with it gives zero
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number you want to check");
    int n=sc.nextInt();
    if(checkpoweroptimal(n)){// true if function throw true boolean value 
    System.out.println("yes number is of power of two ");
     int exponent=(int)(Math.log(n)/Math.log(2));
     System.out.printf("AS the %d equals 2^%d ",n,exponent);
                      }
    else
    System.out.println("no number is not in power of two");
    sc.close();

    
}
    
}
