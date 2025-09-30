package BinarySearch;

//Problem - You will be given a list of numbers (1 to N ), Each number is considered as one stick.
//The ith stick will be having specific length. We need to play a game in this probiem.
//We need to pick 3 sticks randomly. and if our opponent is able to form a triangle using those 3 sticks, he will win.
//Our task is to find the number of ways to select 3 sticks
//such that it is not possible for our opponent to form a triangle using them.
//Example - Input -[4,2.10]
// Output-1 Triplets -[4,2,10) ~> 4+2 < 10(Triangle violating property)


import java.util.Arrays;

// a + B < c not  form a triangle condition
// n2logn
public class NonTriangleTriplets {
    public static int upperBound(int[] arr,int x) {
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
        return ub;
    }
    public static int countInvalidTriplets(int[] arr){
        int ans = 0, n = arr.length;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                int sum = arr[i] + arr[j];
                int k = upperBound(arr,sum);    // logn
                ans += (n-k);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,9,6};
        // output : 2
        Arrays.sort(arr);
        System.out.println("find the number of ways to select 3 sticks that not form a triangle : "+countInvalidTriplets(arr));
    }
}
