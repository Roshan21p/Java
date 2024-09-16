package StringAndStringBuilder;

import java.util.Scanner;

public class updateEvenPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(i%2==0){
                s = s + 'a';
            } else {
                s = s + ch;
            }
        }
        System.out.println("The update String at even position is : " +s);
    }
}
