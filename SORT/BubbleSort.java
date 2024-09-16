package SORT;

import java.util.Scanner;

public class BubbleSort {
    static void bubblesort(int[] arr){
        int n = arr.length;
        // n-1 iterations /passes
        for(int i=0;i<n-1;i++){
            boolean flag = false;
            // has any swapping happened
            for(int j=0;j<n-i-1;j++){
                /*
                last i elements are already at correct sorted positions so need to check them
                 */
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                    // some swap has happened
                }
            }
            if(flag == false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array of size :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubblesort(arr);
        System.out.println("The sort array is : ");
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i] + " ");
//        }
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
