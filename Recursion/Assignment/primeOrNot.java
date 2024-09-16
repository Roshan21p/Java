package Recursion.Assignment;

import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = scn.nextInt();
        if (isPrime(n, 2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean isPrime(int n, int i) {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        // Check for next divisor
        return isPrime(n, i + 1);
    }
}
