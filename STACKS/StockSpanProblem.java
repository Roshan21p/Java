package STACKS;

//Input: arr[] = [100, 80, 60, 70, 60, 75, 85]
//        Output: [1, 1, 1, 2, 1, 4, 6]

import java.util.Stack;

//        Input: arr[] = [10, 4, 5, 90, 120, 80]
//        Output: [1, 1, 2, 4, 5, 1]
public class StockSpanProblem {
    public static int[] calculateSpan(int[] price, int n){
        int[] ans = new int[n];
        ans[0] = 1;
        for(int i=1;i<n;i++){
            ans[i] = 1;
            for(int j=i-1; j>=0 && (price[i] >= price[j]); j--){
                ans[i]++;
            }
        }
        return ans;
    }
    public static int[] calculateSpan1(int[] price, int n){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        ans[0] = 1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && price[st.peek()] <= price[i]){
                st.pop();
            }
            if(st.size()==0) ans[i] = 1;
            else ans[i] = i - st.peek();
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
    int[] price = {100,80,60,70,60,75,85};
    int n = price.length;

    int ans[] = calculateSpan(price,n);
    int ans1[] = calculateSpan1(price,n);


    for(int i=0;i<n;i++) {
        System.out.print(ans[i] + " ");
    }
        System.out.println();
    for(int i=0;i<n;i++) {
        System.out.print(ans1[i] + " ");
    }
    }
}
