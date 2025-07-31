package StackEx4;
import StackExample.StackUnderflowException;

import java.util.ArrayList;
import java.util.List;

public class stack4 {

    private List<Integer> arr;
    public stack4(){
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
    }


