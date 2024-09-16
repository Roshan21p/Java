package Dynamic_Programming;

public class longestCommonSubString {
    public static int lcs(String s1,String s2){
        int n = s1.length(), m = s2.length();
        int[][] dp = new int[n+1][m+1];
        int max = 0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = 0;
                max = Math.max(max,dp[i][j]);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s1 = "abcde";  // fabgdk
        String s2 = "ace";    //abcde
        String ans = "";
        ans += s2.substring(0,3);
        System.out.println(ans);
        //System.out.println(lcs(s1,s2));
    }
}
