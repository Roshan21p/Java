package Dynamic_Programming;

public class Knapsack {
    private static int profit(int i, int[] val, int[] wt, int C,int[][] dp) {
        if(i==wt.length) return 0;
        if(dp[i][C] != -1) return dp[i][C];
        int skip = profit(i+1,val,wt,C,dp);
        if(wt[i]>C) return skip ;  // valid for positive array
        int pick = val[i] + profit(i+1,val,wt,C-wt[i],dp);
        return dp[i][C] = Math.max(pick,skip);
    }

    private static int tabulation(int[] val,int[] wt, int C){
        int n =  wt.length;
        int[][] dp = new int[n][C+1];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){   // J acting as Capacity value
                int skip = (i>0) ? dp[i-1][j] : 0;
                if(wt[i] > j) dp[i][j] = skip;
                else {
                    int pick = val[i] + ((i>0) ? dp[i-1][j-wt[i]] : 0);
                    dp[i][j] = Math.max(pick,skip);
                }
            }
        }

        for(int i=0;i< dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n-1][C];
    }
    public static void main(String[] args) {
        int[] val = {5,3,9,16};
        int[] wt = {1,2,8,10};
        int C = 8;
        int n = wt.length;
        int[][] dp = new int[n][C+1];
        for(int i=0;i< dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(profit(0,val,wt,C,dp));
        System.out.println(tabulation(val,wt,C));
    }
}

