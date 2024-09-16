package Recursion;

import java.util.Scanner;

public class CountOfDigits {
    static int cod(int n){
        if(n >= 0 && n<= 9){
            return 1;
        }
        return cod(n/10) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("The count of digits is : " +cod(n));
    }
}
