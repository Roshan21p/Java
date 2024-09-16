package SORT;
/*
given an integer array , arr  move all 0's to the end of it while maintaining the relative order of the non zero elements
NOTE THAT YOU DO THIS IN PLACE WITHOUT MAKING A COPY OF THE ARRAY

INPUT : 0 5 0 3 4 2      OUTPUT : 5 3 4 2 0 0
 */
import java.util.Scanner;

public class ZerosAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0, 5, 0, 3, 4, 2};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(" The sort 0's at the end is : ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
