package com.Maths;
// Leetcode Q no 258
import java.util.Scanner;

public class AddDigit {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
//        System.out.println(Result(num));
        System.out.println(addDigits(num));

    }
//   static int Result(int num){
//       if(num == 0) return 0;
//       else if(num % 9 == 0) return 9;
//       else return num % 9;
//   }

    /*
    digital root concept:
    o has a digital root 0
    numbers which are divisible by 9 have always digital root as 9
    number which are neither divisible by 9 nor 0 have digital root number % 9 , basically the remainder we get after
    dividing the number by 9.
     */

    static int addDigits(int num){
        if (num == 0) return 0;
        else if (num < 10) return num;
        return addDigits((num/10) + (num%10));
    }
}
