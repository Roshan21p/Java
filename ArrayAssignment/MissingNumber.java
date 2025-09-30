package ArrayAssignment;

import java.util.Scanner;
//- Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
//missing number from the first N integers. There are no duplicates in the list.
public class MissingNumber {
    static void findMissingNumber(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(Math.abs(arr[i]) -1 == arr.length){
                continue;
            }
            int index = Math.abs(arr[i]) - 1;
            arr[index] = arr[index] * -1;
        }

        System.out.println("Array Elements");
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] >  0){
                ans = i + 1;
                System.out.println("Missing Number is :" +ans);
                return;
            }
        }
        System.out.println(arr.length + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N (1 to N): ");
        int n  = sc.nextInt();

        int[] arr = new int[n-1];
        System.out.println("Enter " +(n-1)+ " Elements");
        for(int i=0;i<n-1;i++){

            arr[i] = sc.nextInt();
        }
        findMissingNumber(arr);

    }
}
