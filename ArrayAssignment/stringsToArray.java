package ArrayAssignment;
import java.util.Scanner;

// Convert the list of strings into Array and print only odd indices
public class stringsToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};

        for(int i=0;i< arr.length;i++){
            if(i % 2 != 0){
                System.out.println(arr[i]);
            }
        }
    }
}
