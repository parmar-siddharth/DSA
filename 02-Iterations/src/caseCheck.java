package com.Iterations;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter = input.next().trim().charAt(0);

        if (letter >= 'a' && letter <= 'z'){
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }


        // condition check
//         && -> it checks whether the multiple conditions are correct or not ....if all the conditions are true..
//         them the below code will eun

//         || -> if atleast  one condition is true then also it will run the below code

//         != -> not equals to
    }
}
