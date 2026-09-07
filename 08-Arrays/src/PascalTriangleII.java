package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    static void main(String[] args) {
        System.out.println(getRow(3));
    }
    static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long ans = 1;
        list.add((int) ans);
        for (int col = 1; col <= rowIndex; col++) {
            ans *= rowIndex + 1 - col;
            ans /= col;
            list.add((int) ans);
        }
        return list;
    }
}
