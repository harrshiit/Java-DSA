import java.util.Scanner;

public class Binary2Decimal {
    public static int Binary2DecimalBrut(int binary){
        int ans=0, power=1;//2 to the power 0 equals 1
        while(binary>0){
            int unitdigit=binary%10;
            ans+=(unitdigit*power);
            binary/=10;
            power*=2;
        }
        return ans;
    }

    public static int Binary2DecimalBit(int binary){
        int ans=0,power=0;
        while(binary>0){
            int unitdigit=binary&1;//get last digit 1 if 1 and zero if zero other wise all become 0
            ans+=unitdigit*(1<<power);//left shift means 2^power
            binary>>=1;// means right shift a digit which is unit digit
            power++;
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a binary number whuich you want to convert in decimal ");
        int binary=sc.nextInt();
        System.out.println("its decimal is  :  "+Binary2DecimalBit(binary));
        sc.close();

    }
    
}
