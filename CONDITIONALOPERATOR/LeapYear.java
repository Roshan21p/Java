package CONDITIONALOPERATOR;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n%4==0){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }

    }
}
