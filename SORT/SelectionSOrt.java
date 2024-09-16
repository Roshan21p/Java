package SORT;

import java.util.Scanner;

public class SelectionSOrt {
    static void Selectionsort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            boolean flag = false;
            /*
            i represent the current index
            Find the minimum element i unsorted part of array
             */
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                    flag = true;
                }
            }
            // swap current element and minimum element => current index i will have correct element
            // arr[min_index] , arr[i]
            if (flag == true) {
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
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
        Selectionsort(arr);
        System.out.println("The sort array is : ");
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i] + " ");
//        }
        for (int i : arr){
            System.out.println(i + " ");
        }
    }
}

