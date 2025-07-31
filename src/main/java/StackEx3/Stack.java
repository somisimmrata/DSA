package StackEx3;

import StackExample.StackOverflowException;
import StackExample.StackUnderflowException;
import StackExample.stack2;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> arr;
    public Stack(){
        arr = new ArrayList<>();
    }
    public void push(int x){
        arr.add(x);
    }
    public int pop(){
        if(arr.isEmpty()){
            throw new StackUnderflowException("Stack Underflow");
        }
        int x;
        x = arr.remove(arr.size()-1);
        return x;
    }
    public int peek(){
        if(arr.isEmpty()){
            throw new StackUnderflowException("Stack underflow");
        }
        int x;
        x=arr.get(arr.size()-1);
        return x;
    }

    public static void main(String[] args) {
        stack2 s1 = new stack2(6);
        int x = 10;
        try {
            for (int i = 1; i <= 6; i++) {
                s1.push(x);
                System.out.println("pushed : " + x);

                x = x + 10;
            }
        } catch (StackOverflowException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("====================");
        try {
            System.out.println("Top element of the stack is:" + s1.peek());
        } catch (StackUnderflowException ex) {
            System.out.println("stack underflow");
        }
        System.out.println("============================");
        try {
            for (int i = 0; i <= 6; i++) {
                x = s1.pop();
                System.out.println("Popped : " + x);
            }
        } catch (StackUnderflowException ex) {
            System.out.println(ex.getMessage());
        }
    }
    }
