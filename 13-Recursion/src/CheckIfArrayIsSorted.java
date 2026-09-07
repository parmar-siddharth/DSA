package com.recursion;

public class CheckIfArrayIsSorted {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(checkIfArrayIsSorted(arr,0));
    }
    static boolean checkIfArrayIsSorted(int[] arr,int index) {
        if (index == arr.length-1)
            return true;

        return arr[index] < arr[index + 1] && checkIfArrayIsSorted(arr, index + 1);
    }
}
