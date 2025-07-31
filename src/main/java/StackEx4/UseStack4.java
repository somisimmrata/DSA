package StackEx4;

import java.util.Stack;

public class UseStack4 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("Items are pushed in the stack:");
        st.push(10);
        System.out.println("Pushed: 10");
        st.push(20);
        System.out.println("Pushed: 20");
        st.push(30);
        System.out.println("Pushed: 30");
        st.push(40);
        System.out.println("Pushed: 40");

        while(!st.empty()){
            System.out.println("Item Popped: "+st.pop());
        }
    }
}
