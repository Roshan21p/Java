package BinarySearch;

import java.util.Scanner;

public class firstOcc {
    static int firstOcc(int[] arr,int target){
        int n = arr.length;
        int st =0,end = n-1;
        int fo=-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] == target){
                fo = mid;
                end = mid - 1;
            }
            else if(target < arr[mid]) end = mid-1;
            else st = mid+1;
        }
        return fo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,10,20,20,20,20,20,30,30,30,40,40};
//        System.out.println("Enter the length of array :");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements of array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the target element :");
        int t = sc.nextInt();
        System.out.println(firstOcc(arr,t));
    }
}
