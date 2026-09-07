package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Std{
    int age;
    String name;

    Std(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return age + " " + name;
    }
    }
public class LaunchComparator {
    public static void main(String[] args) {
        ArrayList<Std> arrayList = new ArrayList<>();
        arrayList.add(new Std(22,"sid"));
        arrayList.add(new Std(17,"Aman"));
        arrayList.add(new Std(26,"Piyush"));
        arrayList.add(new Std(36,"naman"));
        arrayList.add(new Std(47,"sumit"));
        System.out.println(arrayList);
       // [22 sid, 17 Aman, 26 Piyush, 36 naman, 47 sumit]

        Comparator<Std> byAge = (a,b) -> a.age - b.age;
        Collections.sort(arrayList,byAge);
        System.out.println(arrayList);
        //[17 Aman, 22 sid, 26 Piyush, 36 naman, 47 sumit]
        Comparator<Std> byName = (a,b) -> a.name.compareTo(b.name);
        Collections.sort(arrayList,byName);
        System.out.println(arrayList);
        //[17 Aman, 26 Piyush, 36 naman, 22 sid, 47 sumit]
    }
}
