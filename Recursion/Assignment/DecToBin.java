package Recursion.Assignment;

import java.util.Scanner;

public class DecToBin {
    static int findIterative(int n) {
        int result = 0;
        int multiplier = 1; // equivalent to multiplying previous result by 10

        while (n > 0) {
            int remainder = n % 2;
            result = remainder * multiplier + result;
            multiplier *= 10;   // move to next decimal place
            n = n / 2;
        }

        return result;
    }
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
