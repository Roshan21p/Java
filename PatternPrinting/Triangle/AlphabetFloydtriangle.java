package PatternPrinting.Triangle;

import java.util.Scanner;

public class AlphabetFloydtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int a = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(a+64)+" ");
                a++;
            }
            System.out.println();
        }
    }
}
