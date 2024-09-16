package ArrayAssignment.twod;

import java.util.Scanner;
/*
- Given a n*m matrix, return true if the matrix is a Toeplitz matrix. A matrix is called Toeplitz
if every diagonal from top-left to bottom-right has the same elements. (Medium)
Input1:

Expected Output:
n = 3
m = 4
arr[]=[[1, 2, 3, 4],[5, 1, 2, 3],[9, 5, 1, 2]]

true
 */
public class ToeplitzMatrix {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void toeplitzMatrix(int[][] Matrix,int r,int c){
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(Matrix[i][j] != Matrix[i-1][j-1]){
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("True");
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

        toeplitzMatrix(Matrix,r,c);
    }
}
