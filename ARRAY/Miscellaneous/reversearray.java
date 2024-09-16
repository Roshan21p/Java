package ARRAY.Miscellaneous;


import java.util.Scanner;

public class reversearray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array of size :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the array element:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The reverse array are :");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
