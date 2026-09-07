package com.Switch;

import java.util.Scanner;

public class NestedCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter empID: ");
        int empID = input.nextInt();

        switch(empID){
            case 1:
                System.out.println("Siddharth parmar");
                break;

            case 2:
                System.out.println("sam ahuja");
                break;

            case 3:
                System.out.println("Enter Department");
        String Department = input.next();
                switch (Department){
                    case "IT":
                        System.out.println("IT department");
                        break;

                    case "Mechanical":
                        System.out.println("Mechanical Department");
                        break;

                    default:
                        System.out.println("invalid Department");
                }
                break;

            default:
                System.out.println("Invalid empId");
        }
    }
}
