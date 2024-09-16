package Hashmaps;

import java.util.HashSet;

public class basicSet {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // insert TC => O(1)
        set.add(20);
        set.add(200);
        set.add(10);
        set.add(-10);
        set.add(87);
        System.out.println(set);
        set.add(10);  // Duplicates are not allowed
        System.out.println(set);
        // Search TC => O(1)  True/False
        System.out.println(set.contains(10));
        System.out.println(set.contains(1));
        // remove TC => O(1)
        set.remove(10);
        System.out.println(set);
        set.remove(1);  // No error comes in output
        System.out.println(set);
        System.out.println(set.size());

        // Set to Array
        Object[] arr = set.toArray();
        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // How to traverse in Hashset
        for(int ele : set){
            System.out.print(ele+" ");
        }
    }
}
