package STACKS;

import java.util.Stack;

public class
nextGreaterElement {
    public static int[] nextGreaterElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[n-1] = -1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            res[i] = -1;
            while (st.size() > 0 && st.peek() < arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                res[i] = -1;
            }
            else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
public static int[] nextGreaterElement1(int[] arr){
    Stack<Integer> st = new Stack<>();
    int n = arr.length;
    int[] res = new int[n];
    res[n-1] = -1;
    st.push(0);
    for(int i=1;i<n;i++){
        res[i] = -1;
       while(st.size()>0 && arr[st.peek()]<arr[i]){
           res[st.peek()] = arr[i];
           st.pop();
       }
        st.push(i);
    }
    return res;
}
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] res = nextGreaterElement(arr);
        int[] res1 = nextGreaterElement1(arr);
//        for(int i=0;i<arr.length;i++){
//            res[i] = -1;
//            for(int j=i+1;j < arr.length;j++){
//                if(arr[i] < arr[j]) {
//                    res[i] = arr[j];
//                    break;
//                }
//            }
//        }
        for(int i=0;i< res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
        for(int i=0;i< res1.length;i++){
            System.out.print(res1[i]+" ");
        }
    }
}
