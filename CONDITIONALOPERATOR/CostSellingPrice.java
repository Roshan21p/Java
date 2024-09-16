package CONDITIONALOPERATOR;

import java.util.Scanner;

public class CostSellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("EnterI a cost price :");
        int cp = sc.nextInt();
        System.out.print("Enter a selling price :");
        int sp = sc.nextInt();
        if(sp > cp){
            System.out.print("Your profit is :");
            int profit = sp-cp;
            System.out.println(profit);
        }
        else{
            System.out.print("Your loss is :");
            int loss = cp-sp;
            System.out.println(loss);
        }
    }
}
