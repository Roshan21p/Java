package BasicsOfJava;

import java.util.Scanner;

public class FindRemainder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter dividend:");
        int a = sc.nextInt();
        System.out.println("Enter divisor:");
        int b = sc.nextInt();
        int q = a/b;
        // Divisor = dividend*quotient + remainder
        int r = a - (b*q);
        System.out.println("The remiander when "+a+" is dividend by "+b+" is :"+r);
    }
}
