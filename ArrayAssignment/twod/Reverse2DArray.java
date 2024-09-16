package ArrayAssignment.twod;

import java.util.Scanner;

public class Reverse2DArray {
    static void reverse2DArray(int[][] arr){
        int n = arr.length;
        int m = arr.length;
        for(int i=0;i<n;i++) {
            int a = 0;
            int b = m-1;
            while (a < b) {
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }
        System.out.println("The reverse array elements is :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter "+n*m+" elements :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        reverse2DArray(arr);
    }
}
