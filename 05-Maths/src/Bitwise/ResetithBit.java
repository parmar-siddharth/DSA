package com.Bitwise;

public class ResetithBit {
    public static void main(String[] args) {
        int n = 87;
        System.out.println(Integer.toBinaryString(n));
        int res = setBit(n,4);
        System.out.println(Integer.toBinaryString(res));
    }
    static int setBit(int n,int i){
        return n ^ (1 << (i - 1));
    }
}
