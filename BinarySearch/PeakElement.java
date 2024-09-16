package BinarySearch;

import java.util.Scanner;

public class PeakElement {
    static int mountainArray(int[] arr) {
        int n = arr.length - 1;
        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            // mid is peak
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == n - 1 || arr[mid] > arr[mid + 1])) return mid;
            // ascending slope
            if (arr[mid] < arr[mid + 1]) {
                st = mid + 1;
            } else end = mid - 1; // desending order or downhill
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 1, 2, 6, 10, 3};
      /*  System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

       */
        System.out.println("The Peak index element :");
        System.out.println(mountainArray(arr));
    }
}
