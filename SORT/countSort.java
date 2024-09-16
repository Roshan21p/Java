package SORT;

import java.util.Scanner;

public class countSort {
    static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static int findMax(int[] arr, int n) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > mx) mx = arr[i];
        }
        return mx;
    }

    static void basicCountSort(int[] arr, int n) {
        int max = findMax(arr, n);
        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    static void countSort(int[] arr, int n) {
        int[] output = new int[n];
        int max = findMax(arr, n);
        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) count[arr[i]]++;
        //Make prefix sum array of count array
        for (int i = 1; i < count.length; i++) count[i] += count[i - 1];
        //Find the index of each element in the original array and put it in output array
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < n; i++) arr[i] = output[i];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sorted array");
        display(arr);
        // basicCountSort(arr,n);
        countSort(arr, n);
        System.out.println("After sorted array :");
        display(arr);
    }
}
