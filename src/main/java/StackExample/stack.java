package StackExample;

public class stack {
    private int[]arr;
    private int tos;
    private int size;

    public stack(int size){
        arr = new int[size];
        tos =-1;
        this.size = size;
    }
    public void push(int x){
        StackOverflowException ex = new StackOverflowException("Stack Overflow");
        throw ex;
    }
}
