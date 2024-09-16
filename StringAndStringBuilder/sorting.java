package StringAndStringBuilder;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String s = "roshan";
        char[] str = s.toCharArray();
        Arrays.sort(str);
        for(char ele : str){
            System.out.print(ele);
        }
        System.out.println();
        System.out.println();
        StringBuilder sb = new StringBuilder("hello");
        char[] str1 = sb.toString().toCharArray();
        Arrays.sort(str1);
        for(char ele : str1){
            System.out.print(ele);
        }
    }
}
