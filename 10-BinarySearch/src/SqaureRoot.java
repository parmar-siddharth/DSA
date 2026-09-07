package com.BinarySearch;

public class SqaureRoot {
    public static void main(String[] args) {
        System.out.println(srqt(170));
    }
    static int srqt(int x){
        if(x < 2){
            return x;
        }

        // taking start and end range...from 1 to x
        int start = 1;
        int end = x;
        while(start <= end){
            int mid = start + (end - start) / 2;
            long val = (long) mid * mid;
            //conditions:
            if (val == x){
                return mid;
            }
            else if(val < x){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return end;
    }
}
