package Dynamic_Programming;

public class subsetSum {
    private static boolean subset(int i, int[] arr, int target){
        if(i==arr.length) {
            if(target==0) return true;
            else return false;
        }
         boolean skip = subset(i+1,arr,target);
        if(target-arr[i]<0) return skip;  // Only valid for +ve numbers
        boolean pick = subset(i+1,arr,target-arr[i]);
        return pick || skip;
    }
    private static int subset2(int i, int[] arr, int target){
        if(i==arr.length) {
            if(target==0) return 1;
            else return 0;
        }
        int skip = subset2(i+1,arr,target);
       // if(target-arr[i]<0) return skip;  // Only valid for +ve numbers
        int pick = subset2(i+1,arr,target-arr[i]);
        return (pick+skip);
       // return Math.max(pick , skip);
    }
    private static boolean subset1(int i, int[] arr, int target,int[][] dp){
        if(i==arr.length) {
            if(target==0) return true;
            else return false;
        }
        if(dp[i][target] != -1) return(dp[i][target]==1);
        boolean ans = false;
        boolean skip = subset1(i+1,arr,target,dp);
        if(target-arr[i]<0) return skip;
        else{
            boolean pick = subset1(i+1,arr,target-arr[i],dp);
            ans = pick || skip;
        }
        dp[i][target] = ans ? 1 : 0;
//        if(ans) dp[i][target] = 1;
//        else dp[i][target] = 0;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {8,1,2,7,4,5};
        int target = 10;
        int[][] dp = new int[arr.length][target+1];
        for(int i=0;i< dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(subset2(0,arr,target));
        System.out.println(subset1(0,arr,target,dp));
    }
}
