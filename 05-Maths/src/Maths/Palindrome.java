package com.Maths;
// Leetcode Q no 9
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        System.out.println(isPalindrome(n));
    }
        static boolean isPalindrome(int x) {
            if(x < 0){
                return false;
            }
            int rev = 0;
            int  num= x;

            while (num!= 0) {
                rev= rev*10 + num%10;
                num=num/10;
            }

            return (rev == x);
        }
}