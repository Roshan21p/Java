package Greedy;
import java.util.*;
public class SmallestNumber {
    public static void main(String[] args) {
        int S = 9;
        int D = 2;

        List<Integer> ans = new ArrayList<>();
        String s = "";
        if(S==0 || S > D*9){
            System.out.println("Invalid input");
            return;
        }
        for(int i=0;i<D;i++) ans.add(0);
        S -= 1;
        for(int i=D-1;i>=1;i--){
            if(S>9){
                ans.set(i,9);
                s = 9 + s;
                S -= 9;
            } else{
                ans.set(i,S);
                s = S + s;
                if(i>1) s = 0 + s;
                S=0;
                break;
            }
        }
        ans.set(0,S+1);
        s = (S+1) + s;
        System.out.println(ans);
        System.out.println(s);
    }
}
