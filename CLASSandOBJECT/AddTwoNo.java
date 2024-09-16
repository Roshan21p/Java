package CLASSandOBJECT;
import java.util.Scanner;
class Algebra{
    int add(int a,int b){
        int ans = a +b;
        return ans;
    }
}

public class AddTwoNo {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int x = sc.nextInt();
        System.out.println("Enter a second number:");
        int y = sc.nextInt();

        System.out.println("Sum of Input Numbers is :");
        int result = obj.add(x, y);
        System.out.println(result);
    }
}
