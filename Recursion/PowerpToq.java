package Recursion;
import java.util.Scanner;
public class PowerpToq {

    static int p(int p, int q){
        // TC => O(logn) SC => O(1)
        if(q == 0){
            return 1;
        }
        int smallerP = p(p, q/2);
        if(q%2 == 0){
            return smallerP * smallerP;
        }
        return p * smallerP * smallerP;
    }

    static int pow(int p, int q){
        // TC => O(q)  SC => O(q)
        if(q == 0){
            return 1;
        }
        return p * pow(p,q-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();;

        System.out.println("Power of " +a+ " raise to " + b+ " is : "  +pow(a,b));
        System.out.println("Power of " +a+ " raise to " + b+ " is : "  +p(a,b));
    }
}
