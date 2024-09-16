package LOOPS;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int sumOfDigits = 0;
        int orginal_n = n;
        while(n>0){
            sumOfDigits += n%10;
            n = n/10;
        }
        System.out.println("Sum of Digits in " +orginal_n+ "=" +sumOfDigits);
    }
}
