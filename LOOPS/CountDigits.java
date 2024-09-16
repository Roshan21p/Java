package LOOPS;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =sc.nextInt();

        int numOfDigits = 0;
        int orginal_n = n;
        while(n>0){
            n = n/10;
            numOfDigits++;  //numOfDigits = numOfDigits +1
        }
        System.out.println("Number of digits in " + orginal_n + "=" + numOfDigits);
    }
}
