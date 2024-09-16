package Greedy;

public class surviveOnIsland {
    public static void main(String[] args) {
        int S = 10; // Number of days are required to survive
        int N = 16; // Maximum unit of food you can buy each day
        int M = 2;  // Unit of food required each day to survive(saturday ko khaana nhi milega)
        int total_food_required = S*M;
        int ans=0;
        boolean flag = true;
        if(M>N || 7*M > 6*N) {
                ans = -1;
                flag = false;
        }
        //floor(lower number round off)  ceil(upper number round off
        if(flag==true) ans = (int)Math.ceil((double) total_food_required/N);

        System.out.println(ans);
    }
}
