package StringAndStringBuilder;

public class palindrome {
    static boolean palindrome(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)) return false;
             else {
                 i++;
                j--;
            }
        }
            return true;
    }
    public static void main(String[] args) {
        String s = "madam";
        int n = s.length();
        if(palindrome(s) == true)
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
    }
}
