package com.LinearSearch;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {18,12,-7,3,14,28,89,74,25,30,51,70,96,24,65,36,74,87};
        System.out.println("Enter the Start range:");
        int start = input.nextInt();
        System.out.println("Enter the end range: ");
        int end = input.nextInt();
        System.out.println("Enter the target item: ");
        int target = input.nextInt();
        System.out.println("Element is at index pos: " + inRange(arr,start,end,target));
    }
    static int inRange(int[] arr,int start,int end,int target){
        for (int i = start; i < end; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
