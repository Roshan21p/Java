package CLASSandOBJECT;
import java.util.*;
class Students {
    int RollNo;
    String StudentsName;
}
public class Main {
    public static void main(String[] args) {
        Students obj1 = new Students();
        obj1.RollNo = 1;
        obj1.StudentsName = "Rohan";
        System.out.println(obj1.RollNo);
        System.out.println(obj1.StudentsName);

        Students obj2 = new Students();
        obj2.RollNo = 2;
        obj2.StudentsName = "Roshan";
        System.out.println(obj2.RollNo);
        System.out.println(obj2.StudentsName);

        

    }
}
