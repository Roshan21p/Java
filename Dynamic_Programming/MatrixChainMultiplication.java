package Dynamic_Programming;

import java.util.Arrays;

public class MatrixChainMultiplication {
    // MCM for 2D array
    public static int minCuts(int i,int j,int[][] arr,int[][] dp){
        if(i>=j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int minCost = Integer.MAX_VALUE;

        for(int k=i;k<j;k++){
            int x = arr[i][0] * arr[k][1] *  arr[j][1] ;
            int totalCost = minCuts(i,k,arr,dp) + minCuts(k+1,j,arr,dp) + x;
            minCost = Math.min(minCost,totalCost);
        }
       return dp[i][j] =  minCost;
    }

    // MCM for 2D array by tabulation
    public static int minCutsByTabulation(int[][] arr){
        int n = arr.length;
        int[][] dp = new int[n][n];

        // In tabulation the loop we travel in reverse of Recursion + memoization
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=n-1;j++){
                if(i>=j) {
                    dp[i][j] = 0;
                    continue;
                }
                int minCost = Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int x = arr[i][0] * arr[k][1] *  arr[j][1] ;
                    int totalCost = dp[i][k] + dp[k+1][j] + x;
                    minCost = Math.min(minCost,totalCost);
                }
                dp[i][j] = minCost;
            }
        }
        return dp[0][n-1];
    }

    // MCM for 1D array
    public static int minCuts1(int i,int j,int[] arr, int[][] dp){
        if(i>=j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int minCost = Integer.MAX_VALUE;

        for(int k=i;k<j;k++){
            int x =  arr[i] * arr[k+1] * arr[j+1];
            int totalCost = minCuts1(i,k,arr,dp) + minCuts1(k+1,j,arr,dp) + x;
            minCost = Math.min(minCost,totalCost);
        }
        return dp[i][j] =  minCost;
    }

    // MCM for 1D array by tabulation
    public static int minCuts1ByTabulation(int[] arr){
        int n = arr.length;
        int[][] dp = new int[n-1][n-1];

        // In tabulation the loop we travel in reverse of Recursion + memoization
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=n-2;j++){
                if(i>=j) {
                    dp[i][j] = 0;
                    continue;
                }
                int minCost = Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int x = arr[i] * arr[k+1] *  arr[j+1] ;
                    int totalCost = dp[i][k] + dp[k+1][j] + x;
                    minCost = Math.min(minCost,totalCost);
                }
                dp[i][j] = minCost;
            }
        }
        return dp[0][n-2];
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,3},{3,4},{4,2}};
        int[] arr1 = {1,2,3,4,2};  // In this we 4 Matrix
        int n = arr.length;
        // for 2D array using Recursion + Memoization
        int[][] dp = new int[n][n];
        for(int[] ele : dp) Arrays.fill(ele,-1);


        // for 1D array using Recursion + Memoization
        int m = arr1.length;
        int[][] dp1 = new int[m-1][m-1];
        for(int[] ele : dp1) Arrays.fill(ele,-1);

        System.out.println(" Minimum cuts in MCM for 2D array : "+minCuts(0,n-1,arr,dp));
        System.out.println(" Minimum cuts in MCM for 1D array : "+minCuts1(0,m-2,arr1,dp1));
        System.out.println(" Minimum cuts in MCM for 1D array by tabulation : "+minCuts1ByTabulation(arr1));
        System.out.println(" Minimum cuts in MCM for 2D array by tabulation : "+minCutsByTabulation(arr));
    }
}
