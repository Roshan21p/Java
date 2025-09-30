package Recursion.STRING;

import java.util.Scanner;

public class SubSetSum {
    static void subsetSum(int[] arr,int n,int idx, int currSum){
        if(idx == n){
            System.out.print(currSum+" ");
            return;
        }
        // curr idx + currSum
        subsetSum(arr,n,idx + 1,currSum + arr[idx]);

        // curr ans
        subsetSum(arr,n,idx+1,currSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,5};
        int idx = 0;
        int currSum = 0;
        subsetSum(arr,arr.length,idx,currSum);
    }
}
