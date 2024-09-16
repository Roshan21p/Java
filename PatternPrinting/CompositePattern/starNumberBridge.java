package PatternPrinting.CompositePattern;

import java.util.Scanner;

public class starNumberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        int m = n+1;
        n--;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" "+" ");
            }
            for(int j=m;j<=n+m-i;j++){
                System.out.print(j+" ");
            }
            m++;
            System.out.println();
        }
    }
}
