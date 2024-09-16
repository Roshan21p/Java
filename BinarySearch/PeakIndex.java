package BinarySearch;

import java.util.Scanner;

public class PeakIndex {
    static int mountainArray(int[] arr){
        int n = arr.length-1;
        int st = 0,end =n-1;
        int ans = -1;
        while(st <= end){
            int mid= st +(end-st)/2;
            if(arr[mid] < arr[mid+1]){
                ans = mid+1;
                st = mid +1;
            } else end  = mid -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("The Peak index element :");
        System.out.println(mountainArray(arr));
    }
}
