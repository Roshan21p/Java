package ARRAY;

import java.util.Scanner;
class ArrayExample{

    void SearchInArray(){
        int []arr = {5,8,3,6,9};
        int x = 8;
        int ans = -1;

        for(int i=0;i<arr.length;i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
             if(ans == -1){
                System.out.println("not found");
            }
            else{
                System.out.println("Found " +x+ " at index " +ans);
            }
    }

    void MaxValue(){
        int []arr = {5,3,6,8,9};
        int ans = 0;
        for(int i=0;i < arr.length;i++){
            if(arr[i] >ans ){
                ans = arr[i];
            }
        }
        System.out.println("maximum value is:"+ans);
    }
}

public class MaximumValue {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        //obj.MaxValue();
        obj.SearchInArray();
    }
}
