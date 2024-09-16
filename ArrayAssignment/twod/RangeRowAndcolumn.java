package ArrayAssignment.twod;

import java.util.Scanner;
/*
Given a 2D array of n rows and m columns, return the sum of elements along the range of row and
column specified.
Input:
n = 3
m = 3
arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
range = [0, 1], [1, 2]
Expected Output:
16
 */
public class RangeRowAndcolumn {
    static void SumOfRangeRowandColumn(int[][] arr, int sr,int er,int sc,int ec){
        int sum = 0;
        while(sr <= er){
            int j = sc;
            while(j <= ec){
                sum += arr[sr][j];
                j++;
            }
            sr++;
        }
        System.out.println("Sum is : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter "+n*m+" elements :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the range of rows from Start to End : ");
        int startRow = sc.nextInt();
        int endRow = sc.nextInt();
        System.out.println("Enter the range of columns from Start to End : ");
        int startColumn = sc.nextInt();
        int endColumn = sc.nextInt();
        SumOfRangeRowandColumn(arr,startRow,endRow,startColumn,endColumn);
    }
}
