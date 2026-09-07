package com.collection;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return age + " " + name;
    }

    //default sorting logic
    public int compareTo(Student s){ // java will compare this obj and another student object
        return this.age - s.age;
        /*
        // eg: this.age = 22 and s.age = 17 ==> 22-17 => 5
        negative -> current object smaller
        positive -> current object bigger
        0 -> equal
         */
    }
}
public class comparable {
    public static void main(String[] args) {
        // comparable ==> Defualt sorting , single sorted always not multiple
        // for multiple comparison we use comparartor
        //eg: I Always want students sorted by age
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(22,"sid"));
        arrayList.add(new Student(17,"Aman"));
        arrayList.add(new Student(26,"Piyush"));
        System.out.println(arrayList);
        //[22 sid, 17 Aman, 26 Piyush]

        Collections.sort(arrayList);
        System.out.println(arrayList);
        //[17 Aman, 22 sid, 26 Piyush]
    }
}