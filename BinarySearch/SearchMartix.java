package BinarySearch;

import java.util.Scanner;

public class SearchMartix {
 /*   static boolean searchMatrixTarget(int[][] arr, int n, int m, int target) {
        n = arr.length;
        m = arr[0].length;
        int st = 0, end = n * m - 1;
        while (st <= end) {
            int mid = st+(end-st)/2;
            int r = mid/m, c = mid%m;
            int midElt = arr[r][c];
            if(midElt==target) return true;
            else if(target < midElt) end = mid-1;
            else st = mid+1;
        }
        return false;
    }

  */
    static boolean searchMatrixTarget1(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        int i = 0, j = m - 1;
        while (i < n && j >= 0) {
            if (arr[i][j] == target) return true;
            else if (target > arr[i][j]) i++; // move right
            else j--; // move left
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{2 , 4, 6,8},
                       {5,6,7,20},
                       {7,11,13,25},
                        {12,14,17,30}};
      /*  System.out.println("Enter the length of row and column matrix :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the " + n * m + " elements in the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

       */
        System.out.println("The array elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the target element :");
        int target = sc.nextInt();
        //System.out.println(searchMatrixTarget1(arr, n, m, target));
        System.out.println(searchMatrixTarget1(arr,target));
    }
}
