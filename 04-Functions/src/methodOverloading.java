package com.functions;

public class methodOverloading {
    public static void main(String[] args) {
        result(800); // when we pass argument it automatically decides which function to call
        result("siddharth");

            // we cannot pass empty function in case of method overriding
    }
    static void result(int num){
        System.out.println(num);
    }

    static void result(String name){
        System.out.println(name);
    }
}

/*
function with same namme and diffent parameters is called function overriding
 */