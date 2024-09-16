package PatternPrinting.Assignment;

import java.util.Scanner;

public class alphabetStarBridge15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print((char) (i + 64) + " ");
        }
        System.out.println();
        int m = n + 1;
        n--;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" " + " ");
            }
            for (int j = m; j <= n + m - i; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            m++;
            System.out.println();
        }
    }
}
