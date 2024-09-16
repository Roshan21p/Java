package CONDITIONALOPERATOR;

import java.util.Scanner;

public class DivisbleBy5Notby3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number :");
        int n = sc.nextInt();
        if(n%5==0 && n%3!=0){
            System.out.println("It is divisible by 5 not by 3");
        }
        else{
            System.out.println("Cannot be divisible by any number");
        }
    }
}
