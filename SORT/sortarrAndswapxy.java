package SORT;

import java.util.Scanner;
/*
Given an array where all its elements are sorted in increasing order except two swapped elements, sort it in
linear time. Assume there are no duplicates in the array.
For example,
Input: A[] = [3, 8, 6, 7, 5, 9, 10]
Output: A[] = [3, 5, 6, 7, 8, 9, 10]
 */

public class sortarrAndswapxy {
    static void display(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    static void sortArr(int[] arr) {
        int n = arr.length;
        int x = -1, y = -1;
        if (n <= 1) return;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) {
                    // first conflict
                    x = i - 1;
                    y = i;
                } else y = i;
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Before sorted array :");
        display(arr);
        sortArr(arr);
        System.out.println("After sorted array :");
        display(arr);
    }
}
