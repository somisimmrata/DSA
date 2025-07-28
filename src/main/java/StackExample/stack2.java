package StackExample;

public class stack2 {
    private int[] arr;
    private int tos;
    private int size;

    public stack2(int size) {
        arr = new int[size];
        tos = -1;
        this.size = size;
    }

    public void push(int x) {
        if (tos == size - 1) {
            throw new StackOverflowException("stack overflow");

        }
        tos++;
        arr[tos] = x;
    }

    public int peek() {
        if (tos == -1) {
            throw new StackUnderflowException("stack underflow");

        }

        return arr[tos];
    }

    public int pop() {
        if (tos == -1) {
            throw new StackUnderflowException("stack underflow");
        }
        int x = arr[tos];
        tos--;
        return x;
    }
}
