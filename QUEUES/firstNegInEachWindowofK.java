package QUEUES;

import java.util.*;

/*
Given an array arr[]  and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.

Note: If a window does not contain a negative integer, then return 0 for that window

Input: arr[] = [12, -1, -7, 8, -15, 30, 16, 28] , k = 3
Output: [-1, -1, -7, -15, -15, 0]
Explanation:
Window [12, -1, -7] First negative integer is -1.
Window [-1, -7, 8] First negative integer is -1.
Window [-7, 8, -15] First negative integer is -7.
Window [8, -15, 30] First negative integer is -15.
Window [-15, 30, 16] First negative integer is -15.
Window [30, 16, 28] No negative integers, output is 0.
*/
public class firstNegInEachWindowofK {
    public static void basicApproach(int[] arr,int n,int k,int[] ans){
        // basic Approach -> TC->n2
        for(int i=0;i<n-k+1;i++){
            boolean flag = false;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    ans[i] = arr[j];
                    flag = true;
                    break;
                }
            }
            if(!flag) ans[i] = 0;
        }
    }

    public static void queue(int[] arr,int n,int k,int[] ans){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                q.add(i);
            }
        }

        for(int i=0;i<n-k+1;i++){
            if(q.size()>0 && q.peek()<i) q.remove();
            if(q.size()>0 && q.peek() <= i+k-1) ans[i] = arr[q.peek()];
            else ans[i] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        int n  = arr.length;
        int[] ans = new int[n-k+1];
        basicApproach(arr,n,k,ans);
        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
        queue(arr,n,k,ans);
        for (int val : ans) {
            System.out.print(val + " ");
        }

    }
}
