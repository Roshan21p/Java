package ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class kthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array of size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " +n+ " elements");
        for(int i=0;i<n;i++){
            arr[i]  = sc.nextInt();
        }
        System.out.println("Enter the value of k in the array");
        int k = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Kth smallest elements in the array is : "+arr[k-1]);
    }
}
