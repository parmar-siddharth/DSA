package com.recursion;

public class Message {
    public static void main(String[] args) {
        //message();
        // what if we have to print this message 5 times
        message();
        /*
            Introduction to Recursion
            Introduction to Recursion
            Introduction to Recursion
            Introduction to Recursion
            Introduction to Recursion
         */

    }
    static void message(){
        System.out.println("Introduction to Recursion");
        message1();
    }
    static void message1(){
        System.out.println("Introduction to Recursion");
        message2();
    }
    static void message2(){
        System.out.println("Introduction to Recursion");
        message3();
    }
    static void message3(){
        System.out.println("Introduction to Recursion");
        message4();
    }
    static void message4(){
        System.out.println("Introduction to Recursion");
    }
}
