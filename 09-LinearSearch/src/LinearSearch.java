package com.LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int[] arr = {85,69,74,25,36,98,55};
        System.out.println("Enter the Target Element: ");
        int target = input.nextInt();
        System.out.println(inArray(arr,target));
    }

    //return value if inside array otherwise -1
    static int inArray(int[] arr, int target){
        //using enhanced for loop
     for (int n : arr){
         if (n == target){
             return target;
         }
     }
        return -1;
    }
}
