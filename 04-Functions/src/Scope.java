package com.functions;

import java.util.Scanner;

public class Scope {
    static String name = "siddharth";   // this is a global scope
    // global scope : anything declared inside the  global scope can be used outside and redeclared outside the block
    public static void main(String[] args) {
            int a = 10;
            int b = 20;
        System.out.println(a);
//        printNumber();
        {
            a = 100 + a;  // a main() ka local variable h isliye it can be used anywhere in main
            System.out.println(a);
            name = "sid";
            System.out.println(name);
        }
    }
/*
               🧠 One-line Trick to Remember
               ===============================

               Method / block ke andar → Local

               Class ke andar, method ke bahar → Global
 */
    static void printNumber(){
        int x = 100;
        System.out.println(x);
    }
}
