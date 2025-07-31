package StackExpression1;

import java.util.Stack;

public class PostFix {
    private String postFix;

    public PostFix(String postFix){
        this.postFix = postFix;
    }
    public double evaluate(){
        Stack<Double> st= new Stack<>();

        for(int i=0; i<postFix.length(); i++){
            char ch = postFix.charAt(i);
            if(isOperand(ch) == true){
              st.push((double)(ch-48));
            }else{
                double op2 = st.pop();
                double op1 = st.pop();
                double ans = calculate(op1,op2,ch);
                st.push(ans);
            }
        }
        return st.pop();
    }
    public double calculate(double op1, double op2, char op){
        switch(op){
            case '+':
                return op1+op2;
            case '-':
                return op1-op2;
            case'*':
                return op1*op2;
            case'/':
                return op1/op2;
            case'%':
                return op1%op2;
            case '$':
                return Math.pow(op1,op2);
            default:
                return 0.0;
        }
    }
    public boolean isOperand(char ch){
        return (ch >= 48 && ch <= 57);
    }
}
