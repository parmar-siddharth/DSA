package com.LinearSearch;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {18,12,9,14,77,50};
        int target = input.nextInt();

        System.out.println("element found at index pos: " + linearSearch(array,target));
    }

        static int linearSearch(int[] arr, int target){
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == target){
                    return i;  //found element
                }
            }
            return -1; // not found element
        }
}
