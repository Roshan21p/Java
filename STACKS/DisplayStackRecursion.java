package STACKS;

import java.util.Stack;

public class DisplayStackRecursion {
    static void InsertAtBottom(Stack<Integer> st, int bot){
        if(st.size() == 0){
            st.push(bot);
            System.out.println(bot);
            return;
        }
        int x = st.pop();
        InsertAtBottom(st,bot);
        System.out.println(x);
        st.push(x);
    }
    static void displayRec(Stack<Integer> st){
      if(st.size() == 0) return;
      int top = st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int top = 8;
       displayRec(st);
        InsertAtBottom(st,top);
        displayRec(st);
    }
}
