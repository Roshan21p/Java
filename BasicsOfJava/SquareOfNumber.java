package BasicsOfJava;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        double no = sc.nextDouble();
        double square = no*no;
        System.out.println("The square of a number is:"+square);
    }
}
