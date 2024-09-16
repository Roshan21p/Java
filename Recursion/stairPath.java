package Recursion;

import java.util.Scanner;

public class stairPath {
    public static int countStair(int n){
        if(n<=2) return n;
        return countStair(n-1) + countStair(n-2);
    }
    public static int countStair1(int n){ // for 1 Jump 0r 3 Jump
        if(n<=2) return 1;
        if(n==3) return 2;
        return countStair1(n-1) + countStair1(n-3);
    }
    public static int countStair2(int n){ // for 1 Jump , 2 Jump 0r 3 Jump
        if(n==0) return 1;
        else if(n<0) return 0;
        return countStair2(n-1) + countStair2(n-2) + countStair2(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("The total number of ways : "+countStair2(n));
    }
}
