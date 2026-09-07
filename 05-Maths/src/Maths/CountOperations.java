package com.Maths;
// Leetcode Q no: 2169
import java.util.Scanner;

public class CountOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = input.nextInt();
        System.out.println("Enter num2");
        int num2 = input.nextInt();

        int count = 0;
        while(num1 > 0 && num2 > 0){
            if(num1 >= num2){
                num1 = num1 - num2;
            }else{
                num2 = num2 - num1;
            }
            count++;
        }
        System.out.println(count);
    }

}
