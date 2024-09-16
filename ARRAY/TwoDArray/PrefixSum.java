package ARRAY.TwoDArray;
// 1. Given a martix "a" of dimension n * m and 2 coordinates (l1,r1) and (l2,r2) Return the sum of the rectangle from (l1,r1) to (l2,r2)
// where (l2 >= l1 ; r2 >= r1)    (0 <= l1,l2 < n)    (0 <= r1,r2 < n)
// 2. Pre-calculating the horizontal sum for each row in the matrix
// 3. Prefix sum over column and rows both
import java.util.Scanner;

public class PrefixSum {
    static int findSum(int[][] matrix,int l1, int r1, int l2, int r2){
        int sum = 0;
        for(int i = l1; i <= l2; i++){
            for(int j = r1; j <= r2; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    static void findPrefixSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        // traverse horizontally to calculate row-wise prefix-sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];

            }
        }
    }
    // calculate row-wise and column-wise sum
    // matrix[i][j] = sumRectangle( (0,0) (i,j))
    static void findPrefixSum2(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        // traverse horizontally to calculate row-wise prefix-sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j] += matrix[i][j-1];

            }
        }
        // traverse vertically to calculate column-wise sum
        for(int j = 0; j < c; j++){
            for(int i = 1; i < r; i++){
                matrix[i][j] +=  matrix[i-1][j];
            }
        }
    }
    static int findSum1(int[][] matrix,int l1, int r1, int l2, int r2){
        int sum = 0;
        findPrefixSum(matrix);
        for(int i = l1; i <= l2; i++){

            // r1 to r2 sum of row i
            if(r1 >= 1)
            sum += matrix[i][r2] - matrix[i][r1-1];
            else
                sum += matrix[i][r2];
        }
        return sum;
    }
    static int findSum2(int[][] matrix,int l1, int r1, int l2, int r2){
        int ans = 0, sum = 0, up = 0, left = 0, leftUp = 0;
        findPrefixSum2(matrix);

        sum = matrix[l2][r2];
        if(r1 >= 1){
            left = matrix[l2][r1 - 1];
        }
        if(l1 >= 1){
            up = matrix[l1-1][r2];
        }
        if(l1 >= 1 && r1 >= 1){
            leftUp = matrix[l1-1][r1 - 1];
        }
        ans = sum - up - left + leftUp;

        return ans;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number rows and columns of matrix : ");
        int r = sc.nextInt();
        int c= sc.nextInt();

        int[][] matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " value of matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter rectangle boundaries l1, r1, l2, r2 : ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle sum " + findSum(matrix, l1, r1, l2, r2));
       // System.out.println("Rectangle1 sum " + findSum1(matrix, l1, r1, l2, r2));
        System.out.println("Rectangle2 sum " + findSum2(matrix, l1, r1, l2, r2));

    }
}
