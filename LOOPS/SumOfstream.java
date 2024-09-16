package LOOPS;

import java.util.Scanner;

public class SumOfstream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =sc.nextInt();
        int sum = 0;
        while(n != -1){
            sum += n;
           n = sc.nextInt();
        }
        System.out.println(+sum);
    }
}
