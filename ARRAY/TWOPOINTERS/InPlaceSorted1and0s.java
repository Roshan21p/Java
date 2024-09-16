package ARRAY.TWOPOINTERS;

import java.util.Scanner;

public class InPlaceSorted1and0s {
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void InplaceSorted(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        while(left < right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " +n+ " array element");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Original array :");
        printArray(arr);
        InplaceSorted(arr);
        System.out.print("Sorted array :");
        printArray(arr);
    }
}
