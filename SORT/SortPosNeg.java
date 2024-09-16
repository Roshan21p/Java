package SORT;

import java.util.Scanner;
/*
Given an array of positive and ne^ative inte^ers, se^re^ate them in linear time and constant space.
The output should print all ne^ative numbers, folloGed by all positive numbers.
For example,
Input: [ 19, -20, 7, -4, -13, 11, -5, 3 <
Output: [ -20 -4 -13 -5 7 11 19 3 ;
F The idea is to use 0 as a pivot element and make one pass of the partition process. The resultant array Gill
satisfy the ^iven constraints]
F In partition function , each time Ge find a ne^ative number, `pIndex` is incremented and that element Gould
be placed before the pivot

 */
public class SortPosNeg {
    static void display(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }
    static void partition(int[] arr){
        int l=0,r= arr.length-1;
        while(l<r){
            if(arr[l]<0) l++;
            if(arr[r]>=0) r--;
            if(l<r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Before sorted array :");
        display(arr);
        partition(arr);
        System.out.println("After sorted array :");
        display(arr);
    }
}
