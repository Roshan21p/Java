package ARRAY.arrayManipulation;

import java.util.Scanner;

public class SecondSmallestElement {
    //    static int FindMinNo(int[] arr) {
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        return min;
//    }
//
//    static int secondSmallestNo(int[] arr) {
//        int min = FindMinNo(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == min) {
//                arr[i] = Integer.MAX_VALUE;
//            }
//        }
//        int secondmim = FindMinNo(arr);
//        return secondmim;
//    }
    static int secondSmallestNo(int[] arr) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstMin) {
                secondMin = firstMin;
                firstMin = arr[i];
            } else if (arr[i] < secondMin && firstMin != arr[i]) {
                secondMin = arr[i];
            }
        }
        return secondMin;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array of size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the array element :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The second Smallest number is : " + secondSmallestNo(arr));
    }

}

