package Recursion.Assignment;

import java.util.Scanner;
/*
Find m-th summation of first n natural numbers where m-th summation of first n natural
numbers is defined as following:
If m > 1: SUM(n, m) = SUM(SUM(n, m - 1), 1)
Else :SUM(n, 1) = Sum of first n natural numbers.
Input n = 3, m = 2
Expected Output =  21
 */
public class FindMsummation {

    public static int rec(int n, int m) {
        if (m == 1)
            return sumofn(n);

       // return rec(rec(n, m - 1),1);
        // OR ANOTHER METHOD
         int sum = rec(n,m-1);
        return sumofn(sum);
    }
    public static int sumofn(int n){
        if(n == 1){
            return 1;
        }
        return n + sumofn(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n and m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(rec(n, m));
    }
}
