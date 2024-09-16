package SlidingWindow;

import java.util.*;

public class maxSumSubarraySizeK {
    
    public static void main(String[] args) {
        int[] arr = {10,20,1,3,-40,80,10};
        int n = arr.length;
        int k = 3;
        int maxSum = Integer.MIN_VALUE;
        // Method 1 : Brute force approach
     /*   for(int i=0;i<n-k+1;i++){
            int sum = 0;
            for(int j=i;j<=i+k-1;j++){
                sum += arr[j];
            }
            maxSum = Math.max(maxSum,sum);
        }
      */
        // Method 2 : Sliding Window
        int i=0 , j=k-1, sum=0;
        for(int a=0;a<k;a++){
            sum += arr[a];
        }
        i++;j++;
        maxSum = Math.max(maxSum,sum);
        while(j<n) {
            maxSum = Math.max(maxSum, sum);
            sum = sum - arr[i - 1] + arr[j];
            i++;
            j++;
        }
        System.out.println(maxSum);
    }
}
