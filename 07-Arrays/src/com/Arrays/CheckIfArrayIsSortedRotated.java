package com.Arrays;

public class CheckIfArrayIsSortedRotated {
    static void main(String[] args) {

    }
    /*
    Approach:
    If array is sorted than i < i+1
    and if array is rotated then this condition will be violated only once
    eg: arr = {3,4,5,1,2}
    5,1 here the rule is violated
    so this array is rotated
    but we have to keep in mind that this condition should fail only one time or 0 time
    if it is more than 1 time than it is either not sorted or not rotated.
     */
    static boolean check(int[] arr){
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] > arr[(i+1) % n]){ // % n to check last and 0th index
                count++;                 // eg: n = 4 and last elem i = 3 then 3+1 % 4 = 0
            }
        }
        return count <= 1;
    }
}
