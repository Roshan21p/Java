package BasicsOfJava;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first numbers");
        int num1 = sc.nextInt();

        System.out.println("enter second numbers");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum:" + sum);
    }
}
