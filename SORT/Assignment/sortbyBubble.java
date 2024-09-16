package SORT.Assignment;

import java.util.Scanner;

public class sortbyBubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        String arr[] = new String[n];
        System.out.println("Enter the elements of array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
//        String[] arr = {"kiwi", "apple", "papaya", "mango"};
//        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1].compareTo(arr[j]) < 0){
                    String temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (String val :arr) {
            System.out.print(val + " ");
        }
    }
}
