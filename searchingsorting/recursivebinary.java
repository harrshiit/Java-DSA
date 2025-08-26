import java.util.Scanner;
public class recursivebinary {
public static int recursivebinary(int arr[],int first , int end , int key)
{
    if(first<=end){
        int mid=(first+end)/2;
        if(arr[mid]==key)
            System.out.println("array key found at index  "+mid);
            if(arr[mid]>key)
            return recursivebinary(arr,first,mid-1,key);
            if(arr[mid]<key)
            return recursivebinary(arr,mid+1,end,key);
            }
        else
        System.out.println("key not found soory ");
        return -1;

}
public static void main(String[] args) {
    System.out.println("enter the size of an array");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the array elements");
    for(int i=0;i<n;i++){
        System.out.println("The "+i+"th element is ");
        arr[i]=sc.nextInt();
}
System.out.println("thank you, sucessfully entered array elements");
System.out.println("your array are ");
for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}
System.out.println();
System.out.println("enter the key which you want to find");
int key=sc.nextInt();
recursivebinary(arr,0,n-1,key);

    
}
    
}
