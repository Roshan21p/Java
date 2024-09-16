package Greedy;
import java.util.*;
/*
A board of length m and width n is given. The task is to break this board into m*n squares such that cost of breaking is minimum.
The cutting cost for each edge will be given for the board in two arrays x[] and y[].
 In short, you need to choose such a sequence of cutting such that cost is minimized. Return the minimized cost.
 */
public class minimumCostOfBreaking {
    public static int minimumCost(Integer[] ver,Integer[] hor,int M,int N){
        Arrays.sort(ver,Collections.reverseOrder());
        Arrays.sort(hor,Collections.reverseOrder());

        System.out.println(Arrays.toString(ver));
        System.out.println(Arrays.toString(hor));

        int noOfVerticalPiece = 1;
        int noOfHorizontalPiece = 1;

        int i=0, j=0, totalCost = 0;
        while(i<M-1 && j<N-1){
            if(ver[i] > hor[j]){
                totalCost += (ver[i++] * noOfHorizontalPiece);
                noOfVerticalPiece++;
            }
            else{
                totalCost += (hor[j++] * noOfVerticalPiece);
                noOfHorizontalPiece++;
            }
        }
        while(i<M-1){
            totalCost += (ver[i++] * noOfHorizontalPiece);
        }
        while(j<N-1){
            totalCost += (hor[j++] * noOfVerticalPiece);
        }
    return totalCost;
    }
    public static void main(String[] args) {
        int M = 6, N = 4;   // M -> column ,  N -> row
        Integer[] ver = {2,1,3,1,4};
        Integer[] hor = {4,1,2};
        System.out.println(minimumCost(ver,hor,M,N));
    }
}
