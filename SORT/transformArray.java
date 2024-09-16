package SORT;

import java.util.Arrays;

public class transformArray {
    public static void main(String[] args) {
        int arr[] = {40, 12, 78, 34, 100, 57, 23}; //3,0,5,2,6,4,1
        int n = arr.length;
        int x = 0;
        for (int i = 0; i < n ; i++) {
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > 0 && arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            arr[minIdx] = x--;
        }
        for(int i=0;i<n;i++){
            System.out.print((arr[i] *= (-1))+ " ");
        }
    }
}
