package com.Bitwise;
// Leetcode Q.no : 7
import java.util.Scanner;

public class ReverseInt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();

        int ans = reverse(num);
        System.out.println(ans);
    }

    static int reverse(int num) {
        int reverse = 0;

        while (num != 0) {
            int lastDigit = num % 10;

            if (reverse > Integer.MAX_VALUE / 10 ||
                    (reverse == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }

            if (reverse < Integer.MIN_VALUE / 10 ||
                    (reverse == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
        return reverse;
    }
}
