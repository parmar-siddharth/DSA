package com.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9 };
        System.out.println(missingNumber(arr));
    }
    //if array contains elements o to n
//    static int missingNumber(int[] arr) {
//        int xor = 0;
//        int i = 0;
//        for (i = 0; i < arr.length; i++) {
//            //xor = xor^i^arr[i];
//            xor ^= i^arr[i];
//        }
//        return xor^i;
//    }

    // if array contains elements 1 to n
    static int missingNumber(int[] arr) {
        int xor = 0;
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            //xor = xor^i^arr[i];
            xor ^= (i+1)^arr[i];
        }
        return xor^(i+1);
    }
}
