package ARRAY.Miscellaneous;
// GIVEN 2 INTEGERS a AND b SWAP THE 2 GIVEN VALUES USING SUM AND DIFFERNCE METHOD
import java.util.Scanner;

public class SwapSumDifference {
    static void swapUsingSumDiff(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Values after swap : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        swapUsingSumDiff(a,b);

    }
}
