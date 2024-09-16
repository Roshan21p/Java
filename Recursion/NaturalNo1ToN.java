package Recursion;

import java.util.Scanner;

public class NaturalNo1ToN {
    static void printDecreasing(int n){
        // base case
        if(n == 1){
            System.out.println(1);
            return ;
        }

        // Self work
        System.out.println(n);
        // Recursive work
        printDecreasing(n-1);
    }
    static void printIncreasing(int n){
        // base case
        if(n == 1){
            System.out.println(1);
            return ;
        }
        // Recursive work
        printIncreasing(n-1);
        // Self work
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The first n natural number : ");
      //  printIncreasing(n);
        printDecreasing(n);

    }
}
