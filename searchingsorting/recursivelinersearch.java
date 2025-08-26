import java.util.Scanner;
public class recursivelinersearch {
    public static int reclinear(int arr[], int size , int key ){
        if(size<0){ 
            System.out.println("key not found");
            return -1; }
        if(arr[size]==key){
        System.out.println("key found at index "+size);
        return size;
        }
       return reclinear(arr,size-1,key);

    }
    public static void main(String[] args) {
        System.out.println("enter the size of array ");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int [] arr=new  int[s];
        System.out.println("enetr the value inside the array");
        for(int i=0;i<s;i++)
        {System.out.println("the value at "+i+ " index is ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Good ur array will be look like ");
        for (int i=0;i<s;i++){
            System.out.print(arr[i]);

        }
        System.out.println();
        System.out.println("eneter  the value of key you wanna find out");
        int key=sc.nextInt();
        reclinear(arr,s-1,key);
        
    }
}
