import java.util.*;
public class nextpermutation {
    public static void nextPermutation(int [] arr){
        int n=arr.length , pivotindex=-1;
        for(int i=n-2;i>=0;i--)//loop is to select pivot element from back of array 
        // that element which is smaller than its next element from back of array 
        {
            if(arr[i]<arr[i+1]){
                pivotindex=i;
                break;}
        }
        if(pivotindex==-1)//means if pivot not found it is the largest  array sequence or permulation 
        // that can be exit so its next will be the smallest sequence of sating which can be get by reverse it
        {
            reverse(arr,0,n-1);
            return;// means return from whole function not only loop part
        }
       
        for(int i=n-1;i>pivotindex;i--)//loop to find next greater element of pivot from last of array
        {if(arr[pivotindex]<arr[i])
            swap(arr,i,pivotindex);
            break;

        }
        reverse(arr,pivotindex+1,n-1);//reverse remaining part to get final permutation

    }
    

    public static void reverse (int [] arr , int i ,int j )
    { while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--; }
         }
          public static void swap(int[] arr, int i, int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the size of an array");
            int n=sc.nextInt();
            int [] arr=new int[n];
            System.out.println("enter the elements of array");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("alright ! you enter the array is  ");
            System.out.println(Arrays.toString(arr));
            nextPermutation(arr);
            System.out.println("the next permutation of this array is ");
            System.out.println(Arrays.toString(arr));
            sc.close();
            
        }
    
    
}
