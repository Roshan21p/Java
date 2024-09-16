package Recursion.Assignment;

import java.util.Scanner;

public class CheckAmstrong {
    static int pow(int a,int b){
        if(b==0) return 1;
        if(b%2==0) return pow(a,b/2) * pow(a,b/2);
        else return a * pow(a,b/2) * pow(a,b/2);
    }
    static int isArmstrong(int n,int digits){
        if(n == 0) return 0;
        return pow(n%10,digits) + isArmstrong(n/10,digits);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int digits = 0;
        int temp = n;
        while(temp > 0){
            digits++;
            temp/=10;
        }

        if(n == isArmstrong(n,digits)){
            System.out.println("Enter the number is Armstrong");
        }
        else   System.out.println("Enter the number is not Armstrong");
    }
}
