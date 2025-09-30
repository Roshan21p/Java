package QUEUES;
import java.util.*;

/*
Given a Queue of even size . Your task is to rearrange the queue by interleaving its first half with the second half.
Interleaving is the process of mixing two sequences by alternating their elements while preserving their relative order.
In other words, Interleaving means place the first element from the first half and then first element from the 2nd half
and again 2nd element from the first half and then second element from the 2nd half and so on...

Input: q = [2, 4, 3, 1]
Output: [2, 3, 4, 1]
Explanation: we place the first element of the first half 2 and after that place the first element of second half 3
and after that repeat the same process one more time so the resulting queue will be [2, 3, 4, 1]
 */

public class rearrangeQueue {

    public static void rearrangeQueue( Queue<Integer> q,int n){
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n/2;i++){
            st.push(q.remove());
        } // st Top->  3 2 1    q -> 4 5 6
        for(int i=0;i<n/2;i++){
            q.add(st.pop());
        } // q-> 4 5 6 3 2 1
        for(int i=0;i<n/2;i++){
            st.push(q.remove());
        } // st Top -> 6 5 4    q-> 3 2 1
        for(int i=0;i<n/2;i++){
            q.add(st.pop());
            q.add(q.remove());
        }  // q -> 6 3 5 2 4 1
        for(int i=0;i<n;i++){
            st.push(q.remove());
        } // st top -> 1 4 2 5 3 6
        for(int i=0;i<n;i++){
            q.add(st.pop());
        } // q -> 1 4 2 5 3 6
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);q.add(6);

        System.out.println("Before queue"+q);
        // Basic approach
        int n = q.size();
//        int[] ans = new int[n];
//        for(int i=0;i<n;i += 2){
//            ans[i] = q.remove();
//        }
//        for(int i=1;i<n;i += 2){
//            ans[i] = q.remove();
//        }
//        for(int i=0;i<n;i++){
//            q.add(ans[i]);
//        }


        // Another Approach by stack
        rearrangeQueue(q,n);

        System.out.println("After Queue"+q);
    }
}
