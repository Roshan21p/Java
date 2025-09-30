package ARRAY.TwoDArray;
//GIVEN AN INTEGER n, return THE FIRST n ROWS OF PASCAL'S TRIANGLE. IN PASCAL TRIANGLE EACH NUMBER IS THE SUM OF THE TWO NUMBERS DIRECTLY ABOVE IT
/*  1. p[i][j] = p[i-1][j-1] + p[i-1][j]
    2. In every row first & last element = 1
    3. Jagged array => ith row has (i+1)
 */
import java.util.Scanner;

public class PASCALTRIANGLE {
    static void printMatrix(int[][] matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
//    static int[][] pascal(int n){
//        int[][] ans = new int[n][];
//        for(int i=0;i<n;i++){
//            ans[i] = new int[i+1];   // ith row has i+1 column
//            ans[i][0] = ans[i][i] = 1;  //  1st and last element of every row is 1
//
//            for(int j=1;j<i;j++){
//                ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
//            }
//        }
//        return ans;
//    }

    static int[][] pascal(int n){
        int[][] ans = new int[n][];
        for(int i=0;i<n;i++){
            ans[i] = new int[i + 1];
            for(int j=0;j<i+1;j++){
                if(i==j || j==0) ans[i][j] =1;
                else ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value of n :");
        int n = sc.nextInt();

        int[][] ans = pascal(n);
        System.out.println("Print the Pascal Triangle : ");
        printMatrix(ans);
    }
}
