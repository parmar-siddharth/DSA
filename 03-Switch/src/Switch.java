package com.Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fruit Name: ");
        String fruit = input.next();

        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("A red fruit");
            case "orange" -> System.out.println("A orange colour fruit");
            case "grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Enter valid fruit");
        }
    }
}
