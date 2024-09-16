package LOOPS;
import java.util.Scanner;

public class FirstNnaturalsNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number :");
        int n = sc.nextInt();
        System.out.println("first n natural numbers are ");
        for(int i=1;i<=n;i++)
            System.out.println(+i);
    }
}
