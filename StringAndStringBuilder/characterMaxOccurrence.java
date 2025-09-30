package StringAndStringBuilder;

import java.util.Scanner;

public class characterMaxOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s =  sc.next();
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;
            int idx = ascii - 97;
            freq[idx]++;
        }
        int maxFreq = -1;
        for(int i=0;i<freq.length;i++){
            maxFreq = Math.max(maxFreq,freq[i]);
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==maxFreq){
                char ch = (char)(i+97);
                System.out.print(ch+" ");
            }
        }
        System.out.print(maxFreq+ " ");


        /*
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.next();

        Map<Character, Integer> freqMap = new HashMap<>();

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Find max frequency
        int maxFreq = Collections.max(freqMap.values());

        // Print characters with max frequency
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                System.out.print(entry.getKey() + " ");
            }
        }

        System.out.println(maxFreq);
        * */
    }
}
