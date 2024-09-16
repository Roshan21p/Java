package ArrayAssignment.twod;

import java.util.Scanner;
/*
Q2. Convert a 1D sorted array of length n*m to a 2D array of n rows and m columns. The matrix should also be
sorted row and column wise.
Input:
n = 2
m = 2
arr = [1,2,3,4]
Expected Output:
[[1,2],[3,4]]
 */

public class OneDtoTwoD {
    static void convert1Dto2DArray(int[] arr,int n,int m){
        int idx = 0;
        int[][] ans = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j] = arr[idx];
                idx++;
            }
        }
        System.out.println("The 2D Array is : ");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j] +" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m*n];
        System.out.println("Enter the "+m*n+" elements of 1D array : ");
        for(int i=0;i<m*n;i++){
            arr[i]  = sc.nextInt();
        }
        convert1Dto2DArray(arr,n,m);
    }
}
