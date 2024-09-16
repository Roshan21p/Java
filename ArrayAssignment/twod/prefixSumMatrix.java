package ArrayAssignment.twod;

import java.util.Scanner;

public class prefixSumMatrix {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void PrefixSumMatrix(int[][] Matrix){
        int rows = Matrix.length;
        int cols = Matrix[0].length;

        int[][] ans = new int[rows][cols];

        for(int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                ans[i][j] += Matrix[i][j];
                 if (i > 0) {
                    ans[i][j] += ans[i - 1][j];
                } if (j > 0) {
                    ans[i][j] += ans[i][j - 1];
                }
                if(i>0 && j>0) {
                    ans[i][j] -= ans[i - 1][j - 1];
                }
            }
        }
        printMatrix(ans);
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

        PrefixSumMatrix(Matrix);


    }
}
