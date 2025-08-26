public class selectionsort {
    public static void selectionsort(int arr[n]){
        for(int i=o;i<n-2;i++)//outer loop for elemnet ae compared up to only one before last elememt
        { int min=i;
            for(int j=i;j<n-1;j++)// loop for comparing jth element up to end of array 
             {
                if(arr[j]<arr[min])
                min=j;
             }
             swap( int arr[i], int arr[min])
             {
                arr[min]=arr[i];
                int temp=arr[i];
                arr[i]=temp;

             }
        }
        public static void main(String [] args){
             System.out.println("enter the length of element");
             Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             System.out.println("enter the element of an array ");
             int arr[] = new int [n];

             for(int i=0; i,n-1 ; i++){
                arr[i]=sc.nextInt();
               }
               System.out.println("your array will be ");
 for(int i=0;i<n;i++)
 {
    System.out.print(arr[i]+" ");
 }
 System.out.println("now the sorted array will be ");
 System.out.println();
 selectionsort(arr);

                    }

    }

    
}
