package StringAndStringBuilder;

import java.util.Scanner;

public class basicOfStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("Roshan");
        System.out.println(str);
        StringBuilder s = new StringBuilder(10);   // capacity -> 10
        System.out.println(s.length());  // length -> 0

        // StringBuilder initially initialise to 16 capacity
        StringBuilder a = new StringBuilder();
        System.out.println(s.capacity());

        //System.out.println(str.reverse());
        System.out.println(str.indexOf("R"));
        System.out.println("Delete:"+str.deleteCharAt(1));
        System.out.println("Insert:"+str.insert(1,'o'));

        // Taking input in StringBuilder
        //Method 1
       /* System.out.println("Enter the string : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);

        // Method 2
        System.out.println("Enter the string : ");
        String b  = sc.nextLine();
        StringBuilder c = new StringBuilder(b);
        System.out.println(c); */

        // Modify the String in StringBuilder
        StringBuilder x = new StringBuilder("Hello");
        x.setCharAt(2,'y');
        System.out.println(x);

        // append()
        StringBuilder e = new StringBuilder("Hello");
        System.out.println(e);
        e.append("Roshan");
        System.out.println(e);

        char[] ch = {'R','o','s','h','a','n'};
        System.out.println(e.append(ch));

        int[] arr = {1,2,3};
        System.out.println(e.append(arr));  // does not work or address is appending
    }
}
