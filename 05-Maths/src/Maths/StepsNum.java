package com.Maths;
// Leetcode Q no 1342
import java.util.Scanner;

public class StepsNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();

/*
        // my code:
        int steps = 0;
        while (num > 0){
            if (num % 2 == 0){
                num = num / 2;
                steps = steps + 1;
            }else{
                num = num - 1;
                steps = steps + 1;
            }
        }
            System.out.println("No of steps to reduce it zero are: " + steps);

 */
        // optimal soln
        /*
        int steps = 0;
        while (num > 0){
            if (num % 2 == 0){
                num /= 2;
            }else {
                num--;
            }
            steps++;
        }
        System.out.println("No of steps to reduce it zero are: " + steps);

         */

        // optimized soln
        int steps = 0;
        while (num > 0){
            num = (num % 2 == 0) ? num / 2 : num - 1;
            steps++;
        }
        System.out.println(steps);
    }
}
