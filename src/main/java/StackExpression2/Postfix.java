package StackExpression2;

import StackExpression1.PostFix;

import java.util.Stack;

public class Postfix {
    private String postFix;

    public Postfix(String postFix){
        this.postFix = postFix;
    }
    public double evaluate(){
        Stack<Double> st = new Stack<>();
        for(int i=0; i<postFix.length(); i++){
            char ch = postFix.charAt(i);
            if(Character.isDigit(ch)){
                st.push((double)(ch-48));
            }else{
                if(st.size() < 2){
                    throw new RuntimeException("Please input a valid Postfix");
                }
                double op1 = st.pop();
                double op2 = st.pop();
                double ans = calculate(op1, op2, ch);
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
}
