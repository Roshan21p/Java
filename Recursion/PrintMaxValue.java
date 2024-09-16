package Recursion;

import java.util.Scanner;

public class PrintMaxValue {
    static int maxValue(int[] arr, int idx){
     //   if(idx == arr.length) return Integer.MIN_VALUE;
        if(idx == arr.length-1) return arr[idx];
        int smallAns = maxValue(arr,idx+1);
        return Math.max(arr[idx],smallAns);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {21, 10, 4, 5, 6};
        int idx = 0;
        System.out.println("The Maximum value of array : " +maxValue(arr,idx));
    }
}
