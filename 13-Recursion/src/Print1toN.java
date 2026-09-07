package com.recursion;

public class Print1toN {
    static void main(String[] args) {
        printNos(10);
    }

    static void printNos(int n){
        if (n == 0)
            return;

        printNos(n-1);
        System.out.println(n);
    }
}
