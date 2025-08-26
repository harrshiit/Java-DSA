public class MinElement {

    public static int Minelement( int arr[]){
        int ans=Integer.MAX_VALUE;// assign most min value in case oif finding of maximum element in the array 
        for( int i=0;i<arr.length;i++){
            if(arr[i]<ans) {
                ans=arr[i];
              }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,9,6,7,1,1 };
        int min = Minelement(arr);
        System.out.println(" the minimum element in the array is "+ min );

    } 
}