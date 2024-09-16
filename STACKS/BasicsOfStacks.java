package STACKS;
import java.util.Scanner;
import java.util.Stack;

public class BasicsOfStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
//        System.out.println("Enter the number of number of elements ");
//        int n = sc.nextInt();
//        System.out.println("Enter the elements : ");
//        for(int i=0;i<n;i++){
//            int x = sc.nextInt();
//                st.push(x);
//        }

        st.push(1);
        st.push(3);
        st.push(2);
        st.push(5);
        st.push(6);
        System.out.println(st);
        // peek is to access the top elements
        System.out.println(st.peek());
//        st.pop();
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        System.out.println("Size is : " + st.size());
//        while(st.size()>0){
//            st.pop();
//        }
//        System.out.println(st);
    }
}
