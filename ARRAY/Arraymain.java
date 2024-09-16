package ARRAY;

import java.util.Scanner;

class ArraysExample {

    void sumOfArray(){

        int[] arr = {1,4,5,6,1};
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    void multiArrays(){
        //int[][] arr_1 = new int[5][3];
       int[][] arr = {{56, 43, 6}, {34, 7, 5}, {12, 56, 8}};

       for(int i=0;i< arr.length;i++){
           // arr[0] and arr[1]
           for(int j=0;j<arr[i].length;j++){
               System.out.println(arr[i][j]);
           }
       }

        //arr[] = array , arr[0][2]

     /*   System.out.println(arr[0][0]); //56
        System.out.println(arr[0][1]); //43
        System.out.println(arr[0][2]); //6

        System.out.println(arr[1][0]); //34
        System.out.println(arr[1][1]); //7
        System.out.println(arr[1][2]); //5

        System.out.println(arr[2][0]); //12
        System.out.println(arr[2][1]); //56
        System.out.println(arr[2][2]); //8*/

    }
    void demoArrays(){
        int[] ages = new int[3];
        float[] weights = new float[3];
        // literal array ex
        String[] names = {"rahul" , "raj" , "roshan", "chirag"};

      /*  System.out.println(ages.length); //3
        System.out.println(weights.length); //3
        System.out.println(names.length); //4 */

        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 45;
       // ages[5] = 45;  // out of bounds

        /*System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);*/

        //for loop
        for(int i=0;i<3;i++){
            System.out.println(ages[i]);
        }
        //for esch loop
        for(int age : ages){
            System.out.println(age);
        }
        //while loop
        int i = 0;
        while(i < 3){
            System.out.println(ages[i]);
            i++;
        }
    }
}

public class Arraymain {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
       // obj.demoArrays();
        //obj.multiArrays();
        obj.sumOfArray();
    }
}
