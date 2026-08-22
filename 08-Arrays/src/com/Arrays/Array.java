package com.Arrays;

public class Array {
    public static void main(String[] args) {

        //Syntax of an Array
        int[] rollno = new int[5];
        System.out.println(rollno[3]); // output: 0
        // primitive data type like int  have o as default value
        // or directly
        int[] rno = {59,69,89,48,69};
        System.out.println(rno[2]);

        //String
        String[] rolnos = new String[10];
        System.out.println(rolnos[2]); // output: null
        // Non-primitive data types have null as defualt value
    }
}
