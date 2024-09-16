package ArrayAssignment;

import java.util.Scanner;

/*
Given an unsorted array A of size N that contains only non-negative integers, find a
continuous sub-array which adds to a given number S.
In case of multiple subarrays, return the subarray which comes first on moving from left
to right.
You need to print the start and end index of answer subarray.
 */
public class printStartandEndIndex {
    static void subArrray(int[] arr, int targetSum) {
        int currentSum = 0;
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > targetSum) {
                currentSum = currentSum - arr[start];
                start++;
            }

            if (currentSum == targetSum) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }
        System.out.println("No subarray is found with the given sum");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter TargetSum :");
        int s = sc.nextInt();

        subArrray(arr,s);
    }
}
