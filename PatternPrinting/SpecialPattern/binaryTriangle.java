package PatternPrinting.SpecialPattern;

import java.util.Scanner;

public class binaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = (i+1)%2;
            for(int j=0;j<=i;j++){
                System.out.print(a+" ");
                a = 1-a;
            }
            System.out.println();
        }
    }
}
