package Recursion;

import java.util.Scanner;

public class SumOfArray {
    static int sumarray(int[] arr, int idx){
      //  if(idx == arr.length) return 0;
          if(idx == arr.length-1) return arr[idx];

        int smallerAns = sumarray(arr,idx+1);
        return smallerAns + arr[idx];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {4, 6,- 4, 7, 1};
        int idx = 0;
        System.out.println("The Sum Of given Array : " +sumarray(arr,idx));
    }
}
