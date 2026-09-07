package com.functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(45,454,458,789,669);
        multiple(1,5,"sid","hello","name");
    }
    /*
    if we dont how many variable you are passing in the paramter then we write the data type then three dots and name of tha array
    when we write int...v or string...a then internally java consider it as array
     */
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
    // ouptut: [45, 454, 458, 789, 669]
    // we can pass 'n' numbers of args inside it of any datatype like int , char ,string etc

    static void multiple(int a , int b , String...v){

    }
}
