package ARRAY.TwoDArray;
// Given a positive integer n, generate an N*N matrix filled filled with elements from 1 to n^2 in spiral order
/*  1  =>  2  =>  3
                  |
    8  =>  9      4
    |             |
    7   <= 6  <=  5

 */
import java.util.Scanner;

public class CreateMatrixSpiralOrder {
    static void printMatrix(int[][] matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] generateSpiralOrder(int n) {
        int [][] matrix = new int[n][n];

        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int curr = 1;
        while (curr <= n*n) {
            // topRow => leftCol to rightCol
            for (int j = leftCol; j <= rightCol &&  curr <= n*n ; j++) {
                matrix[topRow][j] = curr;
                curr++;
            }
            topRow++;

            // rightCol => topRow to bottomRow
            for (int i = topRow; i <= bottomRow && curr <= n*n; i++) {
                matrix[i][rightCol] = curr;
                curr++;
            }
            rightCol--;

            // bottomRow => rightCol to leftCol
            for (int j = rightCol; j >= leftCol && curr <= n*n; j--) {
                matrix[bottomRow][j] = curr;
                curr++;
            }
            bottomRow--;

            // leftCol => bottomRow to topRow
            for (int i = bottomRow; i >= topRow && curr <= n*n; i--) {
                matrix[i][leftCol] = curr;
                curr++;
            }
            leftCol++;

        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value of n : ");
        int n = sc.nextInt();

        int[][] matrix = generateSpiralOrder(n);
        printMatrix(matrix);
    }
}
