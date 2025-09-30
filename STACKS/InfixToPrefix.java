package STACKS;

import java.util.Stack;

public class InfixToPrefix {
    public static boolean isOperator(char ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public static int precedence(char ch){
        if(ch == '+' || ch == '-') return 1;
        if(ch == '*' || ch == '/') return 2;
        return 0;
    }

    public static void evaluate(Stack<String> val, Stack<Character> op){
        String v2 = val.pop();
        String v1 = val.pop();
        char o = op.pop();
        String res = o + v1 + v2;
        val.push(res);
    }


    public static String infixToPrefix(String str){
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                int num = 0;
                while(i<str.length() && Character.isDigit(str.charAt(i))){
                    num = num*10 + (str.charAt(i) - '0');
                    i++;
                }
                i--;
                String s = "" + num;
                val.push(s);
            }

            else if(op.size() == 0 || ch == '('){
                op.push(ch);
            }

            else if (ch == ')'){
                while(!op.isEmpty() && op.peek() != '('){
                    evaluate(val,op);
                }
                op.pop();
            }
            else if(isOperator(ch)){
                while(!op.isEmpty() && precedence(op.peek()) >= precedence(ch) && op.peek() != '('){
                    evaluate(val,op);
                }
                op.push(ch);
            }
        }
        while (!op.isEmpty()){
            evaluate(val,op);
        }
        return val.peek();
    }
    public static void main(String[] args) {
//        String infix = "9-(5+3)*4/6";
        String infix = "2+3*4";
        System.out.println(infix);  // -9/*+5346
        System.out.println(infixToPrefix(infix));
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0;i<infix.length();i++) {
            char ch = infix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                val.push(s);
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(')
                op.push(ch);
            else if (ch == ')') {
                while (op.peek() != '(') {
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                   char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                    // push
                }
                op.pop(); // '(' hat diya
            } else {
                if (ch == '+' || ch == '-') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                    // push
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        // work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                        // push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
            while(val.size()>1){
                String v2 = val.pop();
                String v1 = val.pop();
               char o = op.pop();
                String t = o + v1 + v2;
                val.push(t);
            }
            String prefix = val.pop();
            System.out.println(prefix);
    }
}
