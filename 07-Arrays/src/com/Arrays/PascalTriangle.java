package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    static void main(String[] args) {
        int[][] nums = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
        System.out.println(nCr(2,1));
        printNthRow(6);
        System.out.println(generate(6));
    }
    // Q. Find element in the pascal triangle:
    static int nCr(int n,int r){
        int res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n-i);
            res /= i+1;
        }
        return res;
    }

    //print any nth row of pascal triangle
    // Nth row contains Nth elements
    static void printNthRow(int row){
        int ans = 1;
        System.out.print(ans + " ");
        for (int col = 1; col < row; col++) {
            ans *= (row- col);
            ans /= col;
            System.out.print(ans + " ");
        }
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
