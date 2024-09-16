package ARRAY.TwoDArray;

import java.util.Scanner;

public class RotateMatrix90 {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void InplaceMatrix(int[][] matrix, int r, int c){
        // Inplace Matrix is apply only for same row and column
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    static void reverseArray(int[] arr){
        int i = 0,j= arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
static void rotate(int[][] matrix , int n){
        //transpose
    InplaceMatrix(matrix , n, n);
    //reverse each row of transpose matrix
    for(int i=0;i<n;i++){
        reverseArray(matrix[i]);
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] Matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " values in matrix ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix Elements is : ");
        printMatrix(Matrix);

        rotate(Matrix,r);

        System.out.println("Rotation of matrix :");
        printMatrix(Matrix);

    }
}