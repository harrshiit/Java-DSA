import java.util.Scanner;
public class mergesort {
    public static void dividearray(int arr[], int first , int last)//  recursive function to divide any array in halves
    {
        if(first>=last) return;//base case
        int mid=(first+last)/2; // for space complexcity can also write (first+(last-first))/2
        dividearray(arr,first,mid);
        dividearray(arr,mid+1,last);
        conquerarray(arr,first,mid,last);
    }
    public static void conquerarray(int arr[], int first,int mid , int last){
        int i=first;
        int j=mid+1; int x=0;
        int mergearray[]=new int[last-first+1];
        while(i<=mid&&j<=last)// if both divided array contain elements
        {
            if(arr[i]<=arr[j]){
                mergearray[x]=arr[i];// can also write mergearray[x++]=arr[i++] instead of these two lines
                x++;i++;}
                else{
                    mergearray[x]=arr[j];
                    x++; j++;
                }             
         }
       while(i<=mid)// when element of second array got finished so we simply copy the elements of first array into merge array
                    // all because that elements is already sorted
       {mergearray[x]=arr[i];
        x++;i++;
        }
        while(j<=last){
            mergearray[x]=arr[j];x++;
            j++;
                       }
    for (int l=0, k=first;l<mergearray.length;l++,k++)// copy elements of merge array back to original array
    {   arr[k]=mergearray[l];
      }
        }

        public static void main(String[] args) 
        {
            System.out.println("enter the size of an array you want to create ");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("enter the array elements ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
               }
               System.out.println("your array elemnts are");
               for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
               }

               System.out.println("the sorted array are ");
               dividearray(arr,0,n-1);
               System.out.println("your sorted arrray are");
               for (int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
               }


            
        }

    }


    

