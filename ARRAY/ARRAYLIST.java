package ARRAY;

import java.util.*;

public class ARRAYLIST {
    public static void main(String[] args) {
        //wrapper class
    //    Integer in = Integer.valueOf(4);
     //  System.out.println(in);
     //  Float f = Float.valueOf(4.5f);
     //  System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>();

        // add new element
        l1.add(5);  //  5
        l1.add(6);  // 5 6
        l1.add(7);  // 5 6 7
        l1.add(8);  // 5 6 7 8

        // get an element a index i
     //   System.out.println(l1.get(1));  //6

        // print with for loop
       // for(int i=0;i<l1.size();i++){
          //  System.out.print(l1.get(i) + " ");
    //    }

        // printing the array list directly
        System.out.println(l1);  //[5, 6, 7, 8]

        // adding element at some index i // 5 100 6 7 8
        //l1.add(index:1,element:100);
      //  System.out.println(l1); // [5 100 6 7 8]

        // modifying element at index i
        l1.set(0,15);
        System.out.println(l1); // [15 6 7 8]

        //removing an element at index i
       // l1.remove(index: 1);
      //  System.out.println(l1); // 5 6 7 8

        // removing an element e
      //  l1.remove(Integer.valueOf(i :7));  // 5 6 8
        List<List<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        l2.add(1);
        lists.add(l2);
        l3.add(0);
        l3.add(4);
        l3.add(2);
        lists.add(l3);
//        System.out.println(lists);
//        for(int i=0;i< lists.size();i++){
//            for(int j=0;j<lists.get(i).size();j++){
//                System.out.println(lists.get(i).get(j));
//            }
//        }
        int[][] ans = {{1,5},
                {2,3}};
        for(int[] ele : ans){
            System.out.println(ele[1]+" hello ");
        }

    }
}
