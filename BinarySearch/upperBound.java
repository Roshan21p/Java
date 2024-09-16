package BinarySearch;

public class upperBound {
    public static int upperB(int[] arr,int x) {
        int lo=0,hi= arr.length-1;
        int ub = arr.length;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>x){
                ub = Math.min(mid,ub);
                hi = mid-1;
            } else{
                lo = mid+1;
            }
        }
        return ub-1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,30,40,50,60,70};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("Upper bound is : "+upperB(arr,30));
    }
}
