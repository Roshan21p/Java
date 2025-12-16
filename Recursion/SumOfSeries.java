package Recursion;

import java.util.Scanner;

public class SumOfSeries {
    static int SumSeries(int n) {
        if (n == 0) return 0;
        if (n % 2 == 1) {
            return SumSeries(n - 1) + n;
        }
        return SumSeries(n - 1) - n;
    }
    static int SumSeries1(int n){
        if(n == 0){
            return 0;
        }
        return SumSeries1(n-1) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n is :");
        int n = sc.nextInt();
        System.out.println("The sum of series is : " +SumSeries1(n));
    }
}
