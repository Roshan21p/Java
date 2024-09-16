package Recursion.Assignment;

import java.util.Scanner;

public class DecToBin {
    static int find(int n){
        if(n==0) return 0;
        return (n%2 + 10 * find(n/2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n  = sc.nextInt();
        System.out.println(find(n));
    }
}
