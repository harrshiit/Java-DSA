import java.util.Scanner;
public class selectionsort {
    public static void selectionsort(int arr[], int n){
        for(int i=0;i<n-1;i++){
             int  min=i;
            for(int j=i+1;j<n;j++)
             {
                if(arr[j]<arr[min])
                min=j;
             }
            
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
        }
             
        }
        public static void main(String[] args){
             System.out.println("enter the length of element");
             Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             System.out.println("enter the element of an array ");
             int arr[] = new int [n];

             for(int i=0; i<n ; i++){
                arr[i]=sc.nextInt();
               }
               System.out.println("your array will be ");
 for(int i=0;i<n;i++)
 {
    System.out.print(arr[i]+" ");
 }
 System.out.println("now the sorted array will be ");
 System.out.println();
 selectionsort(arr,n);
for(int i=0;i<n;i++)
 {
    System.out.print(arr[i]+" ");
 }
                    }

    }

    

