package Recursion;

import java.util.Scanner;

public class MultipleOfK {
    static void PrintMultiples(int n, int k){
        // base case
     //   if(k == 0) return;
        if(k == 1){
            System.out.println(n*k);
            return ;
        }
        // recursive work
        PrintMultiples(n,k-1);
        //self work
        System.out.println(n * k);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and k : ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("The Multiples of " +n+ " is ");
        PrintMultiples(n,k);
    }
}
