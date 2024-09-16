package ArrayAssignment;

import java.util.Scanner;

// Sort array given both positive and negative value place negative values at the end of the array without changing its order

public class sortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter  " +n+ "elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        int idx = 0;

        for(int i=0;i<n;i++){
            if(arr[i] >= 0){
                ans[idx] = arr[i];
                idx++;
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i] < 0){
                ans[idx] = arr[i];
                idx++;
            }
        }

        System.out.println("The Sorted Array After placing the negative value at the end of array :");
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
    }
}
