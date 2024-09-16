package ARRAY;

import java.util.Scanner;

public class SumTripletsEqualX {
    static int SumTriplets(int[] arr, int target){
        int ans = 0;
        int n = arr.length;
        for(int i=0;i<arr.length;i++) { // first number
            for (int j = i + 1; j < arr.length; j++) {//second number
                for(int k=j+1;k<n;k++){ //third number
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array of size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the array element :");
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        System.out.println("The total no of triplets pairs is : " +SumTriplets(arr,target));
    }
}
