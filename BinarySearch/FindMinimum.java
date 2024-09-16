package BinarySearch;

import java.util.Scanner;
/*
Input :
array = [5,6,7,8,9,10,1,2,3,4]
Output : 6

 */

public class FindMinimum {
    static int findMinimum(int[] arr) {
        int n = arr.length;
        int st = 0, end = n - 1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] <= arr[n - 1]) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    // ROTATED ARRAY QUESTION
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("The minimum element is : ");
        System.out.println(findMinimum(arr));

    }
}
