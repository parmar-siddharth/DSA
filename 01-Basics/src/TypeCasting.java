package com.Basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);
//

        //input : 85 output:85.0
        //it automatically converted integer into float



        // Automatic type conversion

        int number = 'A';
        System.out.println(number);   //output : 65
        //ASCII code
        //Java follows uni code and any language can be used in java
        System.out.println("नमस्ते");  //output: नमस्ते

        //Conditions for Automatic Type conversion
        //1. Two types should be compatible for conversion
        // eg: int -> float
        //2. The destination type should be greater than source type
        //eg: float > int



        //Type Casting (conversion for incompatible data type)
        int num = (int) (58.25f);
        System.out.println(num);

        // output: 58



        //Automatic type conversion in expression

        //  for eg: byte can store from -128 to 127....not more than that its range is 0-256
        // if we do type casting from int to byte with a value > 256 then what will be the output
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);   //output: 1

        // 257 % 256 = 1
        // it gives the remainder as output

        // so when we solve expressions what will be the output
        byte x = 50;
        byte y = 75;
        byte z = 100 ;

        int Result = (x*y)+z;
        System.out.println(Result);

        // byte can store upto 256 values then how is solving the expression

        // here comes the automatic type conversion

        // Java automatically promotes type while solving any expression

    }
}
