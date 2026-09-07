package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collections1 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("System Design");
        courses.add("DSA");
        courses.add("Full Stack Dev");
        courses.add("Gen AI");
        courses.add("SpringBoot");
        System.out.println(courses); //[java, System Design, DSA, Full Stack Dev, Gen AI, SpringBoot]

        Collections.shuffle(courses);
        int info = Collections.frequency(courses,"java");
        System.out.println(info);
        Collections.sort(courses); //[DSA, Full Stack Dev, Gen AI, Java, SpringBoot, System Design]
        System.out.println(courses); //[Gen AI, Full Stack Dev, System Design, DSA, SpringBoot, java]
    }
}
