package com.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class info{
    int no;
    String name;
    String city;

    info(int no,String name,String city){
        this.no=no;
        this.name=name;
        this.city=city;
    }

    @Override
    public String toString() {
        return no  + " " + name + " " + city;
    }
}
public class LaunchHashMap2 {
    public static void main(String[] args) {
        HashMap<Integer,info> hm = new HashMap<>();
        hm.put(1,new info(1,"Rahul","Delhi"));
        hm.put(2,new info(17,"Satyam","Jaipur"));
        hm.put(3,new info(12,"Xavier","Kerala"));
        System.out.println(hm);
        //{1=1 Rahul Delhi, 2=17 Satyam Jaipur, 3=12 Xavier Kerala}

//        Comparator<info> byName = (a,b) -> a.name.compareTo(b.name);
//        Collections.sort(hm,byName);
        // we cannot sort a hashmap directly
        // we have to convert it into a list

        // coverted it in a list
        ArrayList<info> list = new ArrayList<>(hm.values());
        System.out.println(list);
        //[1 Rahul Delhi, 17 Satyam Jaipur, 12 Xavier Kerala]

        //comparator
        //Comparator<info> byCity = (a,b) -> a.city.compareTo(b.city);
        Comparator<info> byNo = (a,b) -> a.no - b.no;
        Collections.sort(list,byNo);
        System.out.println(list);
        //[1 Rahul Delhi, 12 Xavier Kerala, 17 Satyam Jaipur]
    }
}
