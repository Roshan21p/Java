package BinarySearch;

public class lowerBound {
    public static int lowerB(int[] arr,int x) {
        int lo=0,hi= arr.length-1;
        int lb = arr.length;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>=x){
                lb = Math.min(mid,lb);
                hi = mid-1;
            } else{
                lo = mid+1;
            }
        }
        return lb;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,30,40,50,60,70};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("Lower bound is : "+lowerB(arr,30));
    }
}
