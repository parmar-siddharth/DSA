package com.recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {14,21,24,27,29};
        System.out.println(search(arr,14,0,arr.length-1));
    }
    static int search(int[] arr,int target,int start,int end){
        if (start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target){
            return mid;
        }
        else if (arr[mid] < target){
            return search(arr,target,mid + 1,end);
        }
        else {
            return search(arr,target,start,mid - 1);
        }
    }
}
