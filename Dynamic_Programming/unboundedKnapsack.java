package Dynamic_Programming;

public class unboundedKnapsack {
    private static int profit(int i, int[] val, int[] wt, int C,int[][] dp) {
        if(i==wt.length) return 0;
        if(dp[i][C] != -1) return dp[i][C];
        int skip = profit(i+1,val,wt,C,dp);
        if(wt[i]>C) return skip ;  // valid for positive array
        int pick = val[i] + profit(i,val,wt,C-wt[i],dp);
        return dp[i][C] = Math.max(pick,skip);
    }
    public static void main(String[] args) {
        int[] val = {6,3,9,25};
        int[] wt = {2,2,8,9};
        int C = 9;
        int n = wt.length;
        int[][] dp = new int[n][C+1];
        for(int i=0;i< dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(profit(0,val,wt,C,dp));
    }
}
