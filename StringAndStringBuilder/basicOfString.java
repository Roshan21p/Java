package StringAndStringBuilder;

import java.util.Scanner;

public class basicOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaration of string
        String str ;
        // Initialization of String
        str = "Hello Roshan";
        //Displaying the string
        System.out.println(str);

        // Taking input of string
      /*  System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println(s); */

        //Accessing the String
        System.out.println(str.charAt(1));
        System.out.println("String length: "+ str.length());

        //Accessing the String with indexOf() keyword
        System.out.println(str.indexOf("R"));

        String str1 = "abc";
        String str2 = "aef";
        System.out.println("Compare To "+str1.compareTo(str2)); // a-d -> 97-100

        //contains() and startsWith
        System.out.println(str.contains("Hello"));  // true
        System.out.println(str.startsWith("o"));   // false

        //toLowerCase() and toUpperCase
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // concat() and + operator
        String x = "Hii ";
        String y = "Roshan";
        System.out.println(x.concat(y));
        System.out.println(x+y);
        System.out.println(10+"abc"); // 10abc
        System.out.println(10+20+"abc"); //30abc

        //substring()
        System.out.println(str.substring(0));
        System.out.println(str.substring(0,6));

        //Iteraing through all characters
        for (int i = 0; i < str.length(); i++) {
            char currCharacter = str.charAt(i);
            System.out.println("Index " + i + ": "+currCharacter);
        }

        // String is immutable
        String a = "hello";
        // change to heylo
        a = a.substring(0,2) + 'y' + a.substring(3);  // but it will take lot of time and space in memory
        System.out.println(a);
    }
}
