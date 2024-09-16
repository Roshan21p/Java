package CLASSandOBJECT;

/*public class HowToDeclareAndCallingMethod {
   /* Declaring Methods
    public class main{
        //Access modifier return type Method name(Parameter list)
        public          int          sum        (int a,int b){
            code to be executed
        }
    }
}*/
// 1.Method Signature = sum(int a, int b)
// Method name + parameter list

// calling a Method :To call method in Java you have to write the methods name followed by two parenthness () and a semicolon; i.e. sum();

// Acess modifier : 1.public 2.private 3.protected 4.default

// CALLING A METHOD
public class HowToDeclareAndCallingMethod{
    static void welcome(){
        System.out.println("welcome to PW");
    }

    public static void main(String[] args) {
        welcome();
    }
}