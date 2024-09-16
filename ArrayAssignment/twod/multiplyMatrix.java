package ArrayAssignment.twod;

import java.util.Scanner;
/*
Q1 - Given two integer matrices, multiply the matrices, if possible, else return “Invalid Input”. (Medium)
Assignment Solutions

Input1:

Expected Output:
n1 = 2
m1 = 3
arr1 = {{2,4,1}, {3,,6}}
n2 = 3
m2 = 2
arr2 = {{1,2}, {3,4}, {,7}}

19 27
48 68
 */
public class multiplyMatrix {
    static void printMatrix(int[][] matrix){
        for(int i=0;i < matrix.length;i++){
            for(int j=0;j < matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static void MultiplicationMatrix(int[][] a,int r1,int c1,int[][]b,int r2,int c2 ){
        if(c1 != r2){
            System.out.println("Invalid Input");
            return;
        }
        int[][] ans = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    ans[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("The Multiplication of Matrix 1 and 2 : ");
        printMatrix(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows and columns of 1 : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];
        System.out.println("Enter the elements of matrix 1 : ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the numbers of rows and columns of 2 : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];
        System.out.println("Enter the elements of matrix 2");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1 : ");
        printMatrix(a);
        System.out.println("Matrix 2 : ");
        printMatrix(b);

        MultiplicationMatrix(a,r1,c1,b,r2,c2);
    }
}
