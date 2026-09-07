package com.collection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTimeAPI {
    public static void main(String[] args) {
        //Earlier to work with date and time we have classes in utill,sql package
        // Date DateTime deprecated
        //Joda API ==> Time API ==> 9 introduced

        //Joda time is a External Library
        //Java time is a built in library but it is deprecated

        //Java time ==>
        Date dateTime = new Date();
        System.out.println(dateTime);
        //Fri May 15 20:48:46 IST 2026
        System.out.println(dateTime.getHours()); //20
        System.out.println(dateTime.getMonth()); //4

        //New Method
        // Current Date
        LocalDate date = LocalDate.now();
        System.out.println(date);  //2026-05-15

        //Customized Date
         LocalDate dob = LocalDate.of(2004, 6,9);
        System.out.println(dob); //2004-06-09

        //Current time
        LocalTime time = LocalTime.now();
        System.out.println(time); //20:57:39.177420600

        // Date Time
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); //2026-05-15T20:58:11.483151200
        System.out.println(ldt.getDayOfMonth()); //15
        System.out.println(ldt.getDayOfYear());  //135
        System.out.println(ldt.getMonth());      //MAY
        System.out.println(ldt.getYear());       //2026


    }
}
