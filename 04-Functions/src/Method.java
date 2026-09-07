package com.functions;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Sum();
    }
        static void Sum(){    // any thing you want to use in static that should also be static
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int num1 = input.nextInt();
            System.out.println("Enter second number: ");
            int num2 = input.nextInt();
            int sum = num1 + num2;
            System.out.println("The Sum of "  + num1 + " " + "+" + " " + num2  + " " + "is" + " " + sum);
        }

            // Static method belongs to class not to objects.

    /*
     syntax of a Method :

            return_type name(){
                //body
                return statement;
            }
     */
}
