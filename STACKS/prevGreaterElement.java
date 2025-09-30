package STACKS;

import java.util.Stack;

public class prevGreaterElement {
    public static int[] prevGreaterElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[0] = -1;
        st.push(0);
        for(int i=1;i<n;i++) {
            while (st.size() > 0 && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if(st.size()==0) res[i] = -1;
            else {
                res[i] = arr[st.peek()];
            }
            st.push(i);
        }
        return res;
    }
    public static int[] prevGreaterElement1(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[0] = -1;
        st.push(n-1);
        for(int i=n-2;i>=0;i--) {
            res[i] = -1;
            while (st.size() > 0 && arr[st.peek()] <= arr[i]) {
                res[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {100,80,60,70,60,75,85};
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] res = prevGreaterElement(arr);
        int[] res1 = prevGreaterElement1(arr);
        for(int i=0;i< res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
        for(int i=0;i< res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
