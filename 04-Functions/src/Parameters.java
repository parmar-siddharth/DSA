package com.functions;

public class Parameters {
    public static void main(String[] args) {

        String personalized = greet("Siddharth");
        System.out.println(personalized);

    }

        static String greet(String name) {
            String message = "Hello" + " " +  name;
            return message;
        }
}
