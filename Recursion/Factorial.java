package Recursion;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        // base case
        if(n == 0 ){
            return 1;
        }
        //return n * factorial(n-1);
        // subproblems => Recursive work
        int smallAns = factorial(n-1);
        // Self work
        int ans = n * smallAns;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("The factorial of number : " + factorial(n));
    }
}
