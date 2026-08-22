package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    static void main(String[] args) {
        int[][] nums = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
        System.out.println(nCr(5,3));
        System.out.println(printNthRow(4));
        System.out.println(printnthRow(4));
        System.out.println(generate(6));
    }
    // Q. Find element in the pascal triangle:
    static int nCr(int row,int col){
        int res = 1;
        for (int i = 1; i < col; i++) {
            res *= (row-i);
            res /= i;
        }
        return res;
    }

    //print any nth row of pascal triangle
    // Nth row contains Nth elements like 4th row contains 4 elements
    // this is solution when indexing starts from 1
    static List<Integer> printNthRow(int row){
        List<Integer> list = new ArrayList<>();
        int ans = 1;
        list.add(ans);
        for (int col = 1; col < row; col++) {
            ans *= (row - col);
            ans /= col;
            list.add(ans);
        }
        return list;
    }

    // if the pascal triangle is 0 indexed then we will just 2 things:
    // 1. at the time of multiplication add +1 to row
    // 2. run loop till <= row
    static List<Integer> printnthRow(int row){
        List<Integer> list = new ArrayList<>();
        int ans = 1;
        list.add(ans);
        for (int col = 1; col <= row; col++) {
            ans *= (row + 1 - col);
            ans /= col;
            list.add(ans);
        }
        return list;
    }
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int row = 1; row < numRows; row++) {

            List<Integer> list = new ArrayList<>();

            int ans = 1;
            list.add(ans);

            for (int col = 1; col < row; col++){
                ans = ans * (row-col);
                ans = ans / col;
                list.add(ans);
            }
            res.add(list);
        }
        return res;
    }
}
