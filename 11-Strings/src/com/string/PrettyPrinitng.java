package com.string;

public class PrettyPrinitng {
    public static void main(StringBasics[] args) {
        float a = 45.2568f;
        System.out.printf("formatted no is %.2f",a); //45.26

        // % => placeholder
        // .2f means till 2 decimal values

        System.out.printf("Pie value is %.2f",Math.PI);
        System.out.println();

        System.out.printf("My Name is %s and i am a %s","sid","cs undergrad");
    }
}
