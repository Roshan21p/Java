package Greedy;
import java.util.*;


public class fractionalKnapSack {
    private static class Item{
        int profit;
        int weight;
        public String toString(){
            return profit + " " + weight;
        }
        Item(int profit,int weight){
            this.profit = profit;
            this.weight = weight;
        }
    }
    private static class ItemComparator implements Comparator<Item>{
        public int compare(Item i1,Item i2){
            if((i1.profit/i1.weight) < (i2.profit/ i2.weight)) {
                System.out.println((i2.profit/ i2.weight)+" i2 "+i2.profit +" "+i1.profit);
                return 1;
            }
            else if((i1.profit/i1.weight) > (i2.profit/ i2.weight)) {
                System.out.println((i1.profit/ i1.weight)+" i1 "+i1.profit+" "+i2.profit);
                return -1;
            }
            else return 0;
        }
    }
    public static void main(String[] args) {
        List<Integer> profit = List.of(60,100,150,120);
        List<Integer> weight = List.of(10,20,50,15);
        int W = 30;
        List<Item> itemList = new ArrayList<>();
        for(int i=0;i< profit.size();i++){
            //Item item = new Item();
            itemList.add(new Item(profit.get(i),weight.get(i)));
//            item.profit = profit.get(i);
//            item.weight = weight.get(i);
//            itemList.add(item);
        }
        itemList.sort(new ItemComparator());
        System.out.println(itemList);
        int prof = 0;
        for(int i=0;i<itemList.size() && W>0;i++){
            Item item = itemList.get(i);
            if(item.weight <= W){
                prof += item.profit;
                W -= item.weight;
            }
            else{
                prof += (item.profit)/(item.weight) * W;
                W = 0;
            }
        }
        System.out.println(prof);
    }
}
