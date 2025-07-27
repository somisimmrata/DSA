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
        if(tos == size-1){
            System.out.println("stack overflow");
            return;
        }
        tos++;
        arr[tos] = x;
    }
    public int pop(){
        if(tos == -1){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int x;
        x = arr[tos];
        tos--;
        return x;
    }

    //Code for peek:
    public int peek(){
        if(tos == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        int x;
        x = arr[tos];
        return x;
    }
}
