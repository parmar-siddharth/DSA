package com.recursion;

public class BeforeAfterRecursionCall {
    static void main(String[] args) {
        //printBeforeRecursion(10);
        printAfterRecursion(10);
    }
    static void printBeforeRecursion(int a){
        if (a == 0){
            return;
        }
        System.out.println(a);
        printBeforeRecursion(a-1);
    }
    static void printAfterRecursion(int a){
        if (a == 0){
            return;
        }
        printAfterRecursion(a-1);
        System.out.println(a);
    }
}
