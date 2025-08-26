public class maxsubarray {
    public static void maxsubarray(int arr[]) 
    {
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++)
        {   currentsum+=arr[i];
            maxsum=Math.max(maxsum,currentsum);
            if(currentsum<0)
                currentsum=0;
        }
             System.out.println(maxsum); 
    
            }
    public static void main(String[] args) {
        int arr[]={-1,2,4,-8,-4,-1};
        maxsubarray(arr);
    }
    
}
