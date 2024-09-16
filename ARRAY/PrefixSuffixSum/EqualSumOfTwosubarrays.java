package ARRAY.PrefixSuffixSum;
// CHECK IF WE CAN PARTITION THE ARRAY INTO TWO SUBARRAYS WITH EQUAL SUM. MORE FORMALLY CHECK THAT THE PREFIX SUM OF A PART OF THE ARRAY IS EQUAL TO THE SUFFIX SUM OF REST OF THE ARRAY.
import java.util.Scanner;

public class EqualSumOfTwosubarrays {
    static int FindArraySum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr) {
        int totalSum = FindArraySum(arr);
        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;

            if (suffixSum == prefSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal Partition possible: " + equalSumPartition(arr));
    }
}