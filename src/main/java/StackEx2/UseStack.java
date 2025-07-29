package StackEx2;

import StackExample.StackOverflowException;
import StackExample.StackUnderflowException;

import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack s = new stack(5);
        int choice , x;

        do{
            System.out.println("Select an operation");
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Quit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                try{
                    System.out.println("Enter element to push");
                    x = sc.nextInt();
                    s.push(x);
                    System.out.println("Pushed :"+x);
                }catch(StackOverflowException ex){
                    System.out.println(ex.getMessage());
                }break;
                case 2:
                    try{
                        x= s.pop();
                        System.out.println("Popped: "+x);
                    }catch(StackUnderflowException ex){
                        System.out.println(ex.getMessage());
                    }break;
                case 3:
                    try{
                        x= s.peek();
                        System.out.println("Top element:" + x);
                    }catch(StackUnderflowException ex){
                        System.out.println(ex.getMessage());
                    } break;
                case 4:
                    System.out.println("Thank u for using the app. have a good day!");
                    break;
                default:
                    System.out.println("wrong choice! try again");
            }
        }
        while (choice != 4);
    }
}
