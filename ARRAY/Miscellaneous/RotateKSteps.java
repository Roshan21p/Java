package ARRAY.Miscellaneous;

import java.util.Scanner;

public class RotateKSteps {
   static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] rotate(int[] arr,int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {  //i <= n-1
            ans[j++] = arr[i];
        }
        //printArray(arr);
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;

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

        int[] ans = rotate(arr,k);
//        System.out.println("Array after rotation :");
//        for (int i = 0; i < ans.length; i++) {
//            System.out.println(ans[i] + " ");
//        }
 printArray(ans);
        }


    }

