package ArrayAssignment.twod;

import java.util.Scanner;
/*
Check if an element x exists in the given matrix or not. If it does not exist, return -1, else return its
row and column index.
Input:
x = 12
arr[][] = {{3, 8, 0}, {6, 3, 2}, {12, 9, 10}}
Expected Output:
Row = 2
Column = 0
 */
public class XexistsorNot {

    static void AnotherMethodtoCheckElementExitsorNot(int[][] arr, int x){
        int n = arr.length;
        int m = arr.length;
        int i=0;
        int j = m-1;
       while(i<n && j>=0) {
           if (arr[i][j] == x) {
               System.out.println("Row is :" + i);
               System.out.println("Column is :" + j);
               return;
           } else if(arr[i][j] > x){
               j--;
           } else {
               i++;
           }
       }
        System.out.println("-1");
    }

//    static void CheckElementExitsorNot(int[][] arr, int x){
//        for(int i=0;i< arr.length;i++){
//            for(int j=0;j< arr.length;j++){
//                if(arr[i][j] == x){
//                    System.out.println("Row is :"+i);
//                    System.out.println("Column is :"+j);
//                    return;
//                }
//            }
//        }
//        System.out.println("-1");
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter the element to be searched in the array :");
        int x = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter "+n*m+" elements :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
//        CheckElementExitsorNot(arr,x);
        AnotherMethodtoCheckElementExitsorNot(arr,x);
    }
}
