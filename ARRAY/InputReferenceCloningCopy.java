package ARRAY;


import java.util.Arrays;
import java.util.Scanner;

public class InputReferenceCloningCopy {

    static void printArray(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  System.out.println("enter the size of array:");
       // int n = sc.nextInt();
        int[] arr = new int[5];

        arr[0] = 5; arr[1] = 6; arr[2] = 7; arr[3] = 8; arr[4] = 9;
       /* System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
       }*/
        System.out.println("Orginal arr");
        printArray(arr);

        //trying to copy arr to arr_2
        //Arrays.copy(arr, arr.length)
        int[] arr_2 = Arrays.copyOf(arr, arr.length); // nOT TO CHANGE VALUE OF ARR IN arr WE USE arr.clone() also known as deep copy
        System.out.println("Copied arr_2");
        printArray(arr_2);

      //changing some value of arr_2
        arr_2[0] = 0;
        arr_2[1] = 0;

        System.out.println("Orginal array after changing arr_2");
        printArray(arr);

        System.out.println("Copied array after changing arr_2");
        printArray(arr_2);

    }
}
