package STACKS;

import java.util.Stack;

public class nextSmallerElement {
    public static int[] nextSmallerElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[n-1] = -1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--) {
            while (st.size() > 0 && st.peek() > arr[i]) {
                st.pop();
            }
            if(st.size()==0) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static int[] nextSmallerElement1(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[n-1] = -1;
        st.push(0);
        for(int i=0;i<n-1;i++) {
            res[i] = -1;
            while (st.size() > 0 && arr[st.peek()] > arr[i]) {
                res[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
      // int[] arr = {0,6,5,7,1,2};
        int[] arr = {5,2,4,6,3,5};

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] res = nextSmallerElement(arr);
        int[] res1 = nextSmallerElement1(arr);
        for(int i=0;i< res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
        for(int i=0;i< res1.length;i++){
            System.out.print(res1[i]+" ");
        }
    }
}
