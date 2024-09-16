package ArrayAssignment.twod;

import java.util.Scanner;
/*
- Given a square matrix, rotate it by 90 degrees in anti clockwise direction. (Medium)
Input1:

Expected Output:

// Store current cell in temp variable
// Move values from right to top
n = 3
m = 3
matrix = [[1,2,3],[4,5,6],[7,8,9]]

3 6 9
2 5 8
1 4 7
 */
public class RotateMatrix90anti {

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
    static void reverseArray(int[] arr) {
        int i = 0,j= arr.length-1;
        while(i < j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }

    static void rotateAntiClockwise(int[][] matrix,int r){
        //reverse each row of transpose matrix
        for(int i=0;i<r;i++){
            reverseArray(matrix[i]);
        }
        // trranspose
          InplaceMatrix(matrix,r,r);
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

         rotateAntiClockwise(Matrix,r);

        System.out.println("Rotation of matrix in antiClockwise :");
        printMatrix(Matrix);
    }
}
