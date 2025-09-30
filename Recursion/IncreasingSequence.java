package Recursion;

//Given two positive integers n and k, print all increasing sequences of length k
// such that the elements in every sequence are from the first n natural numbers.

//Input: k = 2, n = 3
//Output: 1 2
//        1 3
//        2 3

import java.util.*;
public class IncreasingSequence {
    public static void generateSequences(int n,int k,int start, List<Integer> sequence){
        if(sequence.size() == k){
            System.out.println(sequence);
            return;
        }
        for(int i=start;i<=n;i++){
            sequence.add(i);
            generateSequences(n, k, i + 1, sequence);
            System.out.println(sequence.remove(sequence.size() - 1));
        }
    }
        public static void main(String[] args){
        int n = 3, k = 2;
        generateSequences(n, k, 1, new ArrayList<>());
    }
}
