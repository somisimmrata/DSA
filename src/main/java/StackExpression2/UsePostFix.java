package StackExpression2;

import StackExpression1.PostFix;

import java.util.Scanner;

public class UsePostFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid postFix Expression:");
        String postFix = sc.next();
        PostFix obj = new PostFix(postFix);
        double ans;
        ans = obj.evaluate();
        System.out.println("Result: "+ans);
    }
    }

