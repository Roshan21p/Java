package BasicsOfJava;

import java.util.Scanner;

public class ReaderChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character");
        char ch = sc.next().charAt(4);
        System.out.println("character :"+ch);
        int x = (int)ch;
        System.out.println(x);
    }
}
