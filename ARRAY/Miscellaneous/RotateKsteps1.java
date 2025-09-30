package ARRAY.Miscellaneous;

import java.util.Scanner;

public class RotateKsteps1 {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void reverseArray(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static int[] rotate(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        // reverse n-k-1 elements
        reverseArray(arr,0,n-k-1);
        printArray(arr);
        // reverse n-k elements
        reverseArray(arr,n-k,n-1);
        printArray(arr);
        // reverse entire array
        reverseArray(arr,0,n-1);
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " +n+ "array element:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.print("Enter k:");
        int k = sc.nextInt();
       int[] ans =  rotate(arr,k);
       printArray(ans);
    }
}
