package com.Basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.println("Enter your name below");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("your user id is " + name+"@user");


    }
}
