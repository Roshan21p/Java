package Hashmaps;


import java.util.*;

public class basicMaps {



    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        // insert TC => O(1)
        map.put("Roshan",94);
        map.put("Akash",78);
        map.put("Suraj",45);
        map.put("Aman",60);
        map.put("Manisha",99);
        System.out.println(map);
        // Search TC => O(1)  True/False
        System.out.println(map.containsKey("Roshan"));
        map.put("Roshan",98); // It replace the previous value
        System.out.println(map);
        // remove TC => O(1)
        map.remove("Suraj");
        System.out.println(map);
        System.out.println("Size: "+map.size());
        System.out.println(map.keySet());
        // Traverse in Hashmaps
        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key+" "+val);
        }
        for(int val : map.values()){
            System.out.println(val+" ");
        }
        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
