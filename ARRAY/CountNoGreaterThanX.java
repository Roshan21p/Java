package ARRAY;

import java.util.Scanner;

// COUNT THE NUMBER OF ELEMENTS STRITCLY GREATER THAN VALUE X
public class CountNoGreaterThanX {

    static int countNumberGreaterThanX(int[] arr, int x){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array of size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array elements : ");
        for(int i=0;i < arr.length;i++){
             arr[i] = sc.nextInt();
        }

        System.out.println("Enter x");
        int x = sc.nextInt();

        System.out.println("COUNT THE VALUE WHICH IS GREATER THAN X :"+countNumberGreaterThanX(arr,x));
    }
}
