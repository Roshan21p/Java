package ARRAY.Miscellaneous;
//Reverse an array consisting of integer values
import java.util.Scanner;

public class ReverseIntegerArray {
    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        //Traverse orignal array in reverse direction
        for(int i=n-1;i>=0;i--){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
      //  int[] arr = {1,2,3,4,5};
        int[] arr = new int[n];
        System.out.println("Enter " +n+  " array elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
     //   int[] ans = reverseArray(arr);
        System.out.print("The reverse array is:");
        for(int i=0;i<reverseArray(arr).length;i++){
            System.out.print(reverseArray(arr)[i] + " ");
        }
    }
}
