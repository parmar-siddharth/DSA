package com.functions;

public class Shadowing {
    static int num = 1000;
    public static void main(String[] args) {
        System.out.println(num);
        int num = 2000;
        System.out.println(num);  // the class variable num will be shadowed at line 8
        // after this line it will get back to its orignal value
        giveValue();
    }
    static void giveValue(){
        System.out.println(num);
    }
}

/*
        output:
        1000
        2000
        1000
 */
