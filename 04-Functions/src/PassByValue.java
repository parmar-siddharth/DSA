package com.functions;

public class PassByValue {
    public static void main(String[] args) {
        String name = "sid";
        changeName(name);
        String newName = "george";
        changeName(newName);
//        System.out.println(name);
    }
/*
        In java there is nothing like pass by reference
        there is only pass by value
        Here we have create a new string variable and named it as name and passed "sid" in it
        but when we call the method changeName and pass string name as a parameter inside it
        then it gets a copy of the value of name i.e "sid"
        and method gets this copy and it creates a new string ....
        // as string is a immutable object
        // a string cannot be modified in java
        // that why the values didn't get changed and we get the same output
 */
    static void changeName(String naam){
//            naam = "Siddharth";
        System.out.println("my name is " + naam);
    }
}
