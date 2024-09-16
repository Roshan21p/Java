package LOOPS;

import java.util.Scanner;

public class aRaisedToPowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first value:");
        int a = sc.nextInt();
        System.out.println("Enter a second value:");
        int b = sc.nextInt();

        int ans = 1;
        for(int i=1;i<=b;i++){
            ans *= a;
        }
        System.out.println(ans);
    }
}
