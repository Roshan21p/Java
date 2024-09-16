package LOOPS;

import java.util.Scanner;

public class Sum1NaturalNobyfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Sum of first natural number :");
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println(+sum);
    }

}
