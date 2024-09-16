package ArrayAssignment;

import java.util.Scanner;
/*
Given an array sorted in increasing order, return an array of squares of each number sorted in increasing
order
Input:
N = 6
Arr[] = [-5, -2, -1, 0, 4, 6]
Expected Output:
[0, 1, 4, 16, 25, 36]
 */

public class SquaresOfNo {
    static void SortedSquares(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = arr[i] * arr[i];
        }
        int temp =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            if(ans[i] > ans[j]){
                temp = ans[j];
                ans[j] = ans[i];
                ans[i] = temp;
            }
        }


        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }


        SortedSquares(arr);
    }
}
