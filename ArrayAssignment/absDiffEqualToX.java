package ArrayAssignment;

import java.util.Scanner;
        /*array sorted in increasing order of size n and an integer x, find if there exists a
        pair in the array whose absolute difference is exactly x.(n>1)

         */
public class absDiffEqualToX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array of size : ");
        int n = sc.nextInt();

        int[]  arr = new int[n];
        System.out.println("Enter " +n+ " elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of x : ");
        int x = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j] - arr[i] == x) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
