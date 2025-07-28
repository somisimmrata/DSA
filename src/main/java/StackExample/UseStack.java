package StackExample;


public class UseStack {
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
