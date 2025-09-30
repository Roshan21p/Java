package STACKS;

import java.util.Stack;

public class CelebrityProblem {
//    public static int findCelebrity(int[][] M, int n) {
//       for(int i=0;i<n;i++){
//           boolean isCelebrity = true;
//           for(int j=0;j<n;j++){
//               if(M[i][j] == 1) {
//                   isCelebrity =false;
//                   break;
//               }
//           }
//
//           // j knowns i is celebrity
//
//           if(isCelebrity){
//               for(int j=0;j<n;j++){
//                   if(i!=j && M[j][i] == 0){
//                       isCelebrity = false;
//                       break;
//                   }
//               }
//           }
//           if(isCelebrity) return i;
//       }
//       return -1;
//    }

    public static int findCelebrity1(int[][] M, int n) {
        Stack<Integer> st = new Stack<>();

        // Step 1: Push all people (0 to n-1) onto the stack
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        // Step 2: Eliminate non-celebrities pairwise
        while (st.size() > 1) {
            int v1 = st.pop(); // person A
            int v2 = st.pop(); // person B

            // If v1 doesn't know v2, then v1 might be celebrity (v2 is not)
            if (M[v1][v2] == 0) {
                st.push(v1);
            }
            // If v2 doesn't know v1, then v2 might be celebrity (v1 is not)
            else if (M[v2][v1] == 0) {
                st.push(v2);
            }
            // If both know each other or both don't know each other,
            // none can be celebrity (not handled explicitly here as one is pushed)
        }

        // Step 3: If no one is left, there is no celebrity
        if (st.isEmpty()) return -1;

        // Step 4: The last person on the stack is a **potential celebrity**
        int potential = st.pop();

        // Step 5: Verify that potential celebrity knows no one
        for (int j = 0; j < n; j++) {
            if (j !=potential &&  M[potential][j] == 1) return -1; // celebrity should not know anyone
        }

        // Step 6: Verify that everyone knows the potential celebrity
        for (int i = 0; i < n; i++) {
            if (i != potential && M[i][potential] == 0) return -1; // everyone must know the celebrity
        }

        // Step 7: Return the celebrity index
        return potential;
    }


    public static void main(String[] args) {
        int[][] M = {
                {1, 1, 0},
                {0, 1, 0},
                {0, 1, 1}
        };
        int n = 3;
        int celebrity = findCelebrity1(M, n);
        System.out.println("Celebrity index: " + celebrity);  // Output: 2
    }
}

