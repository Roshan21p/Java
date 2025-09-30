package STACKS;

import java.util.Stack;

public class Infix {
    public static int evaluateInfix(String str) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Skip whitespace
            if (ch == ' ') continue;

            // If digit, push to value stack
//            if (Character.isDigit(ch)) {
//                val.push(ch - '0');  // for single-digit numbers
//            }

            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                int num = 0;
                while (i<str.length() && ((int)str.charAt(i) >= 48 && (int)str.charAt(i) <= 57)){
                    num = num * 10 + (str.charAt(i) - '0');
                    i++;
                }
                i--;
                val.push(num);
            }

            // If '(', push to op stack
            else if (ch == '(') {
                op.push(ch);
            }

            // If ')', solve until '('
            else if (ch == ')') {
                while (!op.isEmpty() && op.peek() != '(') {
                    evaluateTop(val, op);
                }
                op.pop(); // remove '('
            }

            // If operator
            else if (isOperator(ch)) {
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch) && op.peek() != '(') {
                    evaluateTop(val, op);
                }
                op.push(ch);
            }
        }

        // Evaluate remaining operators
        while (!op.isEmpty()) {
            evaluateTop(val, op);
        }

        // Final result
        return val.peek();
    }

    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return 0;
    }

    static void evaluateTop(Stack<Integer> val, Stack<Character> op) {
        int v2 = val.pop();
        int v1 = val.pop();
        char o = op.pop();

        int res = 0;
        switch (o) {
            case '+': res = v1 + v2; break;
            case '-': res = v1 - v2; break;
            case '*': res = v1 * v2; break;
            case '/': res = v1 / v2; break;
        }
        val.push(res);
    }
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        System.out.println(evaluateInfix(str));
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) val.push(ascii-48);
            else if(op.size()==0 || ch=='(' || op.peek()=='(')
                op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    //work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '-') val.push(v1-v2);
                    if(op.peek() == '+') val.push(v1+v2);
                    if(op.peek() == '*') val.push(v1*v2);
                    if(op.peek() == '/') val.push(v1/v2);
                    op.pop();
                }
                op.pop(); // '(' hata diya
            }
            else{
                if(ch=='+' || ch=='-'){
                    //work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '-') val.push(v1-v2);
                    if(op.peek() == '+') val.push(v1+v2);
                    if(op.peek() == '*') val.push(v1*v2);
                    if(op.peek() == '/') val.push(v1/v2);
                    op.pop();
                    //push
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        //work
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek() == '*') val.push(v1*v2);
                        if(op.peek() == '/') val.push(v1/v2);
                        op.pop();
                        //push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            //work
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek() == '-') val.push(v1-v2);
            if(op.peek() == '+') val.push(v1+v2);
            if(op.peek() == '*') val.push(v1*v2);
            if(op.peek() == '/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
