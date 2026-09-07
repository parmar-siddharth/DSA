package com.functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PassByReference {
    public static void main(String[] args) {


      /*
        int x = 10;

        int c = x;

        System.out.println(c);


         For primitive data types:

         Here c will get the copy of the value of x ... if any changes made on c will not affect x
         In primitive data types like int,char,short,double,float etc copy of value is passed
         not the address of the variable of the value.. so orignal one rests unchanged.
        */

/*
         String name  = "sid";
         changeName(name);
         System.out.println(name);

        output :
        siddharth
        sid


          static void changeName(String naam){
            naam = "siddharth";
            System.out.println(naam);
        }

        For String data types:

        Strings is a non primitive data type so whenever a method is called then copy of its reference/address is passed
        but in java strings are immutable (unchangable) , that  why the orignal string didn't get modified
        instead of it , a new string is created

        // here in example name and naam are pointing towards sid but naam is immutable , it cannot be modified
        // so a new String is created


        For non primitive data types:

        objects/arrays are a non primitive data type
        so whenever a method is called then copy of its reference/address is passed
        and it modifies the orignal value

        int[] arr = {1,2,3,4,5};
        nums(arr);
        System.out.println(Arrays.toString(arr));
    }

    // output: [100, 2, 3, 4, 5]

      static void nums(int[] array){
        array[0] = 100;
      }
 */
    }
}

