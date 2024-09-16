package BinarySearch;

import java.util.Scanner;
/*

 */
public class searchTarDup {
    static int searchTargetDuplicate(int[] arr, int n, int target) {
        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[st] == arr[mid] && arr[mid] == arr[end]) {
                st++;
                end--;
            } else if (arr[mid] <= arr[end]) {
                //min to end is sorted
                if (target > arr[mid] && target <= arr[end]) st = mid + 1;
                else end = mid - 1;
            } else {
                // st to mid is sorted
                if (target >= arr[st] && target < arr[mid]) end = mid - 1;
                else st = mid + 1;
            }
        }
        return -1;
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
        System.out.println("The index element of target element :");
        System.out.println(searchTargetDuplicate(arr, n, t));
    }
}
