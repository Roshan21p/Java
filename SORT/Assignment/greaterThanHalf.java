package SORT.Assignment;

import java.util.Scanner;
/*
Q4 - Given an array of n elements, the task is to find the elements that are greater than half of elements in an array.
In case of odd elements, we need to print elements larger than floor(n/2) elements where n is total number of elements in array.
 */
public class greaterThanHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j]  = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        int ans = 0;
        if(n%2 == 0) ans = n/2;
        for(int i = ans ;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
