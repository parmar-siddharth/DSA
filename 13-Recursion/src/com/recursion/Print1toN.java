package com.recursion;

public class Print1toN {
    static void main(String[] args) {
        printNos(100);
    }

    static void printNos(int n){
        if (n > 0){
            printNos(n-1);
            System.out.print(n + " ");
        }
    }
}
