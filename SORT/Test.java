package SORT;
import java.util.*;
public class Test {
    public static void main(String[] args){
        int[] arr = { 19, -20, 7, -4, -13, 11, -5, 3 };
        int n = arr.length;
        partition(arr, 0, n - 1);
        // print the rearranged array
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
    public static void partition(int[] arr, int s, int e){
        int pIndex= s;
        // each time we find a negative number, `pIndex` is incremented,
        // and that element would be placed before the pivot
        for (int j = s; j <= e; j++) {
            if (arr[j] < 0){    // pivot is 0
                int temp = arr[j];
                arr[j] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }
    }
}

