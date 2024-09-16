package BinarySearch;

import java.util.Scanner;

public class TargetBinary {
    static boolean binarySearch(int[] arr, int target) {
        int n = arr.length;
        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (target == arr[mid]) return true;
            else if (target < arr[mid]) end = mid - 1;
            else st = mid + 1;
        }
        return false;
    }

    static boolean recBinarySearch(int[] arr, int target, int st, int end) {
        if (st > end) return false;
        int mid = st + (end - st) / 2;
        if (target == arr[mid]) return true;
        else if (target < arr[mid]) return recBinarySearch(arr, target, st, mid - 1);
        else return recBinarySearch(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Enter the target element :");
        int t = sc.nextInt();
//        while (t != 10) {
//            System.out.printf("%d exists in arr : %b \n", t, binarySearch(arr, t));
//            // System.out.printf("neter", (binarySearch(arr,t)));
//            t++;
//        }
        System.out.println(binarySearch(arr, t));
        System.out.println(recBinarySearch(arr, t, 0, n - 1));

    }
}
