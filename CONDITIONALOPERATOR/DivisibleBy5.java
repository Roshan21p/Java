package CONDITIONALOPERATOR;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("Entered number is divisible by 5");
        }
        else{
            System.out.println("Entered number is not divisible by 5");
        }
    }
}
