package com.Iterations;

public class Conditionals {
    public static void main(String[] args) {


        /*
        Syntax of if statements:
        if (boolean expression T or F){
        // body
        } else {
        // do this
        }
         */


        int salary = 25000;
        if (salary > 10000) {
            salary += 5000;
        } else if (salary > 15000) {
            salary += 10000;
        } else {
            salary += 3000;
        }

        System.out.println(salary);
    }
}
