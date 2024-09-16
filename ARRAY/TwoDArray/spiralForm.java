package ARRAY.TwoDArray;

import java.util.Scanner;

public class spiralForm {
    static void printMatrix(int[][] matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] matrix, int r, int c) {
        int minr = 0,maxr = r-1;
        int minc = 0,maxc = c-1;
        while(minr <= maxr && minc <= maxc){
            // left to right
            for(int j=minc;j<=maxc;j++){
                System.out.print(matrix[minr][j]+" ");
            }
            minr++;

            // Top to bottom
            if(minr>maxr || minc>maxc) break;
            for(int i=minr;i<=maxr;i++){
                System.out.print(matrix[i][maxc]+" ");
            }
            maxc--;

            // right to left
            if(minr>maxr || minc>maxc) break;
            for(int j=maxc;j>=minc;j--){
                System.out.print(matrix[maxr][j]+" ");
            }
            maxr--;

            // bottom to top
            if(minr>maxr || minc>maxc) break;
            for(int i=maxr;i>=minr;i--){
                System.out.print(matrix[i][minc]+" ");
            }
            minc++;
        }
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

        System.out.println("Spiral order of the Matrix is : ");
        printSpiralOrder(Matrix,r,c);
    }
}
