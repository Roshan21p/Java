package Dynamic_Programming;

import java.util.*;

public class countDerangements {
    public static int ways(int n,int[] dp){
        if(n>=0 && n<=1) return 0;
        if(n==2) return 1;
        if(dp[n] != -1) return dp[n];
        return dp[n] = (n-1)*(ways(n-1,dp) + ways(n-2,dp));
    }

    public static int ways1(int n){
        if(n>=0 && n<=1) return 0;
        if(n==2) return 1;
        int[] dp = new int[n+1];
        dp[2] = 1;
        for(int i=3;i<=n;i++){
            dp[i] = (i-1)*(dp[i-1] + dp[i-2]);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(ways(n,dp));
        System.out.println(ways1(n));
    }
}
