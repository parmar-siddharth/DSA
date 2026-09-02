package com.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumAlternateSum {
    static void main(String[] args) {
        long n = 10;
        System.out.println(Alternate(n));
        ArrayList<Integer> list = new ArrayList<>();
    }
    static int Alternate(long n){
        ArrayList<Integer> list = new ArrayList<>();
        while(n > 0){
            int digit = (int) n % 10;
            list.add(0,digit);
            n = n / 10;
        }

        long max = 0;

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0){
                max += list.get(i);
            }
            else {
                max -= list.get(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> temp = new ArrayList<>(list);
            temp.remove(i);

            long sum = 0;

            for (int j = 0; j < temp.size(); j++) {
                if (j % 2 == 0){
                    sum += temp.get(j);
                }
                else {
                    sum -= temp.get(j);
                }
            }
            max = Math.max(max,sum);
        }
        return (int) max;
    }
}
