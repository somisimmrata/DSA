package StackExpression4;

import java.util.Scanner;

public class UseConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid infix: ");
        String infix = sc.next();
        Convert obj = new Convert(infix);
        obj.ConvertInfixToPostfix();
        obj.show();
    }
}
