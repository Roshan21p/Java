package ARRAY.TWOPOINTERS;
// GIVEN AN ARRAY OF INTEGERS "a" MOVE ALL THE EVEN INTEGERS AT THE BEGINNING OF THE ARRAY FOLLOWED BY ALL THE ODD INTEGERS . THE RELATIVE ORDER OF ODD OR EVEN INTEGERS DOES NOT MATTER, RETURN AN ARRAY THAT SATISFIES THE CONDITION

import java.util.Scanner;

public class EvenOdd {
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
    static void EvenOddPartiy(int[] arr){
        int n = arr.length;
        int left = 0 , right = n-1;
        while(left < right){
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 == 1){
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
        EvenOddPartiy(arr);
        System.out.print("Sorted array :");
        printArray(arr);
    }
}
