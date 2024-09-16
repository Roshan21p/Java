package ARRAY.PrefixSuffixSum;
// Given an integer array "a" return the prefix sum/running sum array without creating a new array
import java.util.Scanner;

public class PrefixSumVoutCreatingNewarr {
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] suffixSum(int[] arr){
        int n = arr.length;
        for(int i = n-2;i>=0;i--){
            arr[i] = arr[i] + arr[i+1];
        }
        return arr;
    }
    static int[] prefixSum(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }
    //with creating new array
 /*   static int[] prefixSum(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];

        for(int i=1;i<n;i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a the array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Input array: ");
        printArray(arr);
       // System.out.println("The prefix sum :");
       // printArray(prefixSum(arr));
        System.out.println("The suffix sum :");
        printArray(suffixSum(arr));
    }
}
