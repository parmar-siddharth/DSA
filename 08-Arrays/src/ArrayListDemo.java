package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(57);
        list.add(35);
        list.add(15);
        list.add(98);

//        System.out.println(list);  o/p: [57, 35, 15, 98]


//      how to add values in ArrayList:
//      using varaibleName.add(val);


        ArrayList<String> listtwo = new ArrayList<>();
        listtwo.add("ohh yeah");
        listtwo.add("sid");
        listtwo.add("hello");
//        System.out.println(listtwo);   o/p : [ohh yeah, sid, hello]

//      .contain() : to check whether the value is present or not
        System.out.println(listtwo.contains("sid"));   // true

//       .set(index position , value) : to update the values
        listtwo.set(0,"nice");
        System.out.println(listtwo);   //[nice, sid, hello]

        ArrayList<Integer> newList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

// to add items inside ArrayList using for loop:

        for (int i = 0; i < 5; i++){
            System.out.println("enter the value to add: ");
            newList.add(input.nextInt());
        }

//  to print ArrayList using for loop:

        for (int i = 0; i < 5; i ++){
            System.out.println("Enter the index position: ");
            System.out.println(newList.get(input.nextInt()));
        }
    }
}
