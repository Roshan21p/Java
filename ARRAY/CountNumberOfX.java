package ARRAY;
// Q.Cont the number of occurences of anparticular element x
import java.util.Scanner;

public class CountNumberOfX {

     static int countOccurences(int[] arr, int x){
         int count = 0;
         for(int i=0;i < arr.length;i++){
             if(arr[i] == x){
                 count++;
             }
         }
         return count;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " +n+ " elements:");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x");
        int x = sc.nextInt();

        System.out.println("COUNT OF X :" +countOccurences(arr,x));
    }
}
