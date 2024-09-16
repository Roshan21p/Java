package Heaps;

import java.util.Arrays;

class Student implements Comparable<Student>{
    int rno;
    double perc;
    String name;
    public Student(int rno,double perc,String name){
        this.rno = rno;
        this.perc = perc;
        this.name = name;
    }
    public int compareTo(Student s){
        return this.name.charAt(0) - s.name.charAt(0);
    }
}
public class customComparator {
    public static void print(Student[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i].name+" ");
            System.out.print(arr[i].perc+" ");
            System.out.println(arr[i].rno+" ");
        }
    }
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student(28,96.26,"Roshan");
        s[1] = new Student(12,76,"Akash");
        s[2] = new Student(1,60,"Aman");
        s[3] = new Student(45,78,"Suraj");
        print(s);
        Arrays.sort(s);
        System.out.println();
        print(s);
    }
}
