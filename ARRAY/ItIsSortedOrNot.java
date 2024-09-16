package ARRAY;
//CHECK IF THE GIVEN ARRAY IS SORTED OR NOT
import java.util.Arrays;
import java.util.Scanner;

public class ItIsSortedOrNot {

    static int[] smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0],arr[arr.length-1]};
        return ans;
        }

    static boolean sortedOrNot(int[] arr){
        boolean check = true;
       /*
        i = 0
         arr[0] < arr[-1]
       */
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                //not sorted
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array elements : ");
        for(int i=0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
       // System.out.println("Is Sorted " + sortedOrNot(arr));
       // System.out.print("sorted order " +smallestAndLargestElement(arr));
        int[] ans = smallestAndLargestElement(arr);
        System.out.println("smallest: " +ans[0]);
        System.out.println("largest: " +ans[1]);

    }
}
