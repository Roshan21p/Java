package ARRAY.TWOPOINTERS;

import java.util.Scanner;

public class Sorted1and0s {
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZeroesAndOnes(int[] arr){
        int n = arr.length;
        int Zeroes = 0;
        //count number of zeroes
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                Zeroes++;
            }
        }
        //0 to zeroes-1 : 0; zeroes to n-1 : 1
        for(int i=0;i<n;i++){
            if(i < Zeroes){
                arr[i] = 0;
            }
            else{
                arr[i] =1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " +n+ " array element");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Original array :");
        printArray(arr);
        sortZeroesAndOnes(arr);
        System.out.print("Sorted array :");
        printArray(arr);
    }
}
