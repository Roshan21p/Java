package Recursion;
import java.util.Scanner;
public class fibonacciSeries {
    static int fib(int n) {
        // base case
        if (n == 0 || n == 1) {
            return n;
        }
        // subproblems - recursive work
     //   int prev = fib(n - 1);
     //   int prevPrev = fib(n - 2);
        // self work
    //    return prev + prevPrev;

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("The fibonacci series is :");
       for (int i = 0; i <= n; i++) {
            System.out.println(fib(i));
    }
    }
}
