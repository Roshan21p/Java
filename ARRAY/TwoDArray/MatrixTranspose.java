package ARRAY.TwoDArray;

import java.util.Scanner;

public class MatrixTranspose {
    static void printMatrix(int[][] matrix){
        for(int i=0;i < matrix.length;i++){
            for(int j=0;j < matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void InplaceMatrix(int[][] matrix, int r, int c){
        // Inplace Matrix is apply only for same row and column
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("The Transpose of Matrix is :");
        printMatrix(matrix);
    }
    static int[][] FindTransposeMatrix(int[][] matrix, int r, int c){
        int[][] ans = new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] Matrix = new int[r][c];
        int totalElements = r*c;
        System.out.println("Enter " + totalElements + " values in matrix ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix Elements is : ");
        printMatrix(Matrix);

       // System.out.println("The Transpose of Matrix is :");
    //    printMatrix(FindTransposeMatrix(Matrix,r,c));

//        System.out.println("The Transpose of Matrix is :");
      InplaceMatrix(Matrix,r,c);
    }
}
