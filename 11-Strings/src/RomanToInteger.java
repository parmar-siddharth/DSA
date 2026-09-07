package com.string;

public class RomanToInteger {
    static void main(String[] args) {
        String s = "DCXXI";
        System.out.println(romanToInt(s));
    }
    static int romanToInt(String s) {
        int sum = 0;
        char[] c = s.toCharArray();
        int n = c.length;
        int i = 0;
        while(i < n){
            if(i < n-1 && c[i] == 'I'){
                if (c[i+1] == 'V'){
                    sum += 4;
                    i += 2;
                }
                else if(c[i+1] == 'X'){
                    sum += 9;
                    i += 2;
                }
                else {
                    sum += 1;
                    i++;
                }
                continue;
            }
            if (i < n-1 && c[i] == 'X'){
                if (c[i+1] == 'L'){
                    sum += 40;
                    i += 2;
                }
                else if (c[i+1] == 'C') {
                    sum += 90;
                    i += 2;
                }
                else {
                    sum += 10;
                    i++;
                }
                continue;
            }
            if (i < n-1 && c[i] == 'C'){
                if (c[i+1] == 'D'){
                    sum += 400;
                    i += 2;
                }
                else if (c[i+1] == 'M') {
                    sum += 900;
                    i += 2;
                }
                else {
                    sum += 100;
                    i++;
                }
                continue;
            }
            if (c[i] == 'V') sum += 5;
            if (c[i] == 'L') sum += 50;
            if (c[i] == 'D') sum += 500;
            if (c[i] == 'M') sum += 1000;
            if (c[i] == 'I') sum += 1;
            if (c[i] == 'X') sum += 10;
            if (c[i] == 'C') sum += 100;
            i++;
        }
        return sum;
    }
}
