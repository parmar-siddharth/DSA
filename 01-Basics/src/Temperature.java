package com.Basics;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the temp in Celsius: ");
        float c = input.nextFloat();

        float f = ( c * 9/5) + 32;

        System.out.println("Temp in Fahrenheit is :" + f);
    }
}
