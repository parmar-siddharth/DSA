package com.Bitwise;

public class ithBitOfaNum {
    public static void main(String[] args) {
        int n = 87;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(ithbitOfaNum(n,5));
    }
    static int ithbitOfaNum(int n,int i){
        return n & (1 << (i - 1));
    }
}
