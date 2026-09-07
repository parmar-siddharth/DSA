package com.Basics;

public class AutomaticTypeCasting {
    public static void main(String[] args) {
        byte b = 42;
        int i = 500;
        char c = 'x';
        short s = 4542;
        double d = 0.25969;
        float f = 52.25f;
        System.out.println((b*i) + " " + (d+f) + " " + (s*c));
        System.out.println((i+d) +  " " + (c*b) + " " + (f-s));

        // whichever is bigger datatype the output will be in that datatpe.
    }
}
