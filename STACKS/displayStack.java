package STACKS;

import java.util.Stack;

public class displayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        Stack<Integer> temp = new Stack<>();
//        while(st.size()>0){
//            temp.push(st.pop());
//        }
//        while(temp.size()>0){
//            int x = temp.pop();
//            System.out.print(x+ " ");
//            st.push(x);
//        }
        int n = st.size();
        int[] arr = new int[n];
        for(int i = n-1;i>=0;i--){
            arr[i] = st.pop();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
        System.out.println(st);
    }
}
