package LOOPS;

import java.util.Scanner;

public class FirstNaturalNobyReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        for(int i=n;i>=1;i-=2){
            System.out.println(+i);
        }
    }
}
