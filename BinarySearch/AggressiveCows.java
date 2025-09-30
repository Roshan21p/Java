package BinarySearch;

//You are given an array with unique elements of stalls[], which denote the positions of stalls.
// You are also given an integer k which denotes the number of aggressive cows.
//The task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.

import java.util.Arrays;


//Input: stalls[] = [1, 2, 4, 8, 9], k = 3
//Output: 3
//Explanation: The first cow can be placed at stalls[0],
//the second cow can be placed at stalls[2] and
//the third cow can be placed at stalls[3].
//The minimum distance between cows in this case is 3, which is the largest among all possible ways.
public class AggressiveCows {
    public static boolean canPlaceCows(int[] stalls, int cows, int minDistance){
        int count = 1; // Place first cow at the first stall
        int lastPosition = stalls[0];

        for(int i=1;i<stalls.length;i++){
            if(stalls[i] - lastPosition >= minDistance){
                count++;   // Place another cow
                lastPosition = stalls[i];
            }
            if (count == cows) return true; // All cows placed successfully
        }
        return false;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;


        int low = 1, high = stalls[n-1] - stalls[0];

        int ans = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(canPlaceCows(stalls,k,mid)){
                ans = mid;
                low = mid + 1;   // Mid works, try for larger distance
            } else high = mid - 1;
        }
        return ans;
    }
    public static void main(String[] args) {
       int[] stalls = {1, 2, 4, 8, 9};
       int k = 3;
        System.out.println("The minimum distance between cows : "+aggressiveCows(stalls,k));
    }
}
