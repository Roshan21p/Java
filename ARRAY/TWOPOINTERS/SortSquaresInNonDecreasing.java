package ARRAY.TWOPOINTERS;
//GIVEN AN INTEGER ARRAY "a" SORTED IN NO DECREASING ORDER RETURN AN ARRAY OF THE SQUARE OF EACH NUMBER SORTED IN NON DECREASING ORDER
import java.util.Scanner;

public class SortSquaresInNonDecreasing {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" " +arr[i]);
        }
        System.out.println();
    }
    static void swap(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void reverse(int[] arr){
        int left=0,right = arr.length - 1;
        while(left < right){
            swap(arr, left, right);
            left++;
            right--;
        }
    }
    static int[] SortedSquares(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int left = 0,right = n-1,k = 0;
        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a the array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

            System.out.print("Original array : ");
            printArray(arr);

            int[] ans = SortedSquares(arr);
            System.out.print("sorted array : ");
            reverse(ans);
            printArray(ans);

    }
}
