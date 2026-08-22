package com.Arrays;

public class MultidimensionArray {
    public static void main(String[] args) {
        /*
        multidimensional array:
        1 2 3
        4 5 6
        7 8 9
         */

        //2d array:
        //syntax:
        //int[][] arr = new int[3][];

            //or


        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


//        no of columns is not necessary while creating arrays because
//        no of elements inside sub arrays are not static its variable

//        int array[][] = new int[3][];
        int[][] array= {
                {1,2,3}, //0th index
                {5,6},  //1st index
                {7,8,9,10}  //2nd index
        };


    }
}
