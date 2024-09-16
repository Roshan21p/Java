package ArrayAssignment.twod;

import java.util.Scanner;
/*
Given a n*m matrix, return an array of elements containing diagonal traversal of the matrix. (Medium)
Input1:
n = 3
m = 3
arr[]=[[1, 2, 3],[4, 5, 6],[7, 8, 9]]

Expected Output:
[1, 4, 2, 7, 5, 3, 8, 6, 9]
 */
public class diagonaltraversal {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printDiagonalTraversal(int[][] Mat, int r, int c){
        int[] ans = new int[r*c];
        int idx  = 0;
        int row = 0;
        int col = 0;
        while(col < c){
            int i = row;
            int j = col;
            while(i >= 0 && j < c){
                ans[idx++] = Mat[i][j];
                i--;
                j++;
            }
            row++;
            if(row >= r){
                row = r -1;
                col++;
            }
        }
        System.out.println("The diagonal traversal elements is : ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
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

        printDiagonalTraversal(Matrix,r,c);

    }
}
