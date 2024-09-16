package ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;
/*
Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique
integer)
Input:
5
10
1 2 1 4 5 2 1 1 2 2
Expected Output:
false
 */

public class UniqueIntegers {
    static void uniqueIntegers(int[] arr, int m){
        int n = arr.length;
        int i=0;
        int count = 0;
        while(i < n){
            count++;
            while(i < n-1 && arr[i+1] == arr[i]){
                i++;
            }
            i++;
        }
        if(count >= m){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+ " array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of m ");
        int m = sc.nextInt();
        Arrays.sort(arr);
        uniqueIntegers(arr,m);
    }
}
