package Recursion;

import java.util.Scanner;

public class PrintRecursivearray {
    static void printArray(int[] arr, int idx){
        if(idx == arr.length) return ;
        System.out.println(arr[idx]);
        printArray(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 6, 7, 8, 9};
        int idx = 0;
        System.out.println("The print Array : ");
        printArray(arr,idx);
    }
}
