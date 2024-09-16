package STACKS;

import java.util.Stack;

public class prevSmallerElement {
    public static int[] prevSmallerElement(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        res[0] = -1;
        st.push(0);
        for(int i=1;i<n;i++){
            res[i] = -1;
            while(st.size()>0 && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.size()==0) res[i] = -1;
            else{
                res[i] = arr[st.peek()];
            }
            st.push(i);
        }
        return res;
    }
    public static int[] prevSmallerElement1(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        res[0] = -1;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            res[i] = -1;
            while(st.size()>0 && arr[st.peek()] > arr[i]){
                res[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,4,6,3,5};

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] res = prevSmallerElement(arr);
        int[] res1 = prevSmallerElement1(arr);
        for(int i=0;i< res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
        for(int i=0;i< res1.length;i++){
            System.out.print(res1[i]+" ");
        }
    }
}
