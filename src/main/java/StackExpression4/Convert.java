package StackExpression4;

import java.util.Stack;

public class Convert {
    private String infix;
    private String postfix;

    public Convert(String infix){
        this.infix = infix;
        this.postfix = "";
    }

    public void ConvertInfixToPostfix() {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            } else {
                while (!st.empty() && precedence(ch, st.peek())) {
                    postfix += st.pop();
                    }
                    st.push(ch);
                }
            }
            while (!st.empty()) {
                postfix += st.pop();
            }
        }
        public boolean precedence ( char out, char in) {
            if (in == '$') {
                return false;
            } else if (out == '$') {
                return true;
            } else if (in == '*' || in == '/' || in == '%') {
                return false;
            } else if (out == '*' || out == '/' || out == '%') {
                return true;
            } else if (in == '+' || in == '-') {
                return false;
            } else {
                return true;
            }
        }
            public void show () {
                System.out.println("Postfix expression: " + postfix);

        }
    }

