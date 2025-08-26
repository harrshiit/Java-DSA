public class maxsubarray {
    public static void maxsubarray(int arr[]) {
        int sumax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<=i;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=+arr[k];
                }
                sumax=Math.max(sum,sumax);
            }
            
        }
        System.out.println(sumax); 
    }
    public static void main(String[] args) {
        int arr[]={-1,2,4,-8,6,7,-1};
        maxsubarray(arr);
    }
    
}
