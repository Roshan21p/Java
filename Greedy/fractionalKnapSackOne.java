package Greedy;
import java.util.*;
public class fractionalKnapSackOne {
    private static class Item implements Comparable<Item>{
        int profit;
        int weight;
        public String toString(){
            return profit + " " + weight;
        }
//        Item(int profit,int weight){
//            this.profit = profit;
//            this.weight = weight;
//        }
        //Override
        public int compareTo(Item other){
            double ratio1 = (double) (this.profit/this.weight);
            double ratio2 = (double) (other.profit/other.weight);
            return Double.compare(ratio2,ratio1);
        }
    }

    public static void main(String[] args) {
        List<Integer> profit = List.of(60,100,150,120);
        List<Integer> weight = List.of(10,20,50,15);
        int W = 30;
        List<Item> itemList = new ArrayList<>();
        for(int i=0;i< profit.size();i++){
            Item item = new Item();
           // itemList.add(new Item(profit.get(i),weight.get(i)));
            item.profit = profit.get(i);
            item.weight = weight.get(i);
            itemList.add(item);
        }
        Collections.sort(itemList);
        System.out.println(itemList);
        int maxProf = 0;
        for(int i=0;i<itemList.size() && W>0;i++){
            Item item = itemList.get(i);
            if(item.weight <= W){
                maxProf += item.profit;
                W -= item.weight;
            }
            else{
                maxProf += (item.profit)/(item.weight) * W;
                W = 0;
            }
        }
        System.out.println(maxProf);
    }
}
