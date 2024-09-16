package SORT;

import java.util.Scanner;

/*
2: Given an array of size U containing only 0s, 1s, and 2s; sort the array in ascending order.
Input:
U = 6
arr[]= {0 2 1 2 0 0}
Output:
0 0 0 1 2 1
 */
public class Sort012 {
    static void display(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void sortArr(int arr[]) {
        int low = 0, mid = 0, high = arr.length - 1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                mid++;
                low++;
            } else if (arr[mid]==1) {
                mid++;
            } else {
                swap(arr,mid,high);
                high--;
            }
        }
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
