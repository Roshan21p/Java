package StringAndStringBuilder;

public class printSubstring {
    public static void main(String[] args) {
        String s = "abc";
        String temp = "";
        for(int i=0;i<s.length();i++){
            String ans = "";
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);
                ans += ch;
                temp += ans + " ";
            }
        }
        System.out.println(temp);

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
